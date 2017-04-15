package core.dima.practice.module10.task10_01;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("This is Excpetion");
            e.printStackTrace();
        } finally {
            System.out.println("Its finally block");
        }
    }
}
