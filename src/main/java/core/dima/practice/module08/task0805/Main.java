package core.dima.practice.module08.task0805;

import core.dima.practice.module08.task0801.Country;
import core.dima.practice.module08.task0801.IdGenerator;
import core.dima.practice.module08.task0802.Food;
import core.dima.practice.module08.task0803.IManageSystem;
import core.dima.practice.module08.task0804.IManageSystemImplemetnation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static core.dima.practice.module08.task0801.Country.*;

public class Main {
    public static void main(String[] args) {

        IManageSystemImplemetnation<Food> iMsI = new IManageSystemImplemetnation<Food>();

//        iMsI.save(new Apple("Antonovka", UKRAINE, 30));
//        iMsI.save(new Apple("Gold", ITALY, 50));
//        iMsI.save(new Apple("Karat", BRAZIL, 60));
//        iMsI.save(new Apple("Star", USA, 80));
//        iMsI.save(new Apple("Kunichiuwa", CHINA, 200));

        System.out.println(iMsI.getPrices());




        Apple apple1 = new Apple("Ant", UKRAINE, 30);
        Apple apple2 = new Apple("Bo", UKRAINE, 30);
        Apple apple3 = new Apple("Coo", UKRAINE, 30);
        Apple apple4 = new Apple("Dii", UKRAINE, 30);
        Apple apple5 = new Apple("EEE", UKRAINE, 30);


        Map<Meat,Double> meats = new HashMap<Meat, Double>();
         meats.put(new Meat("BB", 20.0), 20.0);
         meats.put(new Meat("AA", 30.0), 30.0);
         meats.put(new Meat("CC", 40.0), 40.0);

        System.out.println(iMsI.save(Meat));


//        iMsI.save(new Meat(300, "a"));
    }
}
