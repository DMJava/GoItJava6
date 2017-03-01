package core.dima.practice.module05.task0507;

import core.dima.practice.module05.task0501.Room;
import core.dima.practice.module05.task0503.API;
import core.dima.practice.module05.task0506.Controller;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Room[] result;
        Controller controller = new Controller();
        result = controller.requestRooms(300, 3, "Kiev", "Sport");
        System.out.println(Arrays.toString(result));
        result = controller.requestRooms(180, 2, "Kiev", "Sport");
        System.out.println(Arrays.toString(result));
        result = controller.requestRooms(100, 1, "Kiev", "Sport");
        System.out.println(Arrays.toString(result));

        API[] araayAPI = controller.getApis();
        result = controller.check(araayAPI[0],araayAPI[1]);
        System.out.println(Arrays.toString(result));
        result = controller.check(araayAPI[0],araayAPI[2]);
        System.out.println(Arrays.toString(result));
        result = controller.check(araayAPI[1],araayAPI[2]);
        System.out.println(Arrays.toString(result));

    }
}
