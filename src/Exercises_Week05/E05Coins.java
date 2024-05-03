package Exercises_Week05;

import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum =Double.parseDouble(scanner.nextLine());
        int countCoins = 0;
        double totalCoins = Math.floor(sum * 100);

        while (totalCoins > 0){
            if(totalCoins >= 200){
                countCoins++;
                totalCoins = totalCoins - 200;
            } else if (totalCoins >= 100) {
                countCoins++;
                totalCoins = totalCoins - 100;
            }else if (totalCoins >= 50) {
                countCoins++;
                totalCoins = totalCoins - 50;

            }else if (totalCoins >= 20) {
                countCoins++;
                totalCoins = totalCoins - 20;

            }else if (totalCoins >= 10) {
                countCoins++;
                totalCoins = totalCoins - 10;

            }else if (totalCoins >= 5) {
                countCoins++;
                totalCoins = totalCoins - 5;

            }else if (totalCoins >= 2) {
                countCoins++;
                totalCoins = totalCoins - 2;

            }else if (totalCoins >= 1) {
                countCoins++;
                totalCoins = totalCoins - 1;

            }

        }
        System.out.println(countCoins);


    }
}
