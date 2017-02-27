package core.dima.practice.module5.task0505;

import core.dima.practice.module5.task0501.Room;

public class DAOImpl implements DAO {

    Room[] rooms = new Room[15];

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room save(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = room;
                break;
            }
        }
        System.out.println("Save" + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        boolean delete = false;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = null;
                delete = true;
            }
        }
        System.out.println("Delete" + room);
        return delete;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(room)) {
                rooms[i] = room;
            }
        }
        System.out.println("Update" + room);
        return room;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getId() == id) {
                return rooms[i];
            }
        }
        System.out.println("Find by Id");
        return null;
    }
}
