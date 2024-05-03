package Exercises_Week01;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPensPackage = Integer.parseInt(scanner.nextLine());
        int countHighlightersPackage = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = countPensPackage * 5.80;
        double HighLightersPrice = countHighlightersPackage * 7.20;
        double cleaninAgentPrice = cleaningAgent * 1.20;
        double sumWithoutDiscount = penPrice + HighLightersPrice + cleaninAgentPrice;
        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * discount / 100);
        System.out.println(finalSum);
    }
}
