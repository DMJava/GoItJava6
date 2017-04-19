package core.dima.practice.module10.task10_01;

public class Main {
    public static void main(String[] args){
        try {
            throw new Exception("ExcepExcep");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Its finally block");
        }
    }
}

//        Создайте класс с main(), который закидывает (throws) объект класса Exception внутрь try-блока.
//        Задайте конструктору исключения (Exception) аргумент типа String.
//        Поймайте (catch) исключение внутри catch-блока и выведитe String argument.
//        Добавьте finally-блок и выведите сообщение в доказательство того, что он вызывался.