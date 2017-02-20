package core.dima.practice.module04.task0405;

import core.dima.practice.module04.task0404.User;

public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
