package core.dima.practice.module07.task0703;

import com.sun.org.apache.xpath.internal.operations.Or;
import core.dima.practice.module07.task0701.Currency;
import core.dima.practice.module07.task0701.Order;
import core.dima.practice.module07.task0701.User;

import java.util.*;

import static core.dima.practice.module07.task0701.Currency.USD;

public class Main {


    public static void main(String[] args) {
        SortedSet<User> users = new TreeSet<User>();
        User user2 = new User(9865, "Vita", "Sidorov", "Kharkov", 10000);
        User user3 = new User(4253, "Kola", "Plov", "Sumy", 30000);
        User user4 = new User(5677, "Lexa", "Yov", "Kiev", 40000);
        User user5 = new User(8555, "Dima", "Klov", "Kiev", 25000);
        User user = new User(7898, "Ivan", "Petrov", "Kiev", 20000);
        User user6 = new User(1412, "Denya", "CCC", "Kiev", 24000);
        User user7 = new User(1545, "Sanya", "Amigo", "Lvov", 23000);
        User user8 = new User(4566, "Jora", "Lototo", "Kiev", 22000);
        User user9 = new User(5785, "Vera", "AZAZAZAZ", "Kiev", 22000);
        User user10 = new User(3333, "Nina", "OOOOO", "Lvov", 150000);

        Set<Order> orders = new TreeSet<Order>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        orders.add(new Order(4565, 1500, USD, "Iphone", "AAA", user));
        orders.add(new Order(7898, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(1234, 110, Currency.UAH, "Xiomi", "CCC", user3));
        orders.add(new Order(3456, 900, USD, "Google", "DDD", user4));
        orders.add(new Order(5696, 1500, USD, "Luxoft", "EEE", user5));
        orders.add(new Order(9641, 900, USD, "Jameson", "GGG", user6));
        orders.add(new Order(3202, 800, USD, "Duracell", "JJJ", user7));
        orders.add(new Order(2002, 2000, Currency.UAH, "Star", "OOO", user8));
        orders.add(new Order(8531, 3000, Currency.UAH, "ATB", "VVV", user9));
        orders.add(new Order(4565, 1500, USD, "Iphone", "AAA", user));

        System.out.println("--------------заказ где есть фамилия Петров-------------");

        for (Order order : orders) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println(order);
            }
        }
        System.out.println("--------------заказ с наибольшей ценой, используя только один сет-метод - get-----------------");


        int index = 0;
        Object orderWanted = orders.toArray()[index];
        System.out.println(orderWanted);


        System.out.println("---------------удалите заказы, где валюта доллар, используя Iterator------------------------------");


        Iterator<Order> iterator = orders.iterator();
        Order order;
        while (iterator.hasNext()) {
            order = iterator.next();
            if (order.getCurrency().equals(USD)) {
                System.out.println(order.getCurrency() + " " + " Deleted ");
                iterator.remove();
                System.out.println(order);
            }
        }
    }
}