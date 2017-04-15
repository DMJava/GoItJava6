package core.dima.practice.module09.task0901;


import com.sun.org.apache.xpath.internal.operations.Or;
import core.dima.practice.module07.task0701.Currency;
import core.dima.practice.module07.task0701.Order;
import core.dima.practice.module07.task0701.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LambdasTask lambdasTask = new LambdasTask();
        List<User> users = new ArrayList<User>();
        User user = new User(7898, "Ivan", "Petrov", "Kiev", 20000);
        User user2 = new User(9865, "Vita", "Sidorov", "Kharkov", 10000);
        User user3 = new User(4253, "Kola", "Plov", "Sumy", 30000);
        User user4 = new User(5677, "Lexa", "Yov", "Kiev", 40000);
        User user5 = new User(8555, "Dima", "Klov", "Kiev", 25000);
        User user6 = new User(1412, "Denya", "CCC", "Kiev", 24000);
        User user7 = new User(1545, "Sanya", "Amigo", "Lvov", 23000);
        User user8 = new User(4566, "Jora", "Lototo", "Kiev", 22000);
        User user9 = new User(5785, "Vera", "AZAZAZAZ", "Kiev", 22000);
        User user10 = new User(3333, "Nina", "OOOOO", "Lvov", 150000);

        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order(4565, 1500, Currency.USD, "Iphone", "AAA", user));
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(4747, 110, Currency.UAH, "Delf", "CCC", user3));
        orders.add(new Order(4848, 900, Currency.USD, "Xaomi", "DDD", user4));
        orders.add(new Order(4949, 1500, Currency.USD, "Dell", "EEE", user5));
        orders.add(new Order(4444, 900, Currency.USD, "Acer", "ZZZ", user6));
        orders.add(new Order(4433, 800, Currency.USD, "Nord", "GGG", user7));
        orders.add(new Order(4563, 2000, Currency.UAH, "Sony", "HHH", user8));
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));


//        System.out.println("--PriceDown---");
//        lambdasTask.PriceDown(orders);
//        for (Order o : orders) {
//            System.out.println(o);
//        }
//
//        System.out.println("---PriceUpAndCity---");
//        lambdasTask.PriceUpAndCity(orders, users);
//        for (Order o : orders) {
//            System.out.println(o);
//        }
//
//        System.out.println("---itemNameIdAndUserCity---");
//        lambdasTask.itemNameIdAndUserCity(orders);
//        for (Order o : orders) {
//            System.out.println(o);
//        }
//
//        System.out.println("---deleteSameOrder---");
//        lambdasTask.deleteSameOrder(orders);


//        System.out.println("---deletePriceLess1500---");
//        lambdasTask.deletePriceLess1500(orders);

//        System.out.println("---separateOnListUAHandListUSD---");
//        lambdasTask.separateOnListUAHandListUSD(orders);

//
//        System.out.println("---listsOfUniqueUsersCity---");
//        lambdasTask.listsOfUniqueUsersCity(orders);
//
//       System.out.println("---setWithPetrovSurname---");
//        lambdasTask.setWithPetrovSurname(orders, users);
//

        System.out.println("---deleteOrdersWithUSD---");
        lambdasTask.deleteOrdersWithUSD(orders);

    }
}
