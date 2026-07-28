import java.util.*;
 
class BankAccountActionInvalidException extends Exception {
    public BankAccountActionInvalidException(String message) {
        super(message);
    }
}

class BankAccount {

    private int balance;
    private boolean isOpen;

    public BankAccount() {
        this.balance = 0;
        this.isOpen = false;
    }

    public synchronized void open() throws BankAccountActionInvalidException {
        if (isOpen) {
            throw new BankAccountActionInvalidException("Account already open");
        }
        this.isOpen = true;
        this.balance = 0;
    }

    public synchronized void close() throws BankAccountActionInvalidException {
        if (!isOpen) {
            throw new BankAccountActionInvalidException("Account not open");
        }
        this.isOpen = false;
    }

    public synchronized int getBalance() throws BankAccountActionInvalidException {
        checkIfAccountIsOpen();
        return this.balance;
    }

    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        checkIfAccountIsOpen();
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit negative amount");
        }
        this.balance += amount;
    }

    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        checkIfAccountIsOpen();
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw negative amount");
        }
        if (amount > this.balance) {
            throw new BankAccountActionInvalidException("Insufficient funds");
        }
        this.balance -= amount;
    }

    private void checkIfAccountIsOpen() throws BankAccountActionInvalidException {
        if (!isOpen) {
            throw new BankAccountActionInvalidException("Account is closed");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount();
            account.open();
            account.deposit(500);
            System.out.println("Current Balance: " + account.getBalance()); // Output: 500
            
            account.withdraw(200);
            System.out.println("After Withdraw: " + account.getBalance()); // Output: 300
            
            account.close();
        } 
        catch (BankAccountActionInvalidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}