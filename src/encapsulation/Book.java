package encapsulation;

public class Book {

    private String title;
    private String author;
    private double price;
    private boolean available;


    // Create Constructor
    Book(String title, String author, double price, boolean available) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        this.available = true; // new object should be available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() { //boolean using is... instead get
        return available;
    }

    public void setPrice(double price) {
        //validate
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }

    public void setAuthor(String author) {

        if (author == null || author.isBlank()) {
            System.out.println("Author cannot be blank");
            return;
        }

        this.author = author;
    }

    public void setTitle(String title) {

        if (title == null || title.isBlank()) {
            System.out.println("Title cannot be empty");
            return;
        }

        this.title = title;
    }

    void printInfo() {
        System.out.println(title + " by " + author + " - " + price + " bath " + (available ? "is available" : "is borrowed"));
    }

    void borrow() {

        // Check
        if (!available) {
            System.out.println("This book is currently unavailable: " + title);
            return;
        }
        available = false;
        System.out.println("Borrowed: " + title);
    }

    void returnBook() {

        // Check
        if (available) {
            System.out.println("This book has already been returned: " + title);
            return;
        }

        available = true;
        System.out.println("Returned: " + title);
    }

    double getDiscountPrice(double percent) {
        return price - (price * percent / 100);
    }
}
