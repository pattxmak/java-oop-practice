package encapsulation;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("001-123-4567","Aom", 1000);
        BankAccount account2 = new BankAccount("002-122-3356","Mei", 1500);

        account.printInfo();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);
        account.withdraw(-50);
        System.out.println(account.getBalance());

        account.printInfo();
        account2.printInfo();

        account2.transferTo(account, 2500);
        account2.transferTo(account, 300);

        BankAccount mildAccount = new BankAccount("005-555-5555", "Mild");
        System.out.println();
        mildAccount.printInfo();
    }
}
