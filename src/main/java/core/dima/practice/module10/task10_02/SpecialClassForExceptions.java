package core.dima.practice.module10.task10_02;

public class SpecialClassForExceptions extends Exception {

    private String message;

    public SpecialClassForExceptions(String message) {
        this.message = message;
    }

    public void toGo() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            throw new SpecialClassForExceptions("111");
        } catch (SpecialClassForExceptions e) {
            e.toGo();
            System.out.println("22");
        }
    }
}

//  Напишите конструктор для этого класса, который получает аргумент типа String и хранит его внутри объекта как ссылку (reference) на String.
//  Написать метод, который выводит хранимую строку.
//  Создать try-catch-блоки, чтобы поупражняться на новом исключении.

