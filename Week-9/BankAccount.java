public class BankAccount {
    private int balance = 0;
    private boolean isOpen = false;

    
    public synchronized void open() throws BankAccountActionInvalidException {
        if (isOpen) throw new BankAccountActionInvalidException("Account is already open");
        isOpen = true;
        balance = 0;
    }

    
    public synchronized void close() throws BankAccountActionInvalidException {
        if (!isOpen) throw new BankAccountActionInvalidException("Account is already closed");
        isOpen = false;
    }

   
    public synchronized int getBalance() throws BankAccountActionInvalidException {
        checkAccount();
        return balance;
    }

    
    public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        checkAccount();
        if (amount < 0) throw new BankAccountActionInvalidException("Cannot deposit negative amount");
        balance += amount;
    }

    
    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        checkAccount();
        if (amount < 0) throw new BankAccountActionInvalidException("Cannot withdraw negative amount");
        if (amount > balance) throw new BankAccountActionInvalidException("Cannot withdraw more than balance");
        balance -= amount;
    }

   
    private void checkAccount() throws BankAccountActionInvalidException {
        if (!isOpen) throw new BankAccountActionInvalidException("Account is closed");
    }
}


class BankAccountActionInvalidException extends Exception {
    public BankAccountActionInvalidException(String message) {
        super(message);
    }
}