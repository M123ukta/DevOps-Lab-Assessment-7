# Online Examination and Evaluation System — Jenkins CI/CD Assessment

ISWE406P — Agile Development Process & DevOps | Assessment VII

Three Jenkins CI/CD pipeline projects implemented in **Java**, built around
the theme of an Online Examination and Evaluation System. Each project
lives in its own folder with clearly separated source code, its own
`Jenkinsfile`, and its own README explaining the concept and execution
steps (per the assignment's "one repo, clearly separated project folders"
option).

| Folder | Concept | Jenkins feature used |
|---|---|---|
| `project1-parameterized-build/` | Choose deployment environment before build starts | `parameters` (choice) |
| `project3-parallel-stages/` | Run independent module checks at the same time | `parallel` |
| `project5-custom-env-vars/` | Define custom, reusable build variables | `environment` |

See the top-level chat response (or each folder's own README) for full
GitHub + Jenkins setup steps.
