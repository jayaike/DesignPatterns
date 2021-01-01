package structural.facade;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySaving = bankService.createNewAccount("savings", new
                        BigDecimal(500.00));
        
        int myInvestment = bankService.createNewAccount("investment", new BigDecimal(1000.00));

        bankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));
    }
}
