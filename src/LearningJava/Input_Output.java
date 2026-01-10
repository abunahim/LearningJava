package LearningJava;

import java.util.Scanner;

public class Input_Output {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("How much did you score: ");
        double score = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You have scored " + score + " marks");

        scanner.close();
    }
}
