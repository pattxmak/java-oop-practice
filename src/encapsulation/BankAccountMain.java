package encapsulation;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "001-123-4567",
                "Aom",
                1000
        );

        account.printInfo();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);
        account.withdraw(-50);
        System.out.println(account.getBalance());

    }
}
