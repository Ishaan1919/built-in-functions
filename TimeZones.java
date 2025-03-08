import java.time.*;

public class TimeZones {
    public static void main(String[] args) {
        // Define the required time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata"); // IST corresponds to Asia/Kolkata
        ZoneId pstZone = ZoneId.of("America/Los_Angeles"); // PST corresponds to Los Angeles
        
        // Get the current time in each zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        // Define a formatter to display the time in a readable format
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the times
        System.out.println("Current time in GMT: " + gmtTime);
        System.out.println("Current time in IST: " + istTime);
        System.out.println("Current time in PST: " + pstTime);
        // System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        // System.out.println("Current time in IST: " + istTime.format(formatter));
        // System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}
