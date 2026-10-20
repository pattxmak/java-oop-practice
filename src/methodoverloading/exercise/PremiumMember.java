package methodoverloading.exercise;

public class PremiumMember extends Membership{


    private String planName;

    public PremiumMember(String memberId, String name, String planName) {
        super(memberId, name);

        if (planName == null || planName.isBlank()) {
            throw new IllegalArgumentException("Plan cannot be null");
        }

        this.planName = planName;
    }

    @Override
    public void printBenifits() {
        System.out.println("Member: " + super.getName());
        System.out.println("Plan: " + planName);
        System.out.println("Benefits: Access to premium content, Download content");
        System.out.println("Ads: Disabled");
    }
}
