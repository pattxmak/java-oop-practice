package encapsulation;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "JK Rolling", 500, true);
        Book book2 = new Book("One piece", "Eiichiro Oda", 350, true);

        book1.printInfo();
        book2.printInfo();

        book1.setPrice(-50);

        // Using constructor
        Book book3 = new Book("Khom Khlang", "Luxurious.W", -499, true);

        book1.borrow();
        book1.borrow();

        book1.returnBook();
        book1.returnBook();
    }
}
