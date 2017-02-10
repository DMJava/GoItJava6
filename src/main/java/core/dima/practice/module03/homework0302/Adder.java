package core.dima.practice.module03.homework0302;

import core.dima.practice.module03.homework0302.Arithmetic;

public class Adder extends Arithmetic {
    boolean check(Integer a, Integer b) {
        if (a >= b) {
            return true;
        } else {
            return false;
        }
    }
}
