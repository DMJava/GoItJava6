package core.dima.practice.module08.task0804;

import core.dima.practice.module08.task0802.Food;
import core.dima.practice.module08.task0803.IManageSystem;

import java.util.*;

// Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене. Поле должно быть доступно только внутри данного класса.

public final class IManageSystemImplemetnation implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<Food, Double>();

// void printProductsSortedByName(); - выводит список «продукт-цена», отсортированных по имени продукта.
// void printProductsSortedByPrice();- выводит список «продукт-цена», отсортированных по цене продукта (по возрастанию).

    @Override
    public Food save(Food obj, double price) {
        database.put(obj, price);
        return obj;
    }

    @Override
    public Food save(Food obj) {
        database.put(obj, 0.0);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        Set<Food> food = database.keySet();

//        for (Food o : food){
//            if (o.getId() == id){
//                food.remove(id);

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
}