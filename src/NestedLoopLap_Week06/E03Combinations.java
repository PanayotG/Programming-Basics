package NestedLoopLap_Week06;

import java.util.Scanner;

public class E03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int one = 0; one <= n ; one++) {
            for (int two = 0; two <= n ; two++) {
                for (int three = 0; three <= n ; three++) {
                    int result = one + two + three;
                    if (result == n){
                        count++;

                    }

                }

            }

        }
        System.out.println(count);
    }
}
