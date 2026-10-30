package objectsmethods;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {

        if (libraryName == null || libraryName.isBlank()) {
            throw new IllegalArgumentException("libraryName cannot be blank");
        }

        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {

        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        if (books.contains(book)) {
            System.out.println("Book Id: " + book.getBookId() + " already existing, Please check again.");
            return;
        }

        books.add(book);

    }

    public void printLibraryDetails() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Total Book : " + books.size());
        System.out.println();
        for (Book book : books) {
            book.printInfo();
        }
    }
}
