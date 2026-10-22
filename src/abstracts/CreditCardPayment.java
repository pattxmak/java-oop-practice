package abstracts;


public class CreditCardPayment extends Payment {

    private String cardLast4;

    public CreditCardPayment(String paymentId, double amount, String cardLast4) {
        super(paymentId, amount);

        if (cardLast4 == null || cardLast4.isBlank()) {
            throw new IllegalArgumentException("Card Last 4 cannot be blank");
        }

        if (cardLast4.length() != 4 ) {
            throw new IllegalArgumentException("Length is not 4 or type of data is not number");
        }

        if (!cardLast4.matches("\\d{4}")) {
            throw new IllegalArgumentException("Card last 4 must contain exactly 4 digits");
        }

        this.cardLast4 = cardLast4;
    }

    public String getCardLast4() {
        return cardLast4;
    }

    @Override
    public void pay() {
        System.out.println("Paid " + getAmount() + " by credit card ending " + getCardLast4());
    }


}
