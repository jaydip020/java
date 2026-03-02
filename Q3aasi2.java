// Parent Class
class Account {
    String accountHolderName;
    double balance;

    void showDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Child Class 1
class SavingsAccount extends Account {
    double interestRate;

    // Method Overriding
    @Override
    void showDetails() {
        super.showDetails();

        if (balance >= 5000) {
            double interest = (balance * interestRate) / 100;
            System.out.println("Interest: " + interest);
        } else {
            System.out.println("Interest not applicable (Minimum balance 5000 required)");
        }
    }
}

// Child Class 2
class CurrentAccount extends Account {
    double withdrawalAmount;

    // Method Overriding
    @Override
    void showDetails() {
        super.showDetails();

        if (balance >= withdrawalAmount) {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {

        // Savings Account Object
        SavingsAccount sa = new SavingsAccount();
        sa.accountHolderName = "Rahul";
        sa.balance = 6000;
        sa.interestRate = 5;

        System.out.println("----- Savings Account -----");
        sa.showDetails();

        // Current Account Object
        CurrentAccount ca = new CurrentAccount();
        ca.accountHolderName = "Amit";
        ca.balance = 3000;
        ca.withdrawalAmount = 4000;

        System.out.println("\n----- Current Account -----");
        ca.showDetails();
    }
}
