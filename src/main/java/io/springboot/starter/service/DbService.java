package io.springboot.starter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.springboot.starter.dao.Point;
import io.springboot.starter.model.PointRepository;

@Service
public class DbService {
	
	@Autowired
	private PointRepository pr;

	public void add(Point point) {
		pr.save(point);
	}

	public List<Point> getA() {
		return (List<Point>) pr.findAll();
	}
	
	

}
