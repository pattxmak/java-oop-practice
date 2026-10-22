package abstracts;

public class PaymentMain {


    public static void main(String[] args) {

//        Payment payment = new PromptPayPayment("tewst", 500, "0000000");

        Payment[] payments = {
                new CreditCardPayment("P001", 1250, "1234"),
                new PromptPayPayment("P002", 500, "0812345678")
        };

        for (Payment payment : payments) {
            payment.pay();
        }

    }
}



