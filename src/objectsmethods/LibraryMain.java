package objectsmethods;

public class LibraryMain {

    public static void main(String[] args) {

        Book book1 = new Book("B001", "Java Basics", "Bombe", 350);
        Book book2 = new Book("B001", "Java Basics", "Alice", 350);
        Book book3 = new Book("B002", "OOP Practice", "Mild", 450);

        System.out.println(book1);
        System.out.println(book1 == book2);      // false
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false
        System.out.println(book1.equals(null));  // false


        Library centralLibrary = new Library("Central City Library");
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

    }
}
