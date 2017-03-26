package core.dima.practice.module07.task0705;

import java.util.*;

public class TimeMethodsTrack {

    List<Integer> intList = new ArrayList<Integer>();
    List<String> strList = new ArrayList<String>();
    List<Integer> intLinkList = new LinkedList<Integer>();
    List<String> strLinkList = new LinkedList<String>();

    public void addArIntList() {
        for (int i = 0; i < 1000; i++) {
            intList.add(intList.size() / 2, 10);
        }
    }

    public void addArIntList2() {
        for (int j = 0; j < 10000; j++) {
            intList.add(intList.size() / 2, 10);
        }
    }

    public void addArStrList() {
        for (int i = 0; i < 1000; i++) {
            strList.add(strList.size() / 2, String.valueOf(10));
        }
    }

    public void addArStrList2() {
        for (int i = 0; i < 10000; i++) {
            strList.add(strList.size() / 2, String.valueOf(10));
        }
    }

    public void addIntLinkList() {
        for (int i = 0; i < 1000; i++) {
            intLinkList.add(intLinkList.size() / 2, 10);
        }
    }

    public void addIntLinkList2() {
        for (int i = 0; i < 10000; i++) {
            intLinkList.add(intLinkList.size() / 2, 10);
        }
    }

    public void addStrLinkList() {
        for (int i = 0; i < 1000; i++) {
            strLinkList.add(strLinkList.size() / 2, String.valueOf(10));
        }
    }

    public void addStrLinkList2() {
        for (int i = 0; i < 10000; i++) {
            strLinkList.add(strLinkList.size() / 2, String.valueOf(10));
        }
    }

    public void setArIntList() {
        for (int i = 0; i < 1000; i++) {
            intList.set(intList.size() / 2, 10);
        }
    }

    public void setArIntList2() {
        for (int i = 0; i < 10000; i++) {
            intList.set(intList.size() / 2, 10);
        }
    }

    public void setArStrList() {
        for (int i = 0; i < 1000; i++) {
            strList.set(strList.size() / 2, String.valueOf(10));
        }
    }

    public void setArStrList2() {
        for (int i = 0; i < 10000; i++) {
            strList.set(strList.size() / 2, String.valueOf(10));
        }
    }

    public void setIntLinkList() {
        for (int i = 0; i < 1000; i++) {
            intLinkList.set(intLinkList.size() / 2, 10);
        }
    }

    public void setIntLinkList2() {
        for (int i = 0; i < 10000; i++) {
            intLinkList.set(intLinkList.size() / 2, 10);
        }
    }

    public void setStrLinkList() {
        for (int i = 0; i < 1000; i++) {
            strLinkList.set(strLinkList.size() / 2, String.valueOf(10));
        }
    }

    public void setStrLinkList2() {
        for (int i = 0; i < 10000; i++) {
            strLinkList.set(strLinkList.size() / 2, String.valueOf(10));
        }
    }

    public void info() {
        System.out.println(intList.size() + " " + strList.size() + " " + intLinkList.size() + " " + strLinkList.size());
    }

    public static void main(String[] args) {

        TimeMethodsTrack x = new TimeMethodsTrack();
        long start = System.nanoTime();
        x.addArIntList();
        long duration = System.nanoTime() - start;
        System.out.println(duration + " Int add 1000");

        start = System.nanoTime();
        x.addArStrList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Стринги add 1000");

        start = System.nanoTime();
        x.addIntLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedInt add 1000");

        start = System.nanoTime();
        x.addStrLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedStr add 1000");

        start = System.nanoTime();
        x.addArIntList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Int-2 add 10 000");

        start = System.nanoTime();
        x.addArStrList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Стринги-2 add 10 000");

        start = System.nanoTime();
        x.addIntLinkList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedInt-2 add 10 000");

        start = System.nanoTime();
        x.addStrLinkList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedStr-2 add 10 000");

        System.out.println("------------------------------------");

        start = System.nanoTime();
        x.setArIntList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Int set 1000");

        start = System.nanoTime();
        x.setArStrList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Стринги set 1000");

        start = System.nanoTime();
        x.setIntLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedInt set 1000");

        start = System.nanoTime();
        x.setStrLinkList();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedStr set 1000");

        start = System.nanoTime();
        x.setArIntList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Int-2 set 10 000");

        start = System.nanoTime();
        x.setArStrList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " Стринги-2 set 10 000");

        start = System.nanoTime();
        x.setIntLinkList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedInt-2 set 10 000");

        start = System.nanoTime();
        x.setStrLinkList2();
        duration = System.nanoTime() - start;
        System.out.println(duration + " LinkedStr-2 set 10 000");

        x.info();

    }
}


//Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.

//    Измерьте время выполнения этих методов и выведите их в консоль:
//        - add
//        - set
//        - get
//        - remove