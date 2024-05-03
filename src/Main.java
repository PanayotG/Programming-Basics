
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        boolean workDay = day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday");
        boolean weekend = day.equals("Saturday")
                || day.equals("Sunday");

        boolean validData = true;

        double price = 0;

        if (workDay) {
            if (fruit.equals("banana")) {
                price = 2.5;
            } else if (fruit.equals("apple")) {
                price = 1.2;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                validData = false;
            }

        } else if (weekend) {
            if (fruit.equals("banana")) {
                price = 2.7;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.9;
            } else if (fruit.equals("grapefruit")) {
                price = 1.6;
            } else if (fruit.equals("kiwi")) {
                price = 3;
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
            } else if (fruit.equals("grapes")) {
                price = 4.2;
            } else {
                validData = false;
            }
        }  else {
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