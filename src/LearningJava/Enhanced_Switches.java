package LearningJava;

import java.util.Scanner;

public class Enhanced_Switches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;
        System.out.print("Enter the day of the week: ");
        day = scanner.next();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a Weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the Weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}
