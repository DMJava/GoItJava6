package core.dima.practice.module10.task10_03;

public class Task03 {

    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("прога упала");        }
    }
}

//    Определите ссылку (reference) на объект и инициализируйте ее как null.
//    Попробуйте вызвать метод через эту ссылку.
//    Потом оберните этот код в try-catch-блок, чтобы поймать исключение.