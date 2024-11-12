
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AboutDates {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now(); // Gets the current date
        System.out.println("LocalDate "+today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String formattedDate = today.format(formatter); // Formats the date to "dd-MM-yyyy"
        System.out.println("Formatted date (dd-MM-yyyy): " + formattedDate);
        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy"); // Month in full

        String date1 = today.format(formatter1); // "yyyy-MM-dd" format
        String date2 = today.format(formatter2); // "dd/MM/yyyy" format
        String date3 = today.format(formatter3); // "MMMM dd, yyyy" format

        System.out.println("Format yyyy-MM-dd: " + date1);
        System.out.println("Format dd/MM/yyyy: " + date2);
        System.out.println("Format MMMM dd, yyyy: " + date3);

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // Abbreviated month
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("E, dd MMM yyyy"); // Day abbreviation

        String date4 = today.format(formatter4);
        String date5 = today.format(formatter5);

        System.out.println("Format dd-MMM-yyyy: " + date4);
        System.out.println("Format E, dd MMM yyyy: " + date5);

        DateTimeFormatter yearFormatter1 = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter yearFormatter2 = DateTimeFormatter.ofPattern("YYYY");

        String year1 = today.format(yearFormatter1); // Regular year
        String year2 = today.format(yearFormatter2); // Week-based year

        System.out.println("Calendar Year (yyyy): " + year1);
        System.out.println("Week-Based Year (YYYY): " + year2);


        /**
         * Covert String to Date
         */
        String dateStr = "12-11-2024";

        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed date: " + parsedDate);


    }
}