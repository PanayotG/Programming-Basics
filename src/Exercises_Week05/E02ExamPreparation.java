package Exercises_Week05;

import java.util.Scanner;

public class E02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faildThreshold = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int solvedProblemCount = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (failedTimes < faildThreshold){
            String problemName = scanner.nextLine();
            if("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
        }
        while (failedTimes < faildThreshold){
            String problemName = scanner.nextLine();
            if("Enough".equals(problemName)){
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                failedTimes++;
            }
            gradesSum += grade;
            solvedProblemCount++;
            lastProblem = problemName;
        }
        if(isFailed){
            System.out.printf("You need a break, %d poor grades.", faildThreshold);

        }else {
            System.out.printf("Average score: %.2f%n",gradesSum / solvedProblemCount);
            System.out.printf("Number of problems: %d%n", solvedProblemCount);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
