package Exam;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCats = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double foodCats = 0;
        for (int i = 1; i <= countCats ; i++) {
            double foodCat = Double.parseDouble(scanner.nextLine());
            foodCats = foodCats + foodCat;


            if(foodCat >= 100 && foodCat < 200){
                group1++;
            } else if (foodCat >= 200 && foodCat < 300) {
                group2++;
            } else if (foodCat >= 300 && foodCat < 400) {
                group3++;
            }

        }
        double finalPrice = (foodCats / 1000) * 12.45;

        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", finalPrice);
    }
}
