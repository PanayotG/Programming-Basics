package For_Loop_Lab_Week04;

import java.util.Scanner;

public class E04EvenPowersof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int step = 0; step <= n; step += 2) {
            System.out.println(Math.pow(2,step));
        }
    }
}
