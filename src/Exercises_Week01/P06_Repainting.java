package Exercises_Week01;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThinner = Integer.parseInt(scanner.nextLine());
        int neededHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (neededNylon  + 2) * 1.5;
        double paintPrice = (neededPaint + neededPaint * 0.1) * 14.5;
        double thynnerPrice = neededThinner * 5;

        double totalSumMaterials = nylonPrice + paintPrice + thynnerPrice + 0.4;
        double buildersPrice = (totalSumMaterials * 0.3) * neededHours;
        double totalSum = totalSumMaterials + buildersPrice;
        System.out.println(totalSum);
    }
}

