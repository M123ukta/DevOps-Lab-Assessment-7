/**
 * Project 5: Custom Environment Variables Pipeline
 * Online Examination and Evaluation System
 *
 * Concept demonstrated: custom environment variables defined once in the
 * Jenkinsfile's `environment` block (APP_NAME, APP_VERSION) are available
 * to every stage, and can also be read by the Java program itself via
 * System.getenv(), since Jenkins sets them as real OS environment
 * variables for every step it runs.
 */
public class ExamEvaluationApp {

    public static void main(String[] args) {
        String appName = System.getenv("APP_NAME");
        String appVersion = System.getenv("APP_VERSION");

        if (appName == null) {
            appName = "OnlineExamEvaluationSystem";
        }
        if (appVersion == null) {
            appVersion = "0.0.0";
        }

        System.out.println("Compiling and starting " + appName + ", version " + appVersion);
        System.out.println("Evaluation engine initialized. Ready to process student results.");
    }
}
