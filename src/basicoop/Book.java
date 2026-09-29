package basicoop;

public class Book {

    String title;
    String author;
    double price;
    boolean available;


    // Create Constructor
    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void printInfo() {
        System.out.println(title + " by " + author + " - " + price + " bath " + (available ? "is available" : "is borrowed"));
    }

    void borrow() {
        available = false;
        System.out.println("Borrowed: " + title);
    }

    void returnBook() {
        available = true;
        System.out.println("Returned: " + title);
    }

    double getDiscountPrice(double percent) {
        return price - (price * percent / 100);
    }
}
