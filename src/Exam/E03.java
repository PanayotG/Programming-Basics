package Exam;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeCat = scanner.nextLine();
        String genderCat = scanner.nextLine();
        int catMonths = 0;
        if(typeCat.equals("British Shorthair")){
            if (genderCat.equals("m")){
                catMonths = (13 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (14 * 12) / 6;

            }

        } else if (typeCat.equals("Siamese")) {
            if (genderCat.equals("m")){
                catMonths = (15 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (16 * 12) / 6;

            }

        } else if (typeCat.equals("Persian")) {
            if (genderCat.equals("m")){
                catMonths = (14 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (15 * 12) / 6;

            }

        }else if (typeCat.equals("Ragdoll")){
            if (genderCat.equals("m")){
                catMonths = (16 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (17 * 12) / 6;

            }

        } else if (typeCat.equals("American Shorthair")) {
            if (genderCat.equals("m")){
                catMonths = (12 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (13 * 12) / 6;

            }

        } else if (typeCat.equals("Siberian")) {
            if (genderCat.equals("m")){
                catMonths = (11 * 12) / 6;

            } else if (genderCat.equals("f")) {
                catMonths = (12 * 12) / 6;

            }
        }else {
            System.out.printf("%s is invalid cat!", typeCat);
            return;

        }
        System.out.printf("%d cat months", catMonths);


    }
}
