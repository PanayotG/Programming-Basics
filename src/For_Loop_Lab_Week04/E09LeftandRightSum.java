package For_Loop_Lab_Week04;

import java.util.Scanner;

public class E09LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= 2 * n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                leftSum = leftSum + currentNumber;
            }else {
                rightSum = rightSum + currentNumber;
            }
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
           int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
