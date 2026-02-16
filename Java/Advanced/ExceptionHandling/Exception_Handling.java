package LearningJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            //System.out.println(1 / 0);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (ArithmeticException e) {
            System.out.println("NUMBER CAN'T BE DIVIDED BY ZERO!");
        } catch (InputMismatchException e) {
            System.out.println("THAT WASN'T A NUMBER!");
        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG!");
        } finally {
            System.out.println("THIS ALWAYS EXECUTES!");
        }
    }
}
