package polymorphism.exercise;

public class PromptPayPayment extends Payment{

    private String promptPayId;

    public PromptPayPayment(String paymentId, double amount, String promptPayId) {
        super(paymentId, amount);

        if (promptPayId == null || promptPayId.isBlank()) {
            throw new IllegalArgumentException("Promptpay Id cannot be blank");
        }

        this.promptPayId = promptPayId;
    }

    public String getPromptPayId() {
        return promptPayId;
    }

    @Override
    public void pay() {
        System.out.println("Paid " + getAmount() + " via PromptPay: " + getPromptPayId());
    }
}
