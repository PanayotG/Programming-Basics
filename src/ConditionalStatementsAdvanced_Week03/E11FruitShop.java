package ConditionalStatementsAdvanced_Week03;

import java.util.Scanner;

public class E11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean workingDays = day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday");
        boolean weekend = day.equals("Saturday")
                || day.equals("Sunday");

        boolean validData = true;

        double price = 0;
        if (workingDays) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                validData = false;
            }
        } else if (weekend) {
          if (fruit.equals("banana")) {
              price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
        } else {
            validData = false;
            }
            if (validData) {
                double result = quantity * price;
                System.out.printf("%.2f", result);
            } else {
                System.out.println("error");
            }
        }
    }
}