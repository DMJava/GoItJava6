package core.dima.practice.module10.task10_03;

public class Task03 {
    Task03 task = new Task03();

    public void Exep(){
        if (task == null){
            try {
                throw new NullPointerException(" Its null !!!");
            } catch (NullPointerException e){
                System.out.println("Catch Exept");
            }
        }
    }
}

//    Определите ссылку (reference) на объект и инициализируйте ее как null.
//    Попробуйте вызвать метод через эту ссылку. Потом оберните этот код в try-catch-блок, чтобы поймать исключение.