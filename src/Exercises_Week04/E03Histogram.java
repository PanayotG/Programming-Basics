package Exercises_Week04;

import java.util.Scanner;

public class E03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200){
                countP1++;
            } else if (currentNumber < 400) {
                countP2++;
            } else if (currentNumber < 600) {
                countP3++;
            } else if (currentNumber < 800) {
                countP4++;
            } else {
                countP5++;
            }

        }
        double percetigeP1 = (countP1 * 1.0 / n) * 100;
        double percetigeP2 = (countP2 * 1.0 / n) * 100;
        double percetigeP3 = (countP3 * 1.0 / n) * 100;
        double percetigeP4 = (countP4 * 1.0 / n) * 100;
        double percetigeP5 = (countP5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", percetigeP1);
        System.out.printf("%.2f%%%n", percetigeP2);
        System.out.printf("%.2f%%%n", percetigeP3);
        System.out.printf("%.2f%%%n", percetigeP4);
        System.out.printf("%.2f%%%n", percetigeP5);

    }

}
