# Project 1 — Parameterized Build Pipeline

**Concept taught:** pipelines don't have to run the same way every time.
Jenkins can ask for input **before** the build even starts, using the
`parameters` block. The choice is made up front, before Stage 1 runs at all.

## Files
- `src/ExamServerConfig.java` — reads the environment name and prints the
  matching DB URL / port configuration for the Online Exam System.
- `Jenkinsfile` — defines a `choice` parameter (`dev` / `staging` / `prod`)
  and passes it into the Java program as a command-line argument.

## Execution procedure
1. Push this folder (with `Jenkinsfile` at repo root or referenced via
   relative path) to your GitHub repo.
2. In Jenkins, create a new Pipeline job pointing to this repo.
3. Click **Build Now** the first time only — Jenkins doesn't know about the
   `parameters` block until it has read the Jenkinsfile once, so the very
   first run happens without asking for input.
4. From the second run onward, the job's sidebar button changes to
   **Build with Parameters**. Click it — you'll now see a dropdown asking
   you to pick `dev`, `staging`, or `prod` before the build starts.
5. Pick `staging`, run it, then open **Console Output** — confirm the
   printed DB URL and port both correspond to staging.
6. Run it again picking `prod` — show that the exact same Jenkinsfile now
   behaves differently, purely because of the value chosen at trigger time.
