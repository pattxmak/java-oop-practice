package methodoverloading.exercise;

public class MembershipMain {

    public static void main(String[] args) {
        BasicMember basicMember = new BasicMember("M001", "Pattama");
        PremiumMember premiumMember = new PremiumMember("M002", "Mild", "Gold");

        basicMember.printBenifits();
        System.out.println();
        premiumMember.printBenifits();
    }

}
