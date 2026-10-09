package encapsulation;

public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account Number cannot be Empty");
        }

        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner Name cannot be Empty");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) {

        if (amount < 0) {
            System.out.println("amount cannot be negative");
            return;
        }

        this.balance += amount;
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("withdraw must be more than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("cannot withdraw more than your balance");
            return;
        }

        this.balance -= amount;
        System.out.println("Your balance is " + balance);
    }

    public void printInfo(){
        System.out.println("Account NO: " + getAccountNumber());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Balance: " + getBalance());
    }

    // transfer
    public void transferTo(BankAccount targetAccount, double amount) {

        if (targetAccount == null) {
            System.out.println("Target account cannot be null");
            return;
        }

        if (this == targetAccount) {
            System.out.println("You cannot transfer to you own account.");
            return;
        }

        if (amount < 0) {
            System.out.println("Transfer amount must greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Cannot transfer greater than balance.");
            return;
        }

        balance -= amount;
        targetAccount.deposit(amount);
        System.out.println("Transfer successfully!!!");
        System.out.println("Current balance: " + balance);
    }
}
