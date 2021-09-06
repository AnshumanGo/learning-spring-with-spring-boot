package com.example._03springbootwithrepositoriesusingh2db.data.repository;


import com.example._03springbootwithrepositoriesusingh2db.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
