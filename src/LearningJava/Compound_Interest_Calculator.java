package LearningJava;

import java.util.Scanner;

public class Compound_Interest_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded; // like yearly, quarterly or monthly
        int years;
        double amount;

        System.out.print("What is the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("What is the rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the No. of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the No. of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded,timeCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f", years, amount);

        scanner.close();
    }
}
