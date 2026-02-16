package LearningJava;

public class PrintF_Statement {
    public static void main(String[] args) {

        // %(flags)(width)(.precision)(specifier-character)

        //specifier
        /*String name = "Nahim";
        char firstLetter = 'N';
        int age = 27;
        double height = 170;
        boolean isEmployed = true;

        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %fcm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("Hello %s. You are %d years old.", name, age);*/

        /*.precision
        double price1 = 12345.123;
        double price2 = 456.456;
        double price3 = 789.789;
        double price4 = -135.135;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);

        flags

        System.out.printf("%,.1f\n", price1); , comma grouping separator in thousands
        System.out.printf("% .1f\n", price2); blank space display an - if negative & space if positive
        System.out.printf("%+.1f\n", price3); + outputs a plus
        System.out.printf("%(.1f\n", price4); ( displays () if negative numbers */

        //width

        int id1 = 1;
        int id2 = 123;
        int id3 = 12345;
        int id4 = 123467;

        System.out.printf("%-6d\n", id1); //negative number just keeps to left with spaces
        System.out.printf("%6d\n", id2); //padding with just number add spaces to pattern
        System.out.printf("%06d\n", id3); //0 padding with number add zeros
        System.out.printf("%6d\n", id4);
    }
}
