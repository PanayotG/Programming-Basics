package Exercises_Week04;

import java.util.Scanner;

public class E08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int countWins = 0;

        for (int i = 1; i <= countTournaments ; i++) {
            String currentStage = scanner.nextLine();
            switch (currentStage){
                case "W":
                    countWins++;
                    tournamentPoints += 2000;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }
        int allPoints = startingPoints + tournamentPoints;
        int averagePoints = tournamentPoints / countTournaments;
        double percetWins = (countWins * 1.0 / countTournaments) * 100;

        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%%n", percetWins);


    }
}
