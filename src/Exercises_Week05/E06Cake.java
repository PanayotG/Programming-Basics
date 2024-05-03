package Exercises_Week05;

import java.util.Scanner;

public class E06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int countPieces = width * lenght;
        String command = scanner.nextLine();

        while (!command.equals("STOP")){
            int currentCountPieces = Integer.parseInt(command);
            countPieces = countPieces - currentCountPieces;
            if (countPieces < 0 ){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
                break;
            }
            command = scanner.nextLine();

        }
        if (countPieces > 0){
            System.out.printf("%d pieces are left.", countPieces);
        }

    }

}
