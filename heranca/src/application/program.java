package application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.Poupace;

public class program {
    public static void main(String[] args) {
        Account c1 = new Account(1001,"Davi", 10000.00);
        c1.saque(9000.00);
        System.out.println(c1.getSaldo());

        Account c2 = new Poupace(1002, "Nicolas", 10000.00, 0.01);
        c2.saque(9000.00);
        System.out.println(c2.getSaldo());

        Account c3 = new BusinessAccount(1003, "Gustavo", 10000.00, 500.00);
        c3.saque(9000.00);
        System.out.println(c3.getSaldo());
    }

}
