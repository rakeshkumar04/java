interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Transaction {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawed. Your Current balance: Rs." + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class CurrentAccount implements Transaction {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: Rs." + balance);
        } else {
            System.out.println("Error on Deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawed. Your Current balance is Rs." + balance);
        } else {
            System.out.println("Error on Withdrawal");
        }
    }
}

public class AccountCreation {
    public static void main(String[] args) {
        Transaction savingsAccount = new SavingsAccount(1000.0);
        Transaction currentAccount = new CurrentAccount(2000.0);

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(500.0);
    }
}