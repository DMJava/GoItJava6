package core.dima.practice.module06.task0604;

public class CitizenFactory {
    public final static class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    public final static class Chinese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Arigato");
        }
    }

    public final static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    public final static class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Bonjorno");
        }
    }
}
