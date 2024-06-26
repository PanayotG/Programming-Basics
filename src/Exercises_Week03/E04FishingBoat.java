package Exercises_Week03;

import java.util.Scanner;

public class E04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());

        String season = scanner.nextLine();

        int fishermans = Integer.parseInt(scanner.nextLine());

        double boatPrice =0;
        switch (season){
            case "Spring":
                boatPrice = 3000;
                if(fishermans <= 6){
                    boatPrice = boatPrice * 0.9;
                } else if (fishermans >= 7 && fishermans<= 11) {
                    boatPrice = boatPrice * 0.85;
                }else {
                    boatPrice = boatPrice * 0.75;
            }
                break;
            case "Summer":
                boatPrice = 4200;
                if(fishermans <=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fishermans >= 7 && fishermans<= 11) {
                    boatPrice = boatPrice * 0.85;
                }else {
                    boatPrice = boatPrice * 0.75;
                }
                break;
            case "Autumn":
                boatPrice = 4200;
                if(fishermans <=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fishermans >= 7 && fishermans<= 11) {
                    boatPrice = boatPrice * 0.85;
                }else {
                    boatPrice = boatPrice * 0.75;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if(fishermans <=6){
                    boatPrice = boatPrice * 0.9;
                } else if (fishermans >= 7 && fishermans<= 11) {
                    boatPrice = boatPrice * 0.85;
                }else {
                    boatPrice = boatPrice * 0.75;
                }
                break;

            }
        if (fishermans %2 == 0 && (!season.equals("Autumn"))) {
            boatPrice = boatPrice * 0.95;
        }
        double diff = Math.abs(budget - boatPrice);
        if (budget >= boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
