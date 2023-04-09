package com.as;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Champion_Driver {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	private long phno;
	private int averageroundpassed;
	@OneToMany
	private List<Hallikar_Bull> bulls;
	
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getAverageroundpassed() {
		return averageroundpassed;
	}
	public void setAverageroundpassed(int averageroundpassed) {
		this.averageroundpassed = averageroundpassed;
	}
	public List<Hallikar_Bull> getBulls() {
		return bulls;
	}
	public void setBulls(List<Hallikar_Bull> bulls) {
		this.bulls = bulls;
	}
	
	
}
