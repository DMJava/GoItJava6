package core.dima.practice.module05.task0504;

import core.dima.practice.module05.task0501.Room;
import core.dima.practice.module05.task0503.API;

import java.util.GregorianCalendar;
import java.util.Locale;

public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[5];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price
                    && rooms[i].getPersons() == persons
                    && rooms[i].getCityName().equals(city)
                    && rooms[i].getHotelName().equals(hotel)) {
                for (int i1 = 0; i1 < result.length; i1++) {
                    if (result[i1] == null) {
                        result[i1] = rooms[i];
                    }
                }
            }
        }
        return result;
    }

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
        rooms[2] = new Room(12322132L, 180, 2, date, "Sport", "Kiev");
        rooms[3] = new Room(8565235L, 450, 2, date, "Tourist", "Kiev");
        rooms[4] = new Room(4596669L, 500, 3, date, "Tourist", "Kiev");
    }
}