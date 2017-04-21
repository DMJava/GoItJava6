package core.dima.practice.module10.task10_05;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThreeTypeExceptions {

    public static void threeExceptions() throws RuntimeException, OutOfMemoryError, IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            threeExceptions();
        } catch (Exception e) {
            System.out.println("777");
        }
    }
}
//    Создайте три новых типа исключений. Напишите класс с методом, который будет кидать все три из них.
//    В main() вызовите этот метод, но используйте только один catch-блок который будет ловить все три типа исключений.