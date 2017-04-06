package core.dima.practice.module08.task0805;

import core.dima.practice.module08.task0801.Country;
import core.dima.practice.module08.task0801.IdGenerator;
import core.dima.practice.module08.task0802.Food;
import core.dima.practice.module08.task0803.IManageSystem;
import core.dima.practice.module08.task0804.IManageSystemImplemetnation;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static core.dima.practice.module08.task0801.Country.*;

public class Main {
    public static void main(String[] args) {

        IManageSystemImplemetnation<Food> iMsI = new IManageSystemImplemetnation<Food>();
        iMsI.save(new Food("Apple", UKRAINE, 30));
        iMsI.save(new Food("Milk", UKRAINE, 50));
        iMsI.save(new Food("Meat", UKRAINE, 60));
        iMsI.save(new Food("Broad", USA, 80));
        iMsI.save(new Food("Oranges", CHINA, 200));
        iMsI.save(new Food("Rice", CHINA, 200));
        iMsI.save(new Food("Hijashi", CHINA, 200));

        iMsI.save(new Food("Mango", BRAZIL, 20));
        iMsI.save(new Food("Meat", ITALY, 30));
        iMsI.save(new Food("Eggs", UKRAINE, 20));
        iMsI.save(new Food("Pipe", USA, 20));
        iMsI.save(new Food("Melon", CHINA, 20));
        iMsI.save(new Food("Chockolate", ITALY, 1000));

        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }
        System.out.println("------");
        iMsI.delete(new Food("Apple", UKRAINE, 30));
        iMsI.delete(new Food("Oranges", CHINA, 200));
        iMsI.delete(new Food("Melon", CHINA, 20));

        iMsI.deleteById(1);
        iMsI.deleteById(30);

        iMsI.get(30);
        iMsI.get(20);

        iMsI.getPrice(new Food("Melon", CHINA, 20));
        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }
        System.out.println("-------");
        iMsI.getProducts();

        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }
        System.out.println("------");
        iMsI.getPrices();
        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }

        System.out.println("--sortedByName--");
        iMsI.printProductsSortedByName();

        System.out.println("--sortedByPrice--");
        iMsI.printProductsSortedByPrice();

    }
}
