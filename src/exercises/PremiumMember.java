package exercises;

public class PremiumMember extends Member{

    private static final int BORROW_LIMIT = 5;
    private static final int LATE_FEE_PER_DAY = 5;

    public PremiumMember(String memberId, String name) {
        super(memberId, name);

    }

    @Override
    public int getBorrowLimit() {
        return BORROW_LIMIT;
    }

    @Override
    public int calculateLateFee(int daysLate) {

        if (daysLate < 0) {
            throw new IllegalArgumentException("Days late must be more than 0");
        }

        return LATE_FEE_PER_DAY * daysLate;
    }

    @Override
    public void printInfo() {

        super.printInfo();
        System.out.println("Premium Member, borrow limit: " + BORROW_LIMIT);

    }
}
