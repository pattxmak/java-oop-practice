package basicoop;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "JK Rolling", 500, true);
        Book book2 = new Book("One piece", "Eiichiro Oda", 350, true);

        book1.printInfo();
        book2.printInfo();

        book1.borrow();
        book1.printInfo();

        book1.returnBook();
        book1.printInfo();

        double priceWithDisCount = book2.getDiscountPrice(15);
        book2.printInfo();
        System.out.println("Price with Discount: " + priceWithDisCount);
    }
}
