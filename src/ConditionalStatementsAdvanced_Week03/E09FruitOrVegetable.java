package ConditionalStatementsAdvanced_Week03;

import java.util.Scanner;

public class E09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        switch (product){
            case ("banana"):
            case ("apple"):
            case ("kiwi"):
            case ("lemon"):
            case ("grapes"):
            case ("cherry"):
                System.out.println("fruit");
                break;
            case ("tomato"):
            case ("cucumber"):
            case ("pepper"):
            case ("carrot"):
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
