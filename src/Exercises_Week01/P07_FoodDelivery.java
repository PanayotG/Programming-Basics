package Exercises_Week01;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.4;
        double vegeterianMenuPrice = vegetarianMenu * 8.15;
        double desertPrice = ( chickenMenuPrice + fishMenuPrice + vegeterianMenuPrice) * 0.2;
        double finalPrice = desertPrice + chickenMenuPrice + fishMenuPrice + vegeterianMenuPrice;
        System.out.println(finalPrice + 2.5);
}
}
