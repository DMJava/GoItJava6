package core.dima.practice.module08.task0804;

import core.dima.practice.module08.task0802.Food;
import core.dima.practice.module08.task0803.IManageSystem;

import java.util.*;

// Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене. Поле должно быть доступно только внутри данного класса.

public final class IManageSystemImplemetnation<T> implements IManageSystem<Food> {

    public final static double DEFAULT_PRICE = 0.0;

    private Map<Food, Double> database = new HashMap<Food, Double>();

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, DEFAULT_PRICE);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        Set<Food> food = database.keySet();
        for (Iterator<Food> iterator = food.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public Food get(int id) {
        Set<Food> foods = database.keySet();
        for (Food o : foods) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Food obj) {
        return database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<Double>(database.values());
    }


    @Override
    public void printProductsSortedByName() {
        Comparator<Food> comparator = new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        List<Food> list = new ArrayList<Food>(database.keySet());
        Collections.sort(list, comparator);
        for (Food o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void printProductsSortedByPrice() {
        List<Map.Entry<Food, Double>> list = new ArrayList<Map.Entry<Food, Double>>(database.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Food, Double>>() {
            @Override
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Food,Double> o : list) {
            System.out.println(o);
        }
    }
}