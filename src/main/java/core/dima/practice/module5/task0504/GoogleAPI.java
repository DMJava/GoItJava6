package core.dima.practice.module5.task0504;

import core.dima.practice.module5.task0501.Room;
import core.dima.practice.module5.task0503.API;

import java.util.GregorianCalendar;
import java.util.Locale;

public class GoogleAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    Room[] rooms = new Room[5];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    GregorianCalendar date = new GregorianCalendar(Locale.FRANCE);

    public GoogleAPI() {
        rooms[0] = new Room(5689123L, 400, 2, date, "Sport", "Kiev");
        rooms[1] = new Room(4512986L, 410, 2, date, "Sport", "Kiev");
        rooms[2] = new Room(3232694L, 430, 2, date, "Sport", "Kiev");
        rooms[3] = new Room(8565235L, 450, 2, date, "Tourist", "Kiev");
        rooms[4] = new Room(4596669L, 500, 3, date, "Tourist", "Kiev");
    }
}
