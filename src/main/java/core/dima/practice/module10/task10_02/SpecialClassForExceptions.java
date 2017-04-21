package core.dima.practice.module10.task10_02;

public class SpecialClassForExceptions extends Exception {

    public SpecialClassForExceptions(String message) {
        super(message);
    }

    public static void toGo(String message)  {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            toGo("111");
        } catch (Exception e) {
            System.out.println("222");
        }
    }
}

//  Напишите конструктор для этого класса, который получает аргумент типа String и хранит его внутри объекта как ссылку (reference) на String.
//  Написать метод, который выводит хранимую строку.
//  Создать try-catch-блоки, чтобы поупражняться на новом исключении.

