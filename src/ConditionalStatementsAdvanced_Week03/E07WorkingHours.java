package ConditionalStatementsAdvanced_Week03;

import java.util.Scanner;

public class E07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        boolean workingDay = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday");

        boolean isWorkingHours = (hours >= 10 && hours <=18);
        if(workingDay && isWorkingHours) {
            System.out.println("open");

        } else {
            System.out.println("closed");
        }
    }
}
