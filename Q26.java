import java.util.Scanner;

class BankManagement {
    int accountNumber;
    String holderName;
    double balance;

    // Method to create account
    void createAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
        System.out.println("Account Created Successfully!");
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display account details
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManagement bm = new BankManagement();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        bm.createAccount(accNo, name, bal);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    bm.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    bm.withdraw(wd);
                    break;
                case 3:
                    bm.displayAccount();
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Management System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
