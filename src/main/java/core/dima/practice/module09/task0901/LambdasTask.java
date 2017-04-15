package core.dima.practice.module09.task0901;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;
import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;
import com.sun.org.apache.xpath.internal.operations.Or;
import core.dima.practice.module07.task0701.Currency;
import core.dima.practice.module07.task0701.Order;
import core.dima.practice.module07.task0701.User;

import java.util.*;
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
    }

    public void PriceDown(List<Order> orders) {
        orders.sort(Comparator.comparing(Order::getPrice).reversed());
    }

    public void PriceUpAndCity(List<Order> orders, List<User> users) {
        orders.stream().map(order -> order.getUser().getCity() + order.getPrice());
    }

    public void itemNameIdAndUserCity(List<Order> orders) {
        orders.stream().map(order -> order.getItemName() + order.getId() + order.getUser().getCity());
    }

    public void deleteSameOrder(List<Order> orders) {
        orders.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    public void deletePriceLess1500(List<Order> orders) {
        orders.stream().filter(order -> order.getPrice() <= 1500).forEach(System.out::println);
    }

    public void separateOnListUAHandListUSD(List<Order> orders) {
        orders.stream().filter(order -> order.getCurrency().equals(Currency.UAH)).forEach(System.out::println);
        orders.stream().filter(order -> order.getCurrency().equals(Currency.USD)).forEach(System.out::println);
    }

    public void listsOfUniqueUsersCity(List<Order> orders) {
        orders.stream().filter(order -> order.getUser().getCity().equals("Kiev")).forEach(System.out::println);
        orders.stream().filter(order -> order.getUser().getCity().equals("Kharkov")).forEach(System.out::println);
        orders.stream().filter(order -> order.getUser().getCity().equals("Lvov")).forEach(System.out::println);
        orders.stream().filter(order -> order.getUser().getCity().equals("Sumy")).forEach(System.out::println);
    }

    public void setWithPetrovSurname(List<Order> orders, List<User> users) {
        orders.stream().filter(order -> order.getUser().getLastName().equals("Petrov")).forEach(System.out::println);
    }

    public void deleteOrdersWithUSD(List<Order> orders) {
        orders.stream().filter(order -> order.getCurrency().equals(Currency.USD)).collect(Collectors.toList());

        orders.removeAll(orders);
        orders.forEach(System.out::println);
    }
}