package composition;

public class LibraryMain {

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "Phao Ruzzy", 350.0);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 550.0);

        Library centralLibrary = new Library("Central City Library");

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);

        centralLibrary.printLibraryDetails();
    }
}
