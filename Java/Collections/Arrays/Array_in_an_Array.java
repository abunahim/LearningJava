package LearningJava;

public class Array_in_an_Array {
    public static void main(String[] args) {

        /*String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"tomato", "potato", "onion"};
        String[] meats = {"chicken", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        String[][] groceries = {{"apple", "banana", "orange"},
                                {"tomato", "potato", "onion"},
                                {"chicken", "beef", "fish"}};

        groceries[0][0] = "mango";
        groceries[1][2] = "cucumber";
        groceries[2][1] = "mutton";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }*/

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number :row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
