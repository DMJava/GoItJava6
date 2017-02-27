package core.dima.practice.module05.task0504;

import core.dima.practice.module05.task0501.Room;
import core.dima.practice.module05.task0503.API;

import java.util.GregorianCalendar;
import java.util.Locale;

public class TripAdvisorAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    private Room[] rooms = new Room[5];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    GregorianCalendar date1 = new GregorianCalendar(Locale.ENGLISH);

    public TripAdvisorAPI() {
        rooms[0] = new Room(987456L, 300, 3, date1, "Sport", "Kiev");
        rooms[1] = new Room(123456L, 310, 3, date1, "Sport", "Kiev");
        rooms[2] = new Room(562314L, 330, 3, date1, "Sport", "Kiev");
        rooms[3] = new Room(982345L, 290, 3, date1, "Tourist", "Kiev");
        rooms[4] = new Room(754232L, 350, 4, date1, "Tourist", "Kiev");
    }
}
