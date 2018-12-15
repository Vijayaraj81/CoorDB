package io.springboot.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.springboot.starter.dao.Point;
import io.springboot.starter.model.PointRepository;
import io.springboot.starter.service.DbService;

@RestController
public class DbController {
	
	@Autowired
	private DbService serv;
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public String add(@RequestBody Point point) {
		serv.add(point);
		return "New coordinates has been added. To access all coordinates - http://localhost/getall";
	}
	
	@RequestMapping("/getall")
	public List<Point> getAll() {
		return serv.getA();
	}

}
