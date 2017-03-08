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
