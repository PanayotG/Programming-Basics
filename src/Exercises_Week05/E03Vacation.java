package Exercises_Week05;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        int spendingCounter = 0;
        while (currentMoney < neededMoney) {
            if (countDays == 5) {
                break;
            }

            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            countDays++;
            if (command.equals("save")) {
                currentMoney = currentMoney + money;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                currentMoney = currentMoney - money;
                spendingCounter++;
            }
            if (currentMoney < 0) {
                currentMoney = 0;
            }
        }
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        } else {
            System.out.printf("You saved the money for %d days.", countDays);

        }


    }
}
