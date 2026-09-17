/**
 * Project 3: Parallel Stages Pipeline
 * Online Examination and Evaluation System
 *
 * This class simulates validating the Student Registration module
 * (checking roll number format and login credential rules). It runs
 * independently of QuestionBankValidator, at the same time, in a
 * parallel Jenkins stage.
 */
public class StudentModuleValidator {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running Student Registration module checks...");
        System.out.println("Validating roll number format and login credentials...");
        Thread.sleep(3000);
        System.out.println("Student Module checks passed.");
    }
}
