package LearningJava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_And_Times {
    public static void main(String[] args) {

        /*LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        //Custom Date & Time
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate date = LocalDate.of(2025, 12, 25);
        System.out.println(date);

        LocalTime time = LocalTime.of(23, 45, 50);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(2025, 12, 25,23, 45, 50);
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.of(2025, 12, 25,23, 45, 50);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 10, 25,11, 45, 50);
        System.out.println(dateTime1);
        System.out.println(dateTime2);*/

        LocalDateTime dateTime1 = LocalDateTime.of(2025, 12, 25,23, 45, 50);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 12, 25,23, 45, 50);

        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)){
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }
        else if (dateTime1.isEqual(dateTime2)){
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}
