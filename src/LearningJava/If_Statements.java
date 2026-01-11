package LearningJava;

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are old!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else{
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}
