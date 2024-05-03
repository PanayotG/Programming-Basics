package Exercises_Week03;

import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spendMoney = 0;
        String destination = "";
        String accommodationType = "";
        if(budget <= 100 && season.equals("summer")){
            destination = "Bulgaria";
            accommodationType = "Camp";
            spendMoney = budget * 0.3;
        }else if (budget <= 100){
            destination = "Bulgaria";
            accommodationType = "Hotel";
            spendMoney = budget * 0.7;
        } else if (budget <= 1000 && season.equals("summer")) {
            destination = "Balkans";
            accommodationType = "Camp";
            spendMoney = budget * 0.4;
        } else if (budget <= 1000) {
            destination = "Balkans";
            accommodationType = "Hotel";
            spendMoney = budget * 0.8;
        }else {
            destination = "Europe";
            accommodationType = "Hotel";
            spendMoney = budget * 0.9;
        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", accommodationType, spendMoney);

    }
}
