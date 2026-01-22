package LearningJava;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println(" ");
        System.out.println("Welcome to Slots");
        System.out.println(" 🍋 ⭐ 🔔 🍒 🍉");
        System.out.println(" ");

        while(balance > 0){
            System.out.println("Currency balance: £" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else{
                balance -= bet;
                System.out.println("£" + balance);
            }

            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You Won £" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you have lost this round");
            }

            System.out.print("Do you want to play again? (Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("yes")){
                break;
            }
        }

        System.out.println(" ");
        System.out.println("GAME OVER! Your final balance is £" + balance);

        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍋", "⭐", "🔔", "🍒", "🍉"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" ");
        System.out.println(" " + String.join(" | ", row));
        System.out.println(" ");
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍋" -> bet * 8;
                case "⭐" -> bet * 20;
                case "🔔" -> bet * 12;
                case "🍒" -> bet * 4;
                case "🍉" -> bet * 6;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍋" -> bet * 4;
                case "⭐" -> bet * 10;
                case "🔔" -> bet * 6;
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍋" -> bet * 4;
                case "⭐" -> bet * 10;
                case "🔔" -> bet * 6;
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                default -> 0;
            };
        }
        return 0;
    }
}
