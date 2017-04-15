package core.dima.practice.module10.task10_02;

public class SpecialClassForExceptions extends Exception {

    //    public void createMessage() throws NullPointerException {
////        System.out.println("Create a new message");
//        throw new NullPointerException("Message is Abcent");
//    }
//
//    public void toGo() {
//        try {
//            createMessage();
//        } catch (NullPointerException e) {
//            System.out.println("MessageMessage");
//        }
//    }
//
//    public static void main(String[] args) {
//        SpecialClassForExceptions specialClassForExceptions = new SpecialClassForExceptions();
//        specialClassForExceptions.createMessage();
//    }

    public void testMethod() throws Exception {
        System.out.println("This is Exept");
        throw new Exception("StringArgument");
    }

    public void toGo() throws Exception {
        try {
            testMethod();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

//  Напишите конструктор для этого класса, который получает аргумент типа String и хранит его внутри объекта как ссылку (reference) на String.
//  Написать метод, который выводит хранимую строку.
//  Создать try-catch-блоки, чтобы поупражняться на новом исключении.

