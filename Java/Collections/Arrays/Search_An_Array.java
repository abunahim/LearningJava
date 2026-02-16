package LearningJava;

import java.util.Scanner;

public class Search_An_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //int[] numbers = {1, 9, 8, 4, 5, 7};
        String[] fruits = {"apple", "banana", "orange", "mango"};
        boolean isFound = false;
        String target;

        System.out.print("Enter the fruit to search for: ");
        target = scanner.nextLine();
        //String target = "ba";
        //int target = 2;

        /*for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the Array");
        }*/

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the Array");
        }

        scanner.close();
    }
}
