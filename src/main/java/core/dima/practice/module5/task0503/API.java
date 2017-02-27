package core.dima.practice.module5.task0503;

import core.dima.practice.module5.task0501.Room;

public interface API {
    public Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();

}
