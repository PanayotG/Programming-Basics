package Exercises_Week01;

public class P04_VacationBooksList {
    public static <Scanner> void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int pagesInTheBook = Integer.parseInt(scanner.nextLine());
        int pagesForOneHour = Integer.parseInt(scanner.nextLine());
        int daysForReading = Integer.parseInt(scanner.nextLine());

        int pagesForHour = pagesInTheBook / pagesForOneHour;
        int result = pagesForHour / daysForReading;
        System.out.println(result);

    }
}
