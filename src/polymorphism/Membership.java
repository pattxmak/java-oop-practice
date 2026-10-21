package polymorphism;

public class Membership {

    private String memberId;
    private String name;

    public Membership(String memberId, String name) {

        if (memberId == null || memberId.isBlank()) {
            throw new IllegalArgumentException("Member Id cannot be null");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        this.memberId = memberId;
        this.name = name;
    }

    public final String getMemberId() {
        return memberId;
    }

    public final String getName() {
        return name;
    }

    public void printBenifits() {
        System.out.println("Benifits: Access to basic content");
    }

    public double calculateMonthlyFee() {
        return 0;
    }
}
