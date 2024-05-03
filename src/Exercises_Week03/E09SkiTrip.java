package Exercises_Week03;

import java.util.Scanner;

public class E09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String assessment = scanner.nextLine();

        double price = 0;
        int overnights = daysOfStay - 1;

        switch (typeRoom) {
            case "room for one person":
                price = overnights * 18.00;
                break;

            case "apartment":
                price = overnights * 25.00;
                if (overnights < 10) {
                    price = price * 0.70;
                } else if (overnights > 10 && overnights < 15) {
                    price = price * 0.65;

                } else if (overnights > 15) {
                    price = price * 0.50;
                }
                break;

            case "president apartment":
                price = overnights * 35.00;
                if (overnights < 10) {
                    price = price * 0.90;
                } else if (overnights > 10 && overnights < 15) {
                    price = price * 0.85;
                } else if (overnights > 15) {
                    price = price * 0.80;
                }
                break;
        }
        if (assessment.equals("positive")) {
            price = price * 1.25;
        } else if (assessment.equals("negative")) {
            price = price * 0.90;
        }
        System.out.printf("%.2f", price);


    }
}