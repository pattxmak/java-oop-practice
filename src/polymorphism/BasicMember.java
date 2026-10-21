package polymorphism;

public class BasicMember extends Membership {

    public BasicMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void printBenifits() {
        System.out.println("Member: " + getName());
        super.printBenifits();
        System.out.println("Ads: Enabled");

    }

    @Override
    public double calculateMonthlyFee() {
        return 99;
    }
}
