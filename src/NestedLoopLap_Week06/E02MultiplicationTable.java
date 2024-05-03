package NestedLoopLap_Week06;

public class E02MultiplicationTable {
    public static void main(String[] args) {
        for (int one = 1; one <= 10; one++) {
            for (int two = 1; two <= 10 ; two++) {
                int result = one * two;

                System.out.printf("%d * %d = %d%n", one, two, result);

            }

        }
    }
}
