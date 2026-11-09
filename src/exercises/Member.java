package exercises;

public abstract class Member implements Printable {

    public final String memberId;
    public final String name;

    public Member(String memberId, String name) {

        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member Id cannot be blank");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        this.memberId = memberId;
        this.name = name;

    }

    public final String getName() {
        return name;
    }

    public final String getMemberId() {
        return memberId;
    }

    public abstract int getBorrowLimit();

    public abstract int calculateLateFee(int daysLate);

    @Override
    public void printInfo() {
        System.out.println("MemberId: " + memberId + ", Name: " + name);
    }

}
