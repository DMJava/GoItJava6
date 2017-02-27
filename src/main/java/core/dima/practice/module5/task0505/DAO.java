package core.dima.practice.module5.task0505;

import core.dima.practice.module5.task0501.Room;

public interface DAO {
    public Room save(Room room);

    public boolean delete(Room room);

    public Room update(Room room);

    public Room findById(long id);
}
