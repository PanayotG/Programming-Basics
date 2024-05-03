package Exercises_Week04;

import java.util.Scanner;

public class E07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan= 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= numberOfGroups ; i++) {
            int peopleInSingleGroup = Integer.parseInt(scanner.nextLine());
            if(peopleInSingleGroup <= 5){
                musala = musala + peopleInSingleGroup;
            } else if (peopleInSingleGroup <= 12) {
                monblan = monblan + peopleInSingleGroup;
            } else if (peopleInSingleGroup <= 25) {
                kilimanjaro = kilimanjaro + peopleInSingleGroup;
            } else if (peopleInSingleGroup <= 40) {
                k2 = k2 + peopleInSingleGroup;
            }else {
                everest = everest + peopleInSingleGroup;
            }
        }
        int sumAll = musala + monblan + kilimanjaro + k2 + everest;
        double persentigeMusala = (musala * 1.0 / sumAll) * 100;
        double persentigeMonblan = (monblan * 1.0 / sumAll) * 100;
        double persentigeKilimanjaro = (kilimanjaro * 1.0 / sumAll) * 100;
        double persentigeK2 = (k2 * 1.0 / sumAll) * 100;
        double persentigeEverest = (everest * 1.0 / sumAll) * 100;

        System.out.printf("%.2f%%%n", persentigeMusala);
        System.out.printf("%.2f%%%n", persentigeMonblan);
        System.out.printf("%.2f%%%n", persentigeKilimanjaro);
        System.out.printf("%.2f%%%n", persentigeK2);
        System.out.printf("%.2f%%%n", persentigeEverest);

    }
}
