package exercises;

public record Loan(String bookId, String memberId) {

    public Loan{

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalArgumentException("Book ID cannot be blank");
        }

        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member ID cannot be blank");
        }
    }

}
