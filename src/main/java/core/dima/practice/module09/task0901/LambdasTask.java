package core.dima.practice.module09.task0901;

import core.dima.practice.module07.task0701.Currency;
import core.dima.practice.module07.task0701.Order;
import core.dima.practice.module07.task0701.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasTask {

    public static void main(String[] args) {
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
        orders.add(new Order(4565, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(4565, 110, Currency.UAH, "Delf", "CCC", user3));
        orders.add(new Order(4565, 900, Currency.USD, "Xaomi", "DDD", user4));
        orders.add(new Order(4565, 1500, Currency.USD, "Dell", "EEE", user5));
        orders.add(new Order(4565, 900, Currency.USD, "Acer", "ZZZ", user6));
        orders.add(new Order(4565, 800, Currency.USD, "Nord", "GGG", user7));
        orders.add(new Order(4565, 2000, Currency.UAH, "Sony", "HHH", user8));
        orders.add(new Order(4565, 3000, Currency.UAH, "Davos", "JJJ", user9));
        orders.add(new Order(4565, 2100, Currency.USD, "BMW", "ZZZ", user10));

        System.out.println("---- список за ценой заказа по убыванию ---");

        System.out.println("--- список за ценой заказа по возрастанию и за городом пользователя ---");

        System.out.println("---- список за наименованием товара, идентификатором заказа, и городом пользователя---");

    }

    public void PriceDown(List<Order> orders) {
        Collections.sort(orders, (Comparator<Order>) (o1, o2) -> {
            return o2.getPrice() - o1.getPrice();
        });
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void PriceUpAndCity(List<Order> orders) {
        Collections.sort(orders, (Comparator<Order>) (o1, o2) -> {
            int i = o2.getUser().getCity().compareTo(o1.getUser().getCity());
            if (i == 0) {
                i = o1.getPrice() - o2.getPrice();
            }
            return i;
        });
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void itemNameIdAndUserCity(List<Order> orders) {
        Collections.sort(orders, (Comparator<Order>) (o1, o2) -> {
            int i = o2.getUser().getCity().compareTo(o1.getUser().getCity());
            if (i == 0) {
                i = o1.getItemName().compareTo(o2.getItemName());
            }
            if (i == 0 ){
                i = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            return i;
        });
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
