package core.dima.practice.module04.task0403;

import core.dima.practice.module04.task0401.Bank;
import core.dima.practice.module04.task0402.Currency;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public final static int LIMIT_OF_WITHDRAWAL1 = 100;
    public final static int LIMIT_OF_WITHDRAWAL2 = 150;
    public final static int LIMIT_OF_FUNDING1 = 5000;
    public final static int LIMIT_OF_FUNDING2 = 10000;
    public final static int MONTLY_RATE_PERCENT1 = 1;
    public final static int MONTLY_RATE_PERCENT2 = 0;
    public final static int COMISSION1 = 3;
    public final static int COMISSION2 = 5;
    public final static int COMISSION3 = 10;
    public final static int COMISSION4 = 11;
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
