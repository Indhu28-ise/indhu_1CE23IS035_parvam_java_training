class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public Account(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
public class AccountDemo {
    public static void main(String[] args) {
        Account acc1 = new Account("indhuananda", "1234567890", 5000.0);
        System.out.println("Initial Account Details:");
        acc1.display();
        acc1.deposit(1500.0);
        acc1.withdraw(2000.0);
        System.out.println("\nUpdated Account Details:");
        acc1.display();
    }
}