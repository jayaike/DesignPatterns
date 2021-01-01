package structural.facade;

import java.math.BigDecimal;

public class Savings implements IAccount {
    int accountNumber;
    BigDecimal amount;

    public Savings(BigDecimal amount) {
        this.accountNumber = (int) (Math.random() * 1000000);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing to savings account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing from savings account");
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        System.out.println("Transferring from savings account to " + toAccount.getAccountNumber());
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
