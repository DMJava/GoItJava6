package core.dima.practice.module05.task0504;

import core.dima.practice.module05.task0501.Room;
import core.dima.practice.module05.task0503.API;

import java.util.GregorianCalendar;

public class BookingComAPI implements API {

    @Override
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

    private Room[] rooms = new Room[5];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public BookingComAPI() {
        GregorianCalendar date1 = new GregorianCalendar(2017, 07, 12);
        GregorianCalendar date2 = new GregorianCalendar(2017, 06, 16);
        GregorianCalendar date3 = new GregorianCalendar(2017, 05, 20);
        GregorianCalendar date4 = new GregorianCalendar(2017, 04, 01);
        GregorianCalendar date5 = new GregorianCalendar(2017, 12, 13);

        Room room1 = new Room(56455645L, 200, 2, date1, "Sport", "Kiev");
        Room room2 = new Room(98879887L, 150, 2, date2, "Sport", "Kiev");
        Room room3 = new Room(12322132L, 180, 2, date3, "Sport", "Kiev");
        Room room4 = new Room(59155915L, 190, 2, date4, "Tourist", "Kiev");
        Room room5 = new Room(35755357L, 220, 3, date5, "Tourist", "Kiev");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }
}