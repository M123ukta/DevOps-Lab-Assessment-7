# Project 3 — Parallel Stages Pipeline

**Concept taught:** pipeline stages don't have to run one after another —
independent tasks can run **at the same time** using the `parallel` block.

## Files
- `src/QuestionBankValidator.java` — simulates checking the Question Bank module.
- `src/StudentModuleValidator.java` — simulates checking the Student Registration module.
- `Jenkinsfile` — compiles both classes, then runs them **in parallel**
  as two separate stages, then prints a summary.

## Execution procedure
1. Push this folder to your GitHub repo.
2. In Jenkins, create a new Pipeline job pointing to this repo.
3. Click **Build Now**.
4. If your Jenkins has the pipeline visualization view (Stage View / Blue
   Ocean), point out that "Question Bank Check" and "Student Module Check"
   appear **side by side**, not one after the other, and both start at
   roughly the same time.
5. Open **Console Output** — note that lines from both classes are
   interleaved rather than one finishing fully before the other starts.
6. Do the math: each class sleeps for 3 seconds. Run sequentially it would
   take ~6 seconds; run in parallel the whole stage finishes in ~3 seconds —
   the time of the slower one, not the sum of both.
