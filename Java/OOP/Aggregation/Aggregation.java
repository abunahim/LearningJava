package LearningJava.Aggregation;

public class Aggregation {
    public static void main(String[] args) {

        Book book1 = new Book("Game of Thrones", 694);
        Book book2 = new Book("Clash of Kings", 768);
        Book book3 = new Book("Storm of Swords", 973);
        Book book4 = new Book("Feast for Crows", 753);
        Book book5 = new Book("Dance with Dragons", 1056);

        Book[] books = {book1, book2, book3, book4, book5};

        /*for(Book book : books){
            System.out.println(book.displayInfo());
        }*/

        //System.out.println(book5.displayInfo());

        Library library = new Library("British Library", 1973, books);

        library.displayInfo();
    }
}
