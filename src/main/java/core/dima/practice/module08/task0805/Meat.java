package core.dima.practice.module08.task0805;

import core.dima.practice.module08.task0801.Country;
import core.dima.practice.module08.task0801.IdGenerator;
import core.dima.practice.module08.task0802.Food;

public class Meat {

    private double price;
    private String name;
    private int id;

    public Meat(double price, String name, int id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public Meat( String name,double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
