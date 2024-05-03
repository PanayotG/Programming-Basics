package Exam;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPainBox = Integer.parseInt(scanner.nextLine());
        int countWallpapers = Integer.parseInt(scanner.nextLine());
        double priceGlove= Double.parseDouble(scanner.nextLine());
        double priceforBrush = Double.parseDouble(scanner.nextLine());

        double priecPainBox = countPainBox * 21.50;
        double priceWallpapers = countWallpapers * 5.20;
        double neededGloves = Math.ceil(countWallpapers * 0.35);
        double neededBrushes = Math.floor(countPainBox * 0.48);

        double priceGloves = neededGloves * priceGlove;
        double priceBrushes = neededBrushes * priceforBrush;

        double allMaterialsPrice = priecPainBox + priceWallpapers + priceGloves + priceBrushes;
        double deliveryCost = allMaterialsPrice / 15;
        System.out.printf("This delivery will cost %.2f lv.", deliveryCost);
    }
}
