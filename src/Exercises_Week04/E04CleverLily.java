package Exercises_Week04;

import java.util.Scanner;

public class E04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double priceWashingMaichine = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        double sum = 0;
        for (int currentAge = 1; currentAge <= n; currentAge++) {

            if(currentAge % 2 == 0){
                sum = sum + (currentAge * 5 - 1);
            }else {
                countToys++;
            }

        }
        sum += countToys * toysPrice;
        double diff = Math.abs(sum - priceWashingMaichine);
        if(sum >= priceWashingMaichine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }


    }
}
