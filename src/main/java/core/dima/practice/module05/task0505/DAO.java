package core.dima.practice.module05.task0505;

import core.dima.practice.module05.task0501.Room;

public interface DAO {


     Room save(Room room);

     boolean delete(Room room);

     Room update(Room room);

     Room findById(long id);
}
