package Exercises_Week01;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtInCm = Integer.parseInt(scanner.nextLine());
        int widthInCm = Integer.parseInt(scanner.nextLine());
        int hightInCm = Integer.parseInt(scanner.nextLine());
        double percentige = Double.parseDouble(scanner.nextLine());

        double volumeInLiters = lenghtInCm * widthInCm * hightInCm * 0.001;
        double neededLiters = volumeInLiters * (1 - percentige / 100);
        System.out.println(neededLiters);
    }
}
