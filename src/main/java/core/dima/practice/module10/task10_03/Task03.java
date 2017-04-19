package core.dima.practice.module10.task10_03;

import org.omg.CORBA.ObjectHelper;

public class Task03 {
    Object obj = null;

    public static void Exep(Object obj) {
        if (obj == null) {
            try {
                throw new NullPointerException(" Its null !!!");
            } catch (NullPointerException e) {
                System.out.println("Catch Exept");
            }
        }
    }

    public static void main(String[] args) {
        Exep(null);
    }
}

//    Определите ссылку (reference) на объект и инициализируйте ее как null.
//    Попробуйте вызвать метод через эту ссылку. Потом оберните этот код в try-catch-блок, чтобы поймать исключение.