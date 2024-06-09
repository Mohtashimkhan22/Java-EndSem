import java.util.Scanner;

class Bank {
    private static int accountCounter = 1000;

    private String depositorName;
    private String depositorAddress;
    private int accountNumber;
    private double balance;

    public Bank(String name, String address, double initialBalance) {
        this.depositorName = name;
        this.depositorAddress = address;
        this.accountNumber = ++accountCounter;
        this.balance = initialBalance;
    }

    public void displayInfo() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Depositor Address: " + depositorAddress);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void changeAddress(String newAddress) {
        this.depositorAddress = newAddress;
        System.out.println("Address changed successfully.");
    }
}

public class q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Bank[] accounts = new Bank[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            System.out.println("Enter details for depositor #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            accounts[i] = new Bank(name, address, balance);
        }

        // Printing information of any depositor
        System.out.println("\nInformation of depositor #2:");
        accounts[1].displayInfo();

        // Adding some amount to the account of any depositor
        System.out.println("\nAdding 500 to the account of depositor #1:");
        accounts[0].deposit(500);

        // Removing some amount from the account of any depositor
        System.out.println("\nWithdrawing 200 from the account of depositor #3:");
        accounts[2].withdraw(200);

        // Changing address of any depositor
        System.out.println("\nChanging address of depositor #2:");
        accounts[1].changeAddress("New Address, XYZ");

        // Printing final information of any depositor
        System.out.println("\nFinal information of depositor #1:");
        accounts[0].displayInfo();

        scanner.close();
    }
}