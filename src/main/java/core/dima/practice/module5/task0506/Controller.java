package core.dima.practice.module5.task0506;

import core.dima.practice.module5.task0501.Room;
import core.dima.practice.module5.task0503.API;
import core.dima.practice.module5.task0504.BookingComAPI;
import core.dima.practice.module5.task0504.GoogleAPI;
import core.dima.practice.module5.task0504.TripAdvisorAPI;

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

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] requestRooms = new Room[15];

        for (int i = 0; i < apis.length; i++) {
            Room[] rooms = apis[i].getRooms();

            for (int j = 0; j < rooms.length; j++) {
                if (rooms[j].getPrice() == price && rooms[j].getPersons() == persons && rooms[j].getCityName().equals(city) && rooms[j].getHotelName().equals(hotel)) {

                    for (int k = 0; k < requestRooms.length; k++) {
                        if (requestRooms[k] == null) {
                            requestRooms[k] = rooms[j];
                        }
                    }
                }
            }
        }
        return requestRooms;
    }

    Room[] check(API api1, API api2) {

        for (int i = 0; i < apis.length; i++) {

            Room[] rooms = apis[i].getRooms();

            if (rooms[i].equals(api1) && rooms[i].equals(api2)) {

                System.out.println("Количество одинаковых номеров в двух API: " + rooms[i]);
            }
        }
        return check(api1, api2);
    }

}
