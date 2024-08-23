import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize account holder name and balance
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new bank account
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name);

        int choice;

        do {
            // Display menu
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    // Check balance
                    account.checkBalance();
                    break;
                case 4:
                    // Display account details
                    account.displayAccountDetails();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
