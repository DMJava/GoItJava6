package core.dima.practice.module06.task0603;

import core.dima.practice.module06.task0602.User;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsersMain {
    public static void main(String[] args) {
        User[] users = new User[6];
        users[0] = new User(498956, "AAA", "BBB", 5000, 10000);
        users[1] = new User(562312, "CCC", "DDD", 6000, 11000);
        users[2] = new User(498900, "EE", "FF", 7000, 12000);
        users[3] = new User(784512, "KK", "MM", 8000, 13000);
        users[4] = new User(498563, "O", "N", 9000, 14000);
        users[5] = new User(498563, "O", "N", 9000, 14000);

        System.out.println();
        UserUtils.uniqueUsers(users);
        System.out.println();
        System.out.println();
        UserUtils.paySalaryToUsers(users);
        System.out.println();
        UserUtils.getUsersId(users);
        System.out.println();
        UserUtils.usersWithContitionalBalance(users, 15000);
        System.out.println();
        UserUtils.deleteEmptyUsers(users);

    }
}