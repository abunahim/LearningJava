package LearningJava;

import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {

        /*double temp = 50;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is Good");
            System.out.println("It is Sunny outside");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is Good");
            System.out.println("It is Cloudy outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }*/

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
