package LearningJava;

import java.util.Scanner;

public class User_Input_In_Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] colours;
        int size;

        System.out.print("What # of colour do you want to enter: ");
        size = scanner.nextInt();
        scanner.nextLine();

        colours = new String[size];

        for(int i = 0; i < colours.length; i++){
            System.out.print("Enter a colour: ");
            colours[i] = scanner.nextLine();
        }

        for(String colour : colours){
            System.out.println(colour);
        }



        scanner.close();
    }
}
