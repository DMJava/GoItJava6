package core.dima.practice.module06.task0604;

public class CitizenMain {
    public static void main(String[] args) {
        sayHello(new CitizenFactory.Englishman());
        sayHello(new CitizenFactory.Chinese());
        sayHello(new CitizenFactory.Russian());
        sayHello(new CitizenFactory.Italian());
    }

    private static void sayHello(Citizen citizen) {
        System.out.println(citizen.sayHello());
    }
}
//Создайте интерфейс Citizen с методом sayHello().
//
//    Создайте класс-фабрику CitizenFactory, который будет статически генерировать граждан разных стран.
//        Используйте для этого следующие вложенные классы:
//        Englishman
//        Chinese
//        Russian
//        Italian
//
//        Каждый из вложенных классов реализует интерфейс Citizen. Метод sayHello() должен выводить фразу «Привет» на соответствующем языке. Удостоверьтесь, что вложенные классы недоступны вне класса-фабрики.
//
//        Создайте класс CitizenMain с методом main, где проверьте работу CitizenFactory.