package enumrecord;

public class Book {

    private final String title;
    private final Author author;
    private BookStatus status = BookStatus.AVALIABLE;


    public Book(String title, Author author) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }

        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }

        this.title = title;
        this.author = author;
    }

    public void borrow() {

        if (status != BookStatus.AVALIABLE) {
            System.out.println("Book is not avaliable: " + title);
            return;
        }

        status = BookStatus.BORROWED;
        System.out.println("Borrowed: " + title);
    }

    public void returnBook() {
        if (status == BookStatus.AVALIABLE) {
            System.out.println("This book has already been returned: " + title);
            return;
        }

        status = BookStatus.AVALIABLE;
        System.out.println("Returned: " + title);

    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.name() + ", Country: " + author.country());
        System.out.println("Status: " + status);
    }
}
