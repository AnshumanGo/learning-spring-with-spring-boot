package com.example._04springbootrepositorieswithpostgresql.data.repository;


import com.example._04springbootrepositorieswithpostgresql.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
