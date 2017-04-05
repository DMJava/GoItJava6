package core.dima.practice.module08.task0802;

// Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.


import core.dima.practice.module08.task0801.Country;
import core.dima.practice.module08.task0801.IdGenerator;

public class Food {
    public final int id; //(уникальный идентификатор товара)
    private String name; //(наименование товара)
    private Country country; //(страна производитель)
    private int expiration; //(срок годности в днях)

    public Food(String name, Country country, int expiration) {
        this.id = IdGenerator.GenerateID(name, expiration, country);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }
}
