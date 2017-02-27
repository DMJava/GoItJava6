package core.dima.practice.module05.task0503;

import core.dima.practice.module05.task0501.Room;

public interface API {
    public Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();

}
