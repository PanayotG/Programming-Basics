package Exercises_Week02;

import java.util.Scanner;

public class E07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemorys = Integer.parseInt(scanner.nextLine());
        double videoCardPrice = 250;
        double processorsPrice = (videoCards * videoCardPrice) * 0.35;
        double ramMemoryPrice = (videoCards * videoCardPrice) * 0.1;
        double finalSum = (videoCards * videoCardPrice) + (processors * processorsPrice) + (ramMemorys * ramMemoryPrice);
        if (videoCards > processors){
            finalSum = finalSum * 0.85;
        }
        double diff = Math.abs(budget - finalSum);
        if (budget > finalSum){
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
