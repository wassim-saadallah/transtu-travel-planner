package com.transtu.travelplanner.repositories;

import com.transtu.travelplanner.beans.Station;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StationRepository extends CrudRepository<Station, Integer> {
}
