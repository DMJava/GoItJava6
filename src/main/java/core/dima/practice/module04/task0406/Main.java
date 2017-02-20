package core.dima.practice.module04.task0406;

import core.dima.practice.module04.task0402.Currency;
import core.dima.practice.module04.task0403.ChinaBank;
import core.dima.practice.module04.task0403.EUBank;
import core.dima.practice.module04.task0403.USBank;
import core.dima.practice.module04.task0404.User;
import core.dima.practice.module04.task0405.BankSystemImplementation;

public class Main {
    public static void main(String[] args) {
        ChinaBank chinaBank1 = new ChinaBank(536987, "China", Currency.EUR, 32, 6000, 3, 1500000L);
        ChinaBank chinaBank2 = new ChinaBank(789564, "China", Currency.USD, 42, 7000, 4, 1900000L);
        EUBank euBank1 = new EUBank(1532659874, "Switzerland", Currency.EUR, 30, 10000, 5, 1150000L);
        EUBank euBank2 = new EUBank(238956457, "Switzerland", Currency.USD, 35, 12000, 6, 1750000L);
        USBank usBank1 = new USBank(951357, "USA", Currency.EUR, 66, 10000, 5, 25000000L);
        USBank usBank2 = new USBank(65154545, "USA", Currency.USD, 40, 8000, 3, 5000000L);

        User user1 = new User(122222L, "Bob", 500.0, 5, "Duracell", 10000, chinaBank1);
        User user2 = new User(133333L, "Dod", 550.0, 6, "Duracell", 11000, chinaBank2);
        User user3 = new User(144444L, "Rob", 600.0, 7, "Pirelli", 12000, euBank1);
        User user4 = new User(155555L, "Gob", 650.0, 8, "DutyFree", 13000, euBank2);
        User user5 = new User(166666L, "Tob", 700.0, 5, "Ferrari", 110000, usBank1);
        User user6 = new User(177777L, "Lob", 1000.0, 5, "TrampLTD", 150000, usBank2);


        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());

        BankSystemImplementation bsi = new BankSystemImplementation();
        bsi.paySalary(user1);
        bsi.paySalary(user2);
        bsi.paySalary(user3);
        bsi.paySalary(user4);
        bsi.paySalary(user5);
        bsi.paySalary(user6);
        System.out.println();

        bsi.transferMoney(user6, user5, 50);
        bsi.transferMoney(user4, user3, 40);
        bsi.transferMoney(user2, user1, 30);
        System.out.println();

        bsi.withdrawOfUser(user1,10);
        bsi.withdrawOfUser(user2,50);
        bsi.withdrawOfUser(user3,60);
        bsi.withdrawOfUser(user4,70);
        bsi.withdrawOfUser(user5,80);
        bsi.withdrawOfUser(user6,90);
        System.out.println();

        bsi.fundUser(user1,50);
        bsi.fundUser(user2,60);
        bsi.fundUser(user3,70);
        bsi.fundUser(user4,80);
        bsi.fundUser(user5,90);
        bsi.fundUser(user6,99);
        System.out.println();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
    }
}
