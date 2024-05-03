package For_Loop_Lab_Week04;

import java.util.Scanner;

public class E07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);

    }
}
