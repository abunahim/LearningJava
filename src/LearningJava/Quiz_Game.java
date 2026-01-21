package LearningJava;

import java.util.Scanner;

public class Quiz_Game {
    public static void main(String[] args) {

        String[] questions = {"Which component of a computer is responsible for executing instructions?",
                              "What does RAM primarily store?",
                              "Which number system is mainly used by computers for processing data?",
                              "What is the function of a compiler?",
                              "Which type of memory is the fastest?"};

        String[][] options = {{"1. RAM", "2. Hard Disk", "3. CPU", "4. Motherboard"},
                              {"1. Permanent data", "2. Temporary data and running programs", "3. Backup files", "4. System software only"},
                              {"1. Decimal", "2. Octal", "3. Hexadecimal", "4. Binary"},
                              {"1. Executes programs line by line", "2. Converts high-level language into machine language", "3. Stores data permanently", "4. Manages hardware resources"},
                              {"1. Hard Disk", "2. RAM", "3. Cache Memory", "4. CD-ROM"}};

        int [] answers = {3, 2, 4, 2, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Welcome to the Quiz Game");
        System.out.println(" ");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            System.out.println(" ");
            if(guess == answers[i]){
                System.out.println("CORRECT!");
                System.out.println(" ");
                score++;
            }
            else{
                System.out.println("WRONG!");
                System.out.println(" ");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
