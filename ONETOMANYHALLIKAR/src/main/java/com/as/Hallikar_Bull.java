package com.as;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hallikar_Bull {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int averageroundpassed;
	private double topSpeed;
	private double cost;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAverageroundpassed() {
		return averageroundpassed;
	}
	public void setAverageroundpassed(int averageroundpassed) {
		this.averageroundpassed = averageroundpassed;
	}
	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
