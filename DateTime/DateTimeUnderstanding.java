package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUnderstanding {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1995, 5, 15);
        System.out.println("Birthday: " + birthday);

        LocalDate date = LocalDate.now(); // Current date
        LocalTime time = LocalTime.now(); // Current time
        LocalDateTime dateTime = LocalDateTime.now(); // Current date and time

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

        // check if  date is in a range.
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 30);
        LocalDate targetDate = LocalDate.of(2023, 7, 28);

        if (!targetDate.isBefore(startDate) && !targetDate.isAfter(endDate)) {
            System.out.println("Date is within range.");
        } else {
            System.out.println("Date is NOT within range.");
        }

        // Calculate days and months between two dates
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 7, 28);

        long daysBetween = ChronoUnit.DAYS.between(start, end);
        long monthsBetween = ChronoUnit.MONTHS.between(start, end);

        System.out.println("Days between: " + daysBetween);
        System.out.println("Months between: " + monthsBetween);

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = today.format(formatter);
        System.out.println("Formatted Date: " + formatted);

    }
}
