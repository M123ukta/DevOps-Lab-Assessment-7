/**
 * Project 3: Parallel Stages Pipeline
 * Online Examination and Evaluation System
 *
 * This class simulates validating the Question Bank module (checking
 * question format, marks allotted, and difficulty tags). It is run
 * independently of StudentModuleValidator, in a parallel Jenkins stage.
 */
public class QuestionBankValidator {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running Question Bank module checks...");
        System.out.println("Validating question format, marks, and difficulty tags...");
        Thread.sleep(3000);
        System.out.println("Question Bank checks passed.");
    }
}
