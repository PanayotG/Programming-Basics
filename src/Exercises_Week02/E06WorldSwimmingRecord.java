package Exercises_Week02;

import java.util.Scanner;

public class E06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());
        double delay = (Math.floor(distanceInMeters / 15)) * 12.5;
        double ivanTime = distanceInMeters * timeForOneMeter + delay;
        if (record > ivanTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else if (ivanTime >= record){
            double diff = Math.abs(record - ivanTime);
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
