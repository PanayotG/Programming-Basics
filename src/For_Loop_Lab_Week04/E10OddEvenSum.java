package For_Loop_Lab_Week04;

import java.util.Scanner;

public class E10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0){
                evenNumber = evenNumber + currentNumber;
            }else {
                oddNumber = oddNumber + currentNumber;
            }

        }
        if (evenNumber == oddNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + evenNumber);
        }else {
            int diff = Math.abs(evenNumber - oddNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
       // System.out.printf("Yes %nSum = %d%n", evenNumber);
       // System.out.printf("No %nDiff = %d", diff);
    }
}
