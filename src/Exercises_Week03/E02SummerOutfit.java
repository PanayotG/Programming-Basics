package Exercises_Week03;

import java.util.Scanner;

public class E02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        if ("Morning".equals(dayTime)) {
            if (degree >= 10 && degree <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degree > 18 && degree <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
        }




        if ("Afternoon".equals(dayTime)) {
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree > 18 && degree <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
            System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
            }



        if ("Evening".equals(dayTime)) {
                    if (degree >= 10 && degree <= 18) {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } else if (degree > 18 && degree <= 24) {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    } else {
                        outfit = "Shirt";
                        shoes = "Moccasins";
                    }

                    System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
                }
            }
        }