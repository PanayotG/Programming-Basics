package Exercises_Week03;

import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double totalSum = 0;

        switch (flowersType){
            case "Roses":
                totalSum = countFlowers * 5;
                if (countFlowers > 80){
                    totalSum = totalSum * 0.9;
                }
                break;
            case "Dahlias":
                totalSum = countFlowers * 3.80;
                if (countFlowers > 90){
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Tulips":
                totalSum = countFlowers * 2.80;
                if (countFlowers > 80){
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Narcissus":
                totalSum = countFlowers * 3;
                if (countFlowers < 120){
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Gladiolus":
                totalSum = countFlowers * 2.50;
                if (countFlowers < 80){
                    totalSum = totalSum * 1.20;
                }
                break;

        }
            double diff = Math.abs(budget - totalSum);
            if(budget >= totalSum){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowersType, diff);
            }else {
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }

    }
}
