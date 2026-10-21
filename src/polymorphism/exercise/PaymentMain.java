package polymorphism.exercise;

public class PaymentMain {

    public static void main(String[] args) {

        Payment[] payments = {
                new CreditCardPayment("P001", 1250, "1234"),
                new PromptPayPayment("P002", 500, "0812345678"),
                new CreditCardPayment("P003", 99.50, "5678"),
                new CreditCardPayment("P003", 99.50, "ABCD")
        };

        double totalAmount = 0;

        for (Payment payment : payments) {
            payment.pay();
            totalAmount += payment.getAmount();
        }

        System.out.println("Total payment amount: " + totalAmount);

    }
}
