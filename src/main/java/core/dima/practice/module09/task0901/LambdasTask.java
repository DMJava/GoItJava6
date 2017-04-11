package core.dima.practice.module09.task0901;

import com.sun.org.apache.xpath.internal.operations.Or;
import core.dima.practice.module07.task0701.Currency;
import core.dima.practice.module07.task0701.Order;
import core.dima.practice.module07.task0701.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(4747, 110, Currency.UAH, "Delf", "CCC", user3));
        orders.add(new Order(4848, 900, Currency.USD, "Xaomi", "DDD", user4));
        orders.add(new Order(4949, 1500, Currency.USD, "Dell", "EEE", user5));
        orders.add(new Order(4444, 900, Currency.USD, "Acer", "ZZZ", user6));
        orders.add(new Order(4433, 800, Currency.USD, "Nord", "GGG", user7));
        orders.add(new Order(4563, 2000, Currency.UAH, "Sony", "HHH", user8));
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));
        orders.add(new Order(4646, 1700, Currency.UAH, "Samsung", "BBB", user2));

        System.out.println("--- список за ценой заказа по возрастанию и за городом пользователя ---");

        System.out.println("---- список за наименованием товара, идентификатором заказа, и городом пользователя---");


    }

    public void PriceDown(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice).reversed());
        System.out.println(orders);
    }

    public void PriceUpAndCity(List<Order> orders, List<User> users) {
        orders.sort(Comparator.comparing(Order::getPrice));
        users.sort(Comparator.comparing(User::getCity));
        System.out.println(orders);
    }

    public void itemNameIdAndUserCity(List<Order> orders) {
        List<Order> byCityAndNAme = orders.stream().sorted(((o1, o2) -> o1.getUser().getCity() != o2.getUser().getCity() ?
                o1.getUser().getCity().compareTo(o2.getUser().getCity()) : o1.getItemName().compareTo(o2.getItemName()))).collect(Collectors.toList());
        byCityAndNAme = orders.stream().sorted(((o1, o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator()))).collect(Collectors.toList());
        System.out.println(byCityAndNAme);

//        Collections.sort(orders, (o1, o2) -> {
//            int i = o2.getUser().getCity().compareTo(o1.getUser().getCity());
//            if (i == 0) {
//                i = o1.getItemName().compareTo(o2.getItemName());
//            }
//            if (i == 0) {
//                i = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
//            }
//            return i;
//        });
//        for (Order o : orders) {
//            System.out.println(o);
//        }
    }

    public void deleteSameOrder(List<Order> orders) {
        List<Order> list = orders.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    public void deletePriceLess1500(List<Order> orders) {
        orders.stream().filter(order -> order.getPrice() > 1500).forEach(System.out::println);
    }

    public void separateOnListUAHandListUSD(List<Order> orders) {
        List<Order> orderList1 = orders.stream().filter(order -> order.equals(Currency.UAH)).collect(Collectors.toList());
        List<Order> orderList2 = orders.stream().filter(order -> order.equals(Currency.USD)).collect(Collectors.toList());
        System.out.println(orderList1);
        System.out.println(orderList2);
    }

    public void listsOfUniqueUsersCity(List<Order> orders) {
        orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity().contains("Kiev")));
        orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity().contains("Sumy")));
        orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity().contains("Kharkov")));
        orders.stream().collect(Collectors.groupingBy(o -> o.getUser().getCity().contains("Lvov")));
        System.out.println(orders);
    }

    public void setWithPetrovSurname(List<Order> orders) {
        orders.stream().allMatch("Petrov"::equals);
        System.out.println(orders);
    }

    public void deleteOrdersWithUSD(List<Order> orders) {
        orders.stream().filter(order -> order.equals(Currency.UAH)).collect(Collectors.toList());
        separateOnListUAHandListUSD(orders);
    }
}
//        -удалите дублированные данные со списка
//        -удалите объекты, где цена меньше 1500
//        -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
//        -разделите список на 2 списка - заказы в долларах и в гривнах
//        -удалите заказы в USD
//        -разделите список на столько списков, сколько уникальных городов в User
