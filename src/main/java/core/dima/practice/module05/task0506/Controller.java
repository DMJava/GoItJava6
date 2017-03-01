package core.dima.practice.module05.task0506;

import core.dima.practice.module05.task0501.Room;
import core.dima.practice.module05.task0503.API;
import core.dima.practice.module05.task0504.BookingComAPI;
import core.dima.practice.module05.task0504.GoogleAPI;
import core.dima.practice.module05.task0504.TripAdvisorAPI;

public class Controller {
    private API apis[] = new API[3];

    public API[] getApis() {
        return apis;
    }

    public void setApis(API[] apis) {
        this.apis = apis;
    }

    public Controller() {
        apis[0] = new GoogleAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new BookingComAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room compareRoom = new Room(price, persons, hotel, city);
        Room[] resultRooms = new Room[15];

        for (int i = 0; i < apis.length; i++) {
            Room[] rooms = apis[i].getRooms();

            for (int j = 0; j < rooms.length; j++) {
                if (rooms[j].equals(compareRoom)) {

                    for (int k = 0; k < resultRooms.length; k++) {
                        if (resultRooms[k] == null) {
                            resultRooms[k] = rooms[j];
                            break;
                        }
                    }
                }
            }
        }
        return resultRooms;
    }

   public Room[] check(API api1, API api2) {

        Room[] sameRooms = new Room[10];
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    sameRooms[0] = api1.getRooms()[i];
                    for (int k = 0; k < sameRooms.length; k++) {
                        if (sameRooms[k] == null) {
                            sameRooms[k] = api1.getRooms()[i];
                            break;
                        }
                    }
                }
            }
        }
        return sameRooms;
    }
}
