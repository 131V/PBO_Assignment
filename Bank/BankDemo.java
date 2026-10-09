import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args){
        Bank balance = new Bank(100000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bank ABC");
        System.err.println("");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Total Valid Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + balance.getBalance());
            } else if (choice == 2) {
                System.out.print("Deposit amount: ");
                double deposit = scanner.nextDouble();
                balance.deposit(deposit);
                System.out.println("Current balance: " + balance.getBalance());
            } else if (choice == 3) {
                System.out.print("Withdraw amount: ");
                double withdraw = scanner.nextDouble();
                balance.withdraw(withdraw);
                System.out.println("Current balance: " + balance.getBalance());
            } else if (choice == 4) {
                System.out.println("Total valid transactions: " + balance.getValidTransaction());
            } else if (choice == 5) {
                System.out.println("Thank you for using Bank ABC!");
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        scanner.close();
    }
}
