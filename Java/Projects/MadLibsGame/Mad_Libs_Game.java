package LearningJava;

import java.util.Scanner;

public class Mad_Libs_Game {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String noun;
        String verb;
        String adjective;
        String animal;
        String place;

        System.out.print("Enter a noun (person or animal): ");
        noun = scanner.nextLine();
        System.out.print("Enter an verb (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective = scanner.nextLine();
        System.out.print("Enter an animal : ");
        animal = scanner.nextLine();
        System.out.print("Enter a place : ");
        place = scanner.nextLine();

        System.out.println("\nToday I saw a " + noun + " that wanted to " + verb + ".");
        System.out.println("It was very " + adjective + " and looked like a " + animal + ".");
        System.out.println("We both went to the " + place + " and had a great day!");

        scanner.close();
    }
}
