package abstracts;

public abstract class Payment {

    private final String paymentId;

    private final double amount;

    public Payment(String paymentId, double amount) {

        if (paymentId == null || paymentId.isBlank()) {
            throw new IllegalArgumentException("Payment Id cannot be null");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("amount must be greater than 0");
        }

        this.paymentId = paymentId;
        this.amount = amount;
    }

    public final double getAmount() {
        return amount;
    }

    public final String getPaymentId() {
        return paymentId;
    }

    // this is an abstract method
    public abstract void pay();
}


