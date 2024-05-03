package Exam;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shipWidth = Double.parseDouble(scanner.nextLine());
        double shipLenght = Double.parseDouble(scanner.nextLine());
        double shipHight = Double.parseDouble(scanner.nextLine());
        double astronaughtsMidHight = Double.parseDouble(scanner.nextLine());

        double shipsVol = shipWidth * shipLenght * shipHight;
        double roomVol = (astronaughtsMidHight + 0.40) * 2 * 2;
        double roomForPersons = Math.floor(shipsVol / roomVol);
        if (roomForPersons > 3 && roomForPersons < 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", roomForPersons);
        } else if (roomForPersons < 3) {
            System.out.println("The spacecraft is too small.");
        }else if (roomForPersons > 10){
            System.out.println("The spacecraft is too big.");
        }

    }
}
