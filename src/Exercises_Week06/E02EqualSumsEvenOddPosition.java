package Exercises_Week06;

import java.util.Scanner;

public class E02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNmuber = Integer.parseInt(scanner.nextLine());
        for (int currentNum = firstNumber; currentNum <= secondNmuber; currentNum++) {
            String textNumber = currentNum + "";
            int evenPositionSum = 0;
            int oddPositionSum = 0;
            for (int position = 0; position <= textNumber.length() - 1 ; position++) {
                int currentDigit = Integer.parseInt(textNumber.charAt(position) + "");
                if (position % 2 ==0){
                    evenPositionSum += currentDigit;
                }else {
                    oddPositionSum += currentDigit;
                }
            }
            if (evenPositionSum == oddPositionSum){
                System.out.print(currentNum + " ");
            }
        }

    }
}
