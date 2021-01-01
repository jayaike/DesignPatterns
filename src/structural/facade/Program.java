package structural.facade;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int account = bankService.createNewAccount("savings", BigDecimal.valueOf(41600));

        System.out.print(account);
    }
}
