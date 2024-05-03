package Exercises_Week04;

import java.util.Scanner;

public class E06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countJudges = Integer.parseInt(scanner.nextLine());
        double sumAllPoints = pointsFromAcademy;

        for (int i = 1; i <= countJudges; i++) {
            String nameOfJudge = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());

            sumAllPoints += (nameOfJudge.length() * currentPoints) / 2;

            if(sumAllPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
                break;
            }
        }



        if (sumAllPoints < 1250.5){
            double diff = 1250.5 - sumAllPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff );
        }

    }
}
