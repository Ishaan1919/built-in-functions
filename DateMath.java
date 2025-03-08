import java.util.Scanner;
import java.time.*;

class DateMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter a date (YYYY-MM-DD): ");
        String inputDate = input.nextLine();
        
        // Convert input to LocalDate
        LocalDate date = LocalDate.parse(inputDate);
        
        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks
        newDate = newDate.minusWeeks(3);
        
        // Display the result
        System.out.println("Updated date after arithmetic operations: " + newDate);
        
        input.close();
    }
}