package Exercises_Week03;

import java.util.Scanner;

public class E06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        switch (symbol){
            case "+":
                int sum = number1 + number2;
                if(sum %2 == 0){
                    System.out.printf("%d %s %d = %d - even", number1, symbol, number2, sum);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1, symbol, number2, sum);
                }
                break;
            case "-":
                int diff = number1 - number2;
                if(diff %2 == 0){
                    System.out.printf("%d %s %d = %d - even", number1, symbol, number2, diff);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1, symbol, number2, diff);
                }
                break;
            case "*":
                int result = number1 * number2;
                if(result %2 == 0){
                    System.out.printf("%d %s %d = %d - even", number1,symbol, number2, result);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1,symbol, number2, result);
                }
                break;
            case "/":
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else {
                    double division = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f",number1, number2, division);
                }
                break;
            case "%":
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else{
                    int leftover = number1 % number2;
                    System.out.printf("%d %% %d = %d",number1, number2, leftover);
                }
                break;
        }

    }
}
