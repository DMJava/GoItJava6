package core.dima.practice.module07.task0701;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Order{

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public int getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public User getUser() {
        return user;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }
}