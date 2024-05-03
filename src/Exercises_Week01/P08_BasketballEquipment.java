package Exercises_Week01;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int feePerYear = Integer.parseInt(scanner.nextLine());

        double shoesPrice = feePerYear - feePerYear * 0.4;
        double suitePrice = shoesPrice - shoesPrice * 0.2;
        double ballPrice = suitePrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double finalPrice = feePerYear + shoesPrice + suitePrice + ballPrice + accessoriesPrice;
        System.out.println(finalPrice);


    }
}
