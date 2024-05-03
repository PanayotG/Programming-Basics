package NestedLoopLap_Week06;

import java.util.Scanner;

public class E05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")){
            double tripPrice = Double.parseDouble(scanner.nextLine());

            double availableMoney = 0;
            while (availableMoney < tripPrice){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney = availableMoney + savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }

    }
}
