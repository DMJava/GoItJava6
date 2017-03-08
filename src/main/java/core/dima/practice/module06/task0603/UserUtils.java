package core.dima.practice.module06.task0603;

import core.dima.practice.module06.task0602.User;

public class UserUtils {


   public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {


        }

        return result;
    }

    //    //users are equal when all their field are equal
//    User[] usersWithContitionalBalance(User[] users, int balance)
//    //user’s balance == balance
//    public final static User[] paySalaryToUsers(User[] users)
//    public final static long[] getUsersId(User[] users)
//    User[] deleteEmptyUsers(User[] users)

    User[] users = new User[7];

    public UserUtils() {
        User user1 = new User(4556, "Bob", "WWW", 10000, 50000);
        User user2 = new User(4556, "Bob", "WWW", 10000, 50000);
        User user3 = new User(9845, "John", "bbb", 9000, 50000);
        User user4 = new User(4556, "VIK", "AAA", 8000, 50000);
        User user5 = new User(9823, "Lucky", "zzz", 17000, 70000);
        User user6 = new User(4585, "Igor", "ooo", 16000, 80000);
        User user7 = new User(4513, "Todd", "oaoa", 5000, 30000);
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;
        users[6] = user7;
    }
}
