package Exercises_Week03;

import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month= scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceForApartment = 0;
        double priceForTheStudio = 0;
        switch (month){
            case "May":
            case "October":
                priceForApartment = countNights * 65;
                priceForTheStudio = countNights * 50;
                if(countNights > 14){
                    priceForTheStudio = priceForTheStudio * 0.70;
                    priceForApartment = priceForApartment * 0.90;
                }else if (countNights > 7){
                    priceForTheStudio = priceForTheStudio * 0.95;

            }
                break;
            case "June":
            case "September":
                priceForApartment = countNights * 68.70;
                priceForTheStudio = countNights * 75.20;
                if(countNights > 14){
                    priceForTheStudio = priceForTheStudio * 0.80;
                    priceForApartment = priceForApartment * 0.90;
                }
                break;
            case "July":
            case "August":
                priceForApartment = countNights * 77;
                priceForTheStudio = countNights * 76;
                if(countNights > 14){
                    priceForApartment = priceForApartment * 0.90;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv.%n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForTheStudio);

    }
}
