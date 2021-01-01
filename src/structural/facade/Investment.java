package structural.facade;

import java.math.BigDecimal;

public class Investment implements IAccount {
    int accountNumber;
    BigDecimal amount;

    public Investment(BigDecimal amount) {
        this.accountNumber = (int) (Math.random() * 1000000);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing to investment account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing from investment account");
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        System.out.println("Transfering from investment account to " + toAccount.getAccountNumber());
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
