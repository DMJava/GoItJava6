package core.dima.practice.module10.task10_02;

public class SpecialClassForExceptions extends Exception {

    public SpecialClassForExceptions(String message) {
        super(message);
    }

    public static void toGo(String message) {
        try {
            throw new RuntimeException(message);
        } catch (RuntimeException e) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        toGo("111");
    }
}

//  Напишите конструктор для этого класса, который получает аргумент типа String и хранит его внутри объекта как ссылку (reference) на String.
//  Написать метод, который выводит хранимую строку.
//  Создать try-catch-блоки, чтобы поупражняться на новом исключении.

