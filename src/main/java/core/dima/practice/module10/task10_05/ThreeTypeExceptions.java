package core.dima.practice.module10.task10_05;

import jdk.nashorn.internal.runtime.ECMAException;

public class ThreeTypeExceptions {

    public static void threeExceptions() {
        try {
            throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (RuntimeException f) {
            System.out.println(2);
        } catch (Exception a) {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        threeExceptions();
    }
}
//    Создайте три новых типа исключений. Напишите класс с методом, который будет кидать все три из них.
//    В main() вызовите этот метод, но используйте только один catch-блок который будет ловить все три типа исключений.