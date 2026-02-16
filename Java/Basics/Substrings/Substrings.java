package LearningJava;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        /*String email = "nahim12345@gmail.com";
        String username = email.substring(0, 10);
        String domain = email.substring(11, 20);

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);*/

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else{
            System.out.println("Invalid Email");
        }

        scanner.close();
    }
}
