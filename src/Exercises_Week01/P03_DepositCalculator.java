package Exercises_Week01;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositsum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double InterestRate = Double.parseDouble(scanner.nextLine());

        double profitPerMonth = (depositsum * (InterestRate / 100)) / 12;
        double totalSum = depositsum + profitPerMonth * months;
        System.out.println(totalSum);
    }
}
