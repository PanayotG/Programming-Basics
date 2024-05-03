package Exercises_Week04;

import java.util.Scanner;

public class E05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= openTabs; i++) {
            String websiteName =(scanner.nextLine());
           switch (websiteName){
               case "Facebook":
                   salary = salary - 150;
                   break;
               case "Instagram":
                   salary = salary - 100;
                   break;
               case "Reddit":
                   salary = salary - 50;
                   break;
                }
            }

            if (salary <= 0) {
            System.out.println("You have lost your salary.");
        }
            if (salary > 0) {
            System.out.printf("%d", salary);

        }


    }

}
