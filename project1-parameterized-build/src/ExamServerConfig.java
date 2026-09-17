/**
 * Project 1: Parameterized Build Pipeline
 * Online Examination and Evaluation System
 *
 * Concept demonstrated: the deployment environment (dev / staging / prod)
 * is chosen by the user BEFORE the Jenkins build even starts, using a
 * Jenkins "parameters" block. This class simply reads that environment
 * name (passed in as a command-line argument by the Jenkinsfile) and
 * prints out the configuration that would be used for that environment.
 */
public class ExamServerConfig {

    public static void main(String[] args) {
        String environment = (args.length > 0) ? args[0] : "dev";

        String dbUrl;
        String port;

        switch (environment.toLowerCase()) {
            case "prod":
                dbUrl = "jdbc:mysql://prod-db.examsystem.com:3306/exam_db";
                port = "8443";
                break;
            case "staging":
                dbUrl = "jdbc:mysql://staging-db.examsystem.com:3306/exam_db";
                port = "8081";
                break;
            case "dev":
            default:
                dbUrl = "jdbc:mysql://localhost:3306/exam_db_dev";
                port = "8080";
                break;
        }

        System.out.println("=== Online Examination and Evaluation System ===");
        System.out.println("Building configuration for environment: " + environment.toUpperCase());
        System.out.println("Database URL : " + dbUrl);
        System.out.println("Server Port  : " + port);
        System.out.println("Configuration generated successfully.");
    }
}
