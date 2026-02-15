package LearningJava;

import java.util.Scanner;

public class Nested_Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(j);
            }
        }*/

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter # of Rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter # of Columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
            System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
