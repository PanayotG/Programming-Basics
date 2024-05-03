package Exam;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = 1000 * Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumFood = 0;
        while (!command.equals("Adopted")){
            double currentFood = Double.parseDouble(command);
            sumFood = sumFood + currentFood;
            double allFood = sumFood + dogFood;



            command = scanner.nextLine();
        }
        double leftover = Math.abs(dogFood - sumFood);
        if(dogFood >= sumFood){
            System.out.printf("Food is enough! Leftovers: %.0f grams.%n", leftover);

        }else {
            System.out.printf("Food is not enough. You need %.0f grams more.", leftover);
        }

    }
}
