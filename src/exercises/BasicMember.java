package exercises;

public class BasicMember extends Member {

    private static final int BORROW_LIMIT = 2;
    private static final int LATE_FEE_PER_DAY = 10;

    public BasicMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getBorrowLimit() {
        return BORROW_LIMIT;
    }

    @Override
    public int calculateLateFee(int daysLate) {

        if (daysLate < 0) {
            throw new IllegalArgumentException("Days late must be greater than or equal to 0");
        }

        return LATE_FEE_PER_DAY * daysLate;
    }

    @Override
    public void printInfo() {

        super.printInfo();
        System.out.println("Basic Member, borrow limit: " + BORROW_LIMIT);

    }
}
