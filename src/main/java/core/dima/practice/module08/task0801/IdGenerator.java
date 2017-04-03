package core.dima.practice.module08.task0801;

//Создайте класс-утилиту IdGenerator, который будет генерировать и возвращать уникальный идентификатор
// (реализацию продумайте самостоятельно).

import java.util.Random;
import java.util.UUID;

public final class IdGenerator {

    public static int GenerateID(String name, int expiration, Country country) {

        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + expiration;
        return result;
    }
}