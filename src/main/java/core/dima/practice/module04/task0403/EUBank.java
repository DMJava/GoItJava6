package core.dima.practice.module04.task0403;

import core.dima.practice.module04.task0401.Bank;
import core.dima.practice.module04.task0402.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public final static int LIMIT_OF_WITHDRAWAL1 = 2000;
    public final static int LIMIT_OF_WITHDRAWAL2 = 2200;
    public final static int LIMIT_OF_FUNDING1 = 20000;
    public final static int LIMIT_OF_FUNDING2 = 10000;
    public final static int MONTLY_RATE_PERCENT1 = 0;
    public final static int MONTLY_RATE_PERCENT2 = 1;
    public final static int COMISSION1 = 5;
    public final static int COMISSION2 = 7;
    public final static int COMISSION3 = 2;
    public final static int COMISSION4 = 4;
    public final static int WITHDRAWAL_AMOUNT = 1000;

    public int getLimitOfWithdrawal() {
        if (super.getCurrency() == Currency.USD) {
            System.out.println("Limit of Withdraw is" + LIMIT_OF_WITHDRAWAL1);
        } else {
            if (super.getCurrency() == Currency.EUR) {
                System.out.println("Limit of Withdraw is" + LIMIT_OF_WITHDRAWAL2);
            }
        }
        return 0;
    }

    public int getLimitOfFunding() {
        if (super.getCurrency() == Currency.EUR) {
            System.out.println("Limit of Funding is: " + LIMIT_OF_FUNDING1);
        } else {
            if (super.getCurrency() == Currency.USD) {
                System.out.println("Limit of Funding is: " + LIMIT_OF_FUNDING2);
            }
        }
        return 0;
    }

    public int getMonthlyRate() {
        if (super.getCurrency() == Currency.USD) {
            System.out.println("Monthly rate is: " + MONTLY_RATE_PERCENT1 + " percent");
        } else {
            if (super.getCurrency() == Currency.EUR) {
                System.out.println("Monthly rate is: " + MONTLY_RATE_PERCENT2 + " percent");
            }
        }
        return 0;
    }

    public int getCommission(int summ) {
        if (super.getCurrency() == Currency.USD && (summ < WITHDRAWAL_AMOUNT)) {
            System.out.println("Comission is: " + COMISSION1 + " percent");
        } else {
            if (super.getCurrency() == Currency.USD && (summ >= WITHDRAWAL_AMOUNT)) {
                System.out.println("Comission is: " + COMISSION2 + " percent");
            } else {
                if (super.getCurrency() == Currency.EUR && (summ < WITHDRAWAL_AMOUNT)) {
                    System.out.println("Comission is: " + COMISSION3 + " percent");
                } else {
                    if (super.getCurrency() == Currency.EUR && (summ >= WITHDRAWAL_AMOUNT)) {
                        System.out.println("Comission is: " + COMISSION4 + " percent");
                    }
                }
            }
        }
        return 0;
    }
}
