package core.dima.practice.module10.task10_03;

public class Task03 {

    public void Exep(Object obj) {
    }

    public static void main(String[] args) {
        Task03 obj = null;
        try {
            obj.Exep(null);
        } catch (NullPointerException e) {
            System.out.println("111");
        }
    }
}

//    Определите ссылку (reference) на объект и инициализируйте ее как null.
//    Попробуйте вызвать метод через эту ссылку.
//    Потом оберните этот код в try-catch-блок, чтобы поймать исключение.