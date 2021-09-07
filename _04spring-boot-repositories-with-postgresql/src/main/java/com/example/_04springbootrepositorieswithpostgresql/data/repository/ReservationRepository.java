package com.example._04springbootrepositorieswithpostgresql.data.repository;

import com.example._04springbootrepositorieswithpostgresql.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
