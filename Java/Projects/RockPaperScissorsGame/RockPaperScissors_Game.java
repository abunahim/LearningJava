package LearningJava;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playersChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println(" ");
        System.out.println("Rock Paper Scissors Game");
        System.out.println(" ");

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playersChoice = scanner.nextLine().toLowerCase();

            if (!playersChoice.equals("rock") &&
                    !playersChoice.equals("paper") &&
                    !playersChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playersChoice.equals(computerChoice)) {
                System.out.println("It's a Tie!");
            } else if ((playersChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playersChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playersChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose!");
            }

            System.out.println(" ");
            System.out.print("Would you like to play again? (Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();
        }
        while(playAgain.equals("yes"));

        System.out.println(" ");
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
