# Project 5 — Custom Environment Variables Pipeline

**Concept taught:** Jenkins' built-in environment variables (BUILD_NUMBER,
JOB_NAME, WORKSPACE) are automatic. This project introduces **custom**
ones — variables the student defines themselves in an `environment` block,
which then become available to every stage in the pipeline (and to the
Java program itself, via `System.getenv()`).

## Files
- `src/ExamEvaluationApp.java` — reads `APP_NAME` and `APP_VERSION` from
  the OS environment and prints them.
- `Jenkinsfile` — defines `APP_NAME` and `APP_VERSION` once, at the top,
  and reuses them in two different stages.

## Execution procedure
1. Push this folder to your GitHub repo.
2. In Jenkins, create a new Pipeline job pointing to this repo.
3. Click **Build Now**.
4. Open **Console Output** — confirm `APP_NAME` and `APP_VERSION` appear
   correctly in both the "Show App Info" stage and the "Build & Run" stage,
   even though they were only defined once, at the top of the file.
5. Change `APP_VERSION` to `'2.0.0'` in the Jenkinsfile, push, and rebuild —
   show that both stages automatically pick up the new value.
6. Compare with a built-in variable like `BUILD_NUMBER`: here, *you* chose
   the variable names and values; with `BUILD_NUMBER`, Jenkins decided both
   automatically.
