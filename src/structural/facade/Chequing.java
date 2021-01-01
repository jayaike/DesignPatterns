package structural.facade;

import java.math.BigDecimal;

public class Chequing implements IAccount {
    int accountNumber;
    BigDecimal amount;

    public Chequing(BigDecimal amount) {
        this.accountNumber = (int) (Math.random() * 1000000);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing to chequing account");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing from chequing account");
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        System.out.println("Transfering from chequing account to " + toAccount.getAccountNumber());
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
