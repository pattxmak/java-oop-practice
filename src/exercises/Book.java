package exercises;

public class Book implements Printable {

    private final String bookId;
    private final String title;
    private final String author;
    private BookStatus status;
    private static int createdCount;


    public Book(String bookId, String title) {

        this(bookId, title, "Unknown");

    }

    public Book(String bookId, String title, String author) {

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book ID cannot be blank");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be blank");
        }

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;

        createdCount++;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() { return  title; }

    public BookStatus getStatus() {
        return status;
    }

    public static int getCreatedCount() { return createdCount; }

    public void borrow() {

        if (status != BookStatus.AVAILABLE) {
            throw new IllegalStateException("This book is not available: " + title);
        }

        status = BookStatus.BORROWED;
        System.out.println("Borrowed: " + title);

    }

    public void returnBook() {

        if (status != BookStatus.BORROWED) {
            throw new IllegalStateException("This book have already available: " + title);
        }

        status = BookStatus.AVAILABLE;
        System.out.println("Returned Book: " + title);

    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId
                + ", Title: " + title
                + ", Author: " + author
                + ", Status: " + status;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book other = (Book) obj;

        return bookId.equals(other.bookId);

    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }
}
