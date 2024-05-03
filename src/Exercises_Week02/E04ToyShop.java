package Exercises_Week02;

import java.util.Scanner;

public class E04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trip = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int teddyBearCount = Integer.parseInt(scanner.nextLine());
        int minionCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzleCount + dollCount + teddyBearCount + minionCount + truckCount;
        double totalSum = puzzleCount * 2.6 + dollCount * 3 + teddyBearCount * 4.1 + minionCount * 8.2 + truckCount * 2;
        if (totalCount >= 50) {
            totalSum = totalSum * 0.75;
        }
        totalSum = totalSum * 0.9;
        if (totalSum >= trip) {
            double restMoney = totalSum - trip;
            System.out.printf("Yes! %.2f lv left.", restMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - totalSum);
        }
    }
}