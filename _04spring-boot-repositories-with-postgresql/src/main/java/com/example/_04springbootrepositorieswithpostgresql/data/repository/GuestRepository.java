package com.example._04springbootrepositorieswithpostgresql.data.repository;

import com.example._04springbootrepositorieswithpostgresql.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
