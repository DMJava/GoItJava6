package core.dima.practice.module10.task10_04;

public class TwoMethods {

    public static void f() {
        try {
             g();
        } catch (OutOfMemoryError e){
            System.out.println(22222);;
        }
    }

    public static void g() {
        try {
            throw new RuntimeException("oneoneone");
        } finally {
            System.out.println("eto finally");
        }
    }

    public static void main(String[] args) {
        f();
    }
}

//    Создайте класс с двумя методами f() и g().
//    В g() киньте (throw) исключение нового типа, который вы определили.
//    В f() вызовите g(), поймайте его исключение и в блоке catch киньте другое исключение (другого типа, который вы определили).
//    Протестируйте свой код в main().
