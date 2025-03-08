import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two dates
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateInput = input.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateInput = input.nextLine();

        // Parse the input strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
        input.close();
    }
}
