package core.dima.practice.module04.task0405;


import core.dima.practice.module04.task0401.Bank;
import core.dima.practice.module04.task0404.User;

public class BankSystemImplementation implements BankSystem {
    public void withdrawOfUser(User user, int amount) {
        double balance = user.getBalance();
        int comission = user.getBank().getCommission(amount);
        int limitOfWithdraw = user.getBank().getLimitOfWithdrawal();
        double amountWithComission = (amount + (amount * (comission / 100)));
        if (amountWithComission > limitOfWithdraw) {
            System.out.println("Sorry, You exceeded the limit of cash withdrawal");
        } else {
            if (balance < amountWithComission) {
                System.out.println("Sorry, operation cannot be performed");
            } else {
                balance -= amountWithComission;
            }
        }
        user.setBalance(balance);
    }

    public void fundUser(User user, int amount) {
        double balance = user.getBalance();
        int limitOfFunding = user.getBank().getLimitOfFunding();
        if (amount > limitOfFunding) {
            System.out.println("Operation cancelled");
        } else {
            balance += amount;
        }
        user.setBalance(balance);
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        double balFrom = fromUser.getBalance();
        double balTo = toUser.getBalance();
        if (amount > balFrom) {
            System.out.println("Operation can not be performed");
        } else {
            balFrom -= amount;
            balTo += amount;
        }
        fromUser.setBalance(balFrom);
        toUser.setBalance(balTo);
    }

    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
