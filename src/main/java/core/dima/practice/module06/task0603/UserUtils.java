package core.dima.practice.module06.task0603;

import core.dima.practice.module06.task0602.User;

import java.util.Arrays;

public final class UserUtils {
    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (Arrays.equals(users, users)) {
                result[i] = users[i];
            }
        }
        return result;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] result2 = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance){

            }

        }
        return result2;
    }

//    //user’s balance == balance


//    public final static User[] paySalaryToUsers(User[] users)
//    public final static long[] getUsersId(User[] users)
//    User[] deleteEmptyUsers(User[] users)
}
