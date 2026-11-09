package exercises;

public class Main {

    public static void main(String[] args) {

        // ====================== PART 1 ======================
        Book book = new Book("B001", "Java Basics");
//        book.printInfo();
//
//        book.borrow();
//        book.printInfo(); // BORROWED
//        System.out.println();
//
//        try {
//            book.borrow(); // throw
//        } catch (IllegalStateException e) {
//            System.out.println("Expected error: " + e.getMessage());
//        }
//
//        book.returnBook();
//        book.printInfo(); // AVAILABLE

         // ====================== PART 2 ======================
        Member basic = new BasicMember("M001", "Aom");
        Member premium = new PremiumMember("M002", "Mild");
//
//        basic.printInfo();
//        System.out.println(basic.calculateLateFee(3));   // 30
//
//        System.out.println();
//        premium.printInfo();
//        System.out.println(premium.calculateLateFee(3)); // 15


        // ====================== PART 3 ======================
        Book book1 = new Book("B002", "Python");
        Book book2 = new Book("B003", "Next js");
        Book book3 = new Book("B004", "Harry Potter");
        Book book4 = new Book("B005", "One Piece");
        Book book5 = new Book("B006", "Klom Klang");
        Book book6 = new Book("B007", "Peter pan");

        Library library = new Library("SUT Library");

        // add book to library
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        // register member
        library.registerMember(basic);
        library.registerMember(premium);


        // borrow of basic member
        library.borrowBook(basic.getMemberId(), book.getBookId());
        library.borrowBook(basic.getMemberId(), book1.getBookId());

        try {
            library.borrowBook(basic.getMemberId(), book2.getBookId()); //throw
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        library.borrowBook(premium.getMemberId(), book2.getBookId());
        library.borrowBook(premium.getMemberId(), book3.getBookId());
        library.borrowBook(premium.getMemberId(), book4.getBookId());
        library.borrowBook(premium.getMemberId(), book5.getBookId());
        library.borrowBook(premium.getMemberId(), book6.getBookId());
        System.out.println();

        System.out.println("Basic return late 3 day: " + library.returnBook(book.getBookId(), 3));
        System.out.println();
        System.out.println("Premium return late 3 day: " + library.returnBook(book2.getBookId(), 3));

        library.borrowBook(basic.getMemberId(), book2.getBookId()); // can borrow na -> now it's available
        try {
            System.out.println("Basic return late 3 day: " + library.returnBook(book.getBookId(), 3));
            ; // throw --> already returned
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println();
        try {
            System.out.println("Basic return negative day" + library.returnBook(book1.getBookId(), -1));;
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println();
        try {
            System.out.println("Basic return 0 day" + library.returnBook(book.getBookId(), 0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        library.printLibraryDetails();
    }
}
