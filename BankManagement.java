
import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;
        int choice;

        while (true) {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance = balance + amount;
                    System.out.println("Deposit successful!");
                    System.out.println("Current Balance: " + balance);
                } else {
                    System.out.println("Invalid deposit amount!");
                }

            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid withdrawal amount!");
                } else if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful!");
                    System.out.println("Current Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }

            } else if (choice == 3) {
                System.out.println("Current Balance: " + balance);

            } else if (choice == 4) {
                System.out.println("Thank you for using our bank!");
                break;

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
