package core.dima.practice.module06.task0604;

public class CitizenMain {
    public static void main(String[] args) {
        sayHello(new CitizenFactory.Chinese());
        sayHello(new CitizenFactory.Englishman());
    }

    private static void sayHello(Citizen citizen) {
        System.out.println(citizen.getClass().getSimpleName());
    }
}
