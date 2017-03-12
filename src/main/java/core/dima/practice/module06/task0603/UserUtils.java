package core.dima.practice.module06.task0603;

import core.dima.practice.module06.task0601.ArraysUtils;
import core.dima.practice.module06.task0602.User;

import java.util.Arrays;


public final class UserUtils {
    public UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        int count = 0;
        boolean finish = false;
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (users[i].equals(result[j])) {
                    finish = true;
                }
            }
            if (!finish) {
                result[count] = users[i];
                count++;
                finish = false;
            }
        }
        result = Arrays.copyOf(result, count);
        System.out.print(Arrays.toString(result));

        return result;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] result2 = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                result2[count] = users[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(result2));
        return result2;
    }

    public final static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getSalary() + user.getBalance());
        }
        System.out.println(Arrays.asList(users));
        return users;
    }

    public final static long[] getUsersId(User[] users) {
        long[] usersID = new long[users.length];
        for (int i = 0; i < users.length; i++)
            usersID[i] = users[i].getId();
        System.out.println(Arrays.toString(usersID));
        return usersID;

    }

    public final static User[] deleteEmptyUsers(User[] users) {
        User[] finalArray = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                break;
            }
            if (users[i] != null) {
                finalArray[count] = users[i];
                count++;
            }
        }
            finalArray = Arrays.copyOf(finalArray, count);
        System.out.println(Arrays.toString(finalArray));
        return finalArray;
    }


//   1 User[] uniqueUsers(User[] users) – находит и возвращает уникальных пользователей (пользователи одинаковы,
//    когда все их поля совпадают)

//   2 User[] usersWithContitionalBalance(User[] users, int balance) – находит и возвращает пользователей, чей баланс равен заданному
//   3 User[]  paySalaryToUsers(User[] users) – начисляет зарплату в баланс каждому пользователю
//   4 long[] getUsersId(User[] users) – возвращает массив идентификаторов пользователей
//   5 User[] deleteEmptyUsers(User[] users) – находит и удаляет пустые элементы из массива
//    (в результате возвращается новый массив с меньшим размером)
        }
