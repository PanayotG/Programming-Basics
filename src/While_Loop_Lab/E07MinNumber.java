package While_Loop_Lab;

import java.util.Scanner;

public class E07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;

        String text = scanner.nextLine();
        while (!text.equals("Stop")){
            int number = Integer.parseInt(text);

            if(number < minNumber){
                minNumber = number;

            }
            text = scanner.nextLine();


        }
        System.out.println(minNumber);
    }
}
