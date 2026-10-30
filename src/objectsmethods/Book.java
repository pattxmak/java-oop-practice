package objectsmethods;

import java.util.Objects;

public class Book {

    private final String bookId;
    private String title;
    private String autor;
    private double price;

    public Book(String bookId, String title, String autor, double price) {

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book Id cannot be blank");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }

        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor cannot be blank");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.bookId = bookId;
        this.title = title;
        this.autor = autor;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Book title: " + title);
        System.out.println("Autor: " + autor);
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Book Id: " + bookId + ", Title: " + title + ", Autor: " + autor + ", Price: " + price;
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
