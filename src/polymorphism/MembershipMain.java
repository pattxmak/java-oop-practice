package polymorphism;

public class MembershipMain {

    public static void main(String[] args) {

        Membership[] members = {
                new BasicMember("M001", "Alice"),
                new PremiumMember("M002", "Mild", "Gold"),
                new BasicMember("M003", "Bob"),
                new PremiumMember("M004", "Kavin", "Platinum")
        };

        double totalMonthlyFee = 0;

        for (Membership member : members) {
            member.printBenifits();

            double fee = member.calculateMonthlyFee();
            System.out.println("Monthly fee: " + fee);
            System.out.println();

            totalMonthlyFee += fee;
        }

        System.out.println("Total Monthly Fee: " + totalMonthlyFee);

    }

}
