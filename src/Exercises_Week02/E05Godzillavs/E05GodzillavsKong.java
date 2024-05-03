package Exercises_Week02.E05Godzillavs;

import java.util.Scanner;

public class E05GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countExtra = Integer.parseInt(scanner.nextLine());
        double priceForClothesFor1 = Double.parseDouble(scanner.nextLine());
        double priceForCloths = priceForClothesFor1 * countExtra;
        double decor = budget * 0.1;

        if (countExtra > 150) {
            priceForCloths = priceForCloths * 0.9;
        }
        double finalSum = priceForCloths + decor;
        double difference = Math.abs(finalSum - budget);
        if (finalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }




    }
}
