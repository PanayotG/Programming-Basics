package While_Loop_Lab;

import java.util.Scanner;

public class E03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < n){
            int currnetNum = Integer.parseInt(scanner.nextLine());
            sum += currnetNum;


        }
        System.out.println(sum);
    }

}
