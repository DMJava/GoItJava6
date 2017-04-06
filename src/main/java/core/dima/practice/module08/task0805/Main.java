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

        int id = IdGenerator.GenerateID("Milk", 50, UKRAINE);
        int id2 = IdGenerator.GenerateID("Broad", 80, USA);
        int id3 = IdGenerator.GenerateID("Melon", 20, CHINA);
        int id4 = IdGenerator.GenerateID("Hijashi", 200, CHINA);


        iMsI.save(new Food("Apple", UKRAINE, 30));
        iMsI.save(new Food("Milk", UKRAINE, 50));
        iMsI.save(new Food("Meat", UKRAINE, 60));
        iMsI.save(new Food("Broad", USA, 80));
        iMsI.save(new Food("Oranges", CHINA, 200));
        iMsI.save(new Food("Rice", CHINA, 200));
        iMsI.save(new Food("Hijashi", CHINA, 200));

        System.out.println("---------save--ok-");
        iMsI.save(new Food("Apple", UKRAINE, 30), 10.0);
        iMsI.save(new Food("Mango", BRAZIL, 20), 20.0);
        iMsI.save(new Food("Meat", ITALY, 30), 30.0);
        iMsI.save(new Food("Eggs", UKRAINE, 20), 35.0);
        iMsI.save(new Food("Pipe", USA, 20), 40.0);
        iMsI.save(new Food("Melon", CHINA, 20), 50.0);
        iMsI.save(new Food("Chockolate", ITALY, 1000), 505.0);

        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }

        System.out.println("---delete--ok-");
        iMsI.delete(new Food("Apple", UKRAINE, 30));
        iMsI.delete(new Food("Oranges", CHINA, 200));
        iMsI.delete(new Food("Melon", CHINA, 20));
        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }

        System.out.println("---deletedById--ok-");
        iMsI.deleteById(id3);
        iMsI.deleteById(id4);
        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }

        System.out.println("---get--ok-");
        iMsI.get(id);
        iMsI.get(id2);
        System.out.println(id);
        System.out.println(id2);


        System.out.println("--getPrice---");
        System.out.println(iMsI.getPrice(new Food("Melon", CHINA, 20)));


        System.out.println("---getProducts---ok-");
        for (Food o : iMsI.getProducts()) {
            System.out.println(o);
        }


        System.out.println("---getPrices--ok-");
        for (Double o : iMsI.getPrices()) {
            System.out.println(o);
        }

        System.out.println("--sortedByName--");
        iMsI.printProductsSortedByName();

        System.out.println("--sortedByPrice--");
        iMsI.printProductsSortedByPrice();
    }
}