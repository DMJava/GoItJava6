package core.dima.practice.module04.task0403;

import core.dima.practice.module04.task0401.Bank;
import core.dima.practice.module04.task0402.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (super.getCurrency() == Currency.USD) {
            System.out.println("Limit of Withdraw is" + 2000);
        } else {
            if (super.getCurrency() == Currency.EUR) {
                System.out.println("Limit of Withdraw is" + 2200);
            }
        }
        return 0;
    }

    public int getLimitOfFunding() {
        if (super.getCurrency() == Currency.EUR) {
            System.out.println("Limit of Funding is: " + 20000);
        } else {
            if (super.getCurrency() == Currency.USD) {
                System.out.println("Limit of Funding is: " + 10000);
            }
        }
        return 0;
    }

    public int getMonthlyRate() {
        if (super.getCurrency() == Currency.USD) {
            System.out.println("Monthly rate is: " + 0 + " percent");
        } else {
            if (super.getCurrency() == Currency.EUR) {
                System.out.println("Monthly rate is: " + 1 + " percent");
            }
        }
        return 0;
    }

    public int getCommission(int summ) {
        if (super.getCurrency() == Currency.USD && (summ < 1000)) {
            System.out.println("Comission is: " + 5 + " percent");
        } else {
            if (super.getCurrency() == Currency.USD && (summ >= 1000)) {
                System.out.println("Comission is: " + 7 + " percent");
            } else {
                if (super.getCurrency() == Currency.EUR && (summ < 1000)) {
                    System.out.println("Comission is: " + 2 + " percent");
                } else {
                    if (super.getCurrency() == Currency.EUR && (summ >= 1000)) {
                        System.out.println("Comission is: " + 4 + " percent");
                    }
                }
            }
        }
        return 0;
    }
}
