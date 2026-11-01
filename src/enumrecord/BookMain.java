package enumrecord;

public class BookMain {

    public static void main(String[] args) {

        Author author = new Author("Pattama", "Thailand");

        Book book = new Book("Java Basics", author);

        book.printInfo();
        book.borrow();
        book.borrow();

        System.out.println();
        book.printInfo();
        book.returnBook();
        book.returnBook();

        System.out.println();
        book.printInfo();

    }

}
