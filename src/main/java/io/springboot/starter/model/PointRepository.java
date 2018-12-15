package io.springboot.starter.model;

import org.springframework.data.repository.CrudRepository;
import io.springboot.starter.dao.Point;

public interface PointRepository extends CrudRepository<Point, Integer> {
	
	

}
