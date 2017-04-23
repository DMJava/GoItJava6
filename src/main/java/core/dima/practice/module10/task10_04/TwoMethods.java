package core.dima.practice.module10.task10_04;

public class TwoMethods {

    public static void f() throws Exception {
        try {
            g();
        } catch (RuntimeException e) {
            System.out.println("111");
//            throw new Exception();
        }
    }
    public static void g() {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception{
      f();
    }
}

//    Создайте класс с двумя методами f() и g().
//    В g() киньте (throw) исключение нового типа, который вы определили.

//    В f() вызовите g(), поймайте его исключение и в блоке catch киньте другое исключение (другого типа, который вы определили).
//    Протестируйте свой код в main().
