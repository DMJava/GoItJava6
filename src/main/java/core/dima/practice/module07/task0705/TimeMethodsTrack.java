package core.dima.practice.module07.task0705;

import java.util.*;

public class TimeMethodsTrack {

    List<Integer> intList = new ArrayList<Integer>();
    List<String> strList = new ArrayList<String>();
    List<Integer> intLinkList = new LinkedList<Integer>();
    List<String> strLinkList = new LinkedList<String>();

    void addArIntList() {
        for (int i = 0; i < 1000; i++) {
            intList.add(intList.size() / 2, 10);
        }
    }

    void addArStrList() {
        for (int i = 0; i < 1000; i++) {
            strList.add(strList.size() / 2, String.valueOf(10));
        }
    }

    void addIntLinkList(){
        for (int i = 0; i < 1000; i++) {
            intLinkList.add(intLinkList.size() / 2, 10);
        }
    }

    void addStrLinkList(){
        for (int i = 0; i < 1000; i++) {
            strLinkList.add(strLinkList.size() / 2, String.valueOf(10));
        }
    }

    void info() {
        System.out.println(intList.size() + " " + strList.size() + " " + intLinkList.size() + " " + strLinkList.size());

    }

    public static void main(String[] args) {

        TimeMethodsTrack x = new TimeMethodsTrack();
        long start = System.nanoTime();
        x.addArIntList();
        long duration = System.nanoTime() - start;
        System.out.println(duration);

        start = System.nanoTime();
        x.addArStrList();
        duration = System.nanoTime() - start;
        System.out.println(duration);

        start = System.nanoTime();
        x.addIntLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration);

        start = System.nanoTime();
        x.addStrLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration);

        x.info();

    }
}


//Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.

//    Измерьте время выполнения этих методов и выведите их в консоль:
//        - add
//        - set
//        - get
//        - remove