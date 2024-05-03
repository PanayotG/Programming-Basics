package NestedLoopLap_Week06;

import java.util.Scanner;

public class E04SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber ; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count, i, j, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }

        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}

