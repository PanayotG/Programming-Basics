package Exercises_Week05;

import java.util.Scanner;

public class E07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width =Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * hight * lenght;
        String command = scanner.nextLine();
        while(!command.equals("Done")){

            int currentSpace = Integer.parseInt(command);
            freeSpace = freeSpace - currentSpace;
            if(freeSpace <= 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                break;
        }
            command = scanner.nextLine();

        }


        if(freeSpace > 0){
            System.out.printf("%d Cubic meters left.", freeSpace);
        }



    }
}
