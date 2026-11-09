package exercises;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books;
    private List<Member> members;
    private List<Loan> activeLoans;

    public Library(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Library name cannot be blank");
        }

        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.activeLoans = new ArrayList<>();

    }

    public void addBook(Book book) {

        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        if (books.contains(book)) {
            throw new IllegalArgumentException("This book id already exists: " + book.getBookId());
        }

        books.add(book);

    }

    public void registerMember(Member member) {

        if (member == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        for (Member m : members) {
            if (m.getMemberId().equals(member.getMemberId())) {
                throw new IllegalArgumentException("This member id already exists: " + m.getMemberId());
            }
        }

        members.add(member);

    }

    public void printLibraryDetails() {

        int availableCount = 0;

        for (Book book : books) {
            if (book.getStatus() == BookStatus.AVAILABLE) {
                availableCount++;
            }
        }

        System.out.println("LibraryName: " + name);
        System.out.println("Total books: " + books.size());
        System.out.println("Available books: " + availableCount);
        System.out.println("Active loans: " + activeLoans.size());

        for (Book book : books) {
            book.printInfo();
        }

    }

    public void borrowBook(String memberId, String bookId) {

        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member Id cannot be blank");
        }

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book Id cannot be blank");
        }

        Book book = findBookId(bookId);
        Member member = findMemberId(memberId);

        if (book.getStatus() != BookStatus.AVAILABLE) {
            throw new IllegalStateException("Book is not available: " + book.getTitle());
        }

        int currentLoans = countLoanByMemberId(memberId);
//        System.out.println("currentLoans: " + currentLoans);

        if (currentLoans >= member.getBorrowLimit()) {
            throw new IllegalStateException("Borrow limit reached");
        }

        Loan loan = new Loan(bookId, memberId);

        book.borrow();
        activeLoans.add(loan);


    }

    public int returnBook(String bookId, int daysLate) {

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book Id cannot be blank");
        }

        if (daysLate < 0) {
            throw new IllegalArgumentException("Day rate must greater than 0");
        }

        Loan loan = findLoanId(bookId);
        Member member = findMemberId(loan.memberId());
        Book book = findBookId(loan.bookId());

        if (book.getStatus() != BookStatus.BORROWED) {
            throw new IllegalStateException("This book have already available");
        }

        int fee = member.calculateLateFee(daysLate);

        book.returnBook();
        activeLoans.remove(loan);

        return fee;
    }

    private Book findBookId(String bookId) {

        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }

        throw new IllegalArgumentException("Book id not found: " + bookId);

    }

    private Member findMemberId(String memberId) {

        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }

        throw new IllegalArgumentException("member id not found: " + memberId);

    }

    private Loan findLoanId(String bookId) {

//        System.out.println(bookId);
        for (Loan loan : activeLoans) {
            if (loan.bookId().equals(bookId)) {
                return loan;
            }
        }

        throw new IllegalArgumentException("loan not found book id: " + bookId);

    }

    private int countLoanByMemberId(String memberId) {

        int count = 0;

        for (Loan loan : activeLoans) {
            if (loan.memberId().equals(memberId)) {
                count++;
            }
        }

        return count;

    }
}
