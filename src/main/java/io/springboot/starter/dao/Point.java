package io.springboot.starter.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Point {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int x;
	private int y;
	
	protected Point() {}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return ("X = " + this.x + ", Y = " + this.y);
	}

}
