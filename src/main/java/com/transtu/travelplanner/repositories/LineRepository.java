package com.transtu.travelplanner.repositories;

import com.transtu.travelplanner.beans.LineStation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineRepository extends CrudRepository<LineStation, Integer> {
}
