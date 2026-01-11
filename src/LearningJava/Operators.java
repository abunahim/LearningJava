package LearningJava;

public class Operators {
    public static void main(String[] args) {

        int x = 100;
        int y = 5;
        int z;

        // Arithmetic Operators

        //z = x + y;
        z = x - y;
        //z = x * y;
        //z = x / y;

        // Augmented Assignment Operators

        //x += y; //x = x + y
        //x -= y;
        //x *= y;
        //x /= y;

        // Increment and Decrement Operators

        x++; //x = x + 1;
        x++;
        x++;

        //x--; //x = x - 1;
        //x--;
        //x--;

        // Order of Operations (Parentheses-Exponent-Multiply-Divide-Add-Subtract)

        double result = 10 + 20 * (10 - 5) / 5.0;

        System.out.println(z);
        System.out.println(x);
        System.out.println(result);
    }
}
