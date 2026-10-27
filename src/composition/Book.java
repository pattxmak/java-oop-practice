package composition;

public class Book {

    private String title;
    private String autor;
    private double price;

    public Book(String title, String autor, double price) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }

        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Autor cannot be blank");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.title = title;
        this.autor = autor;
        this.price = price;
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

}
