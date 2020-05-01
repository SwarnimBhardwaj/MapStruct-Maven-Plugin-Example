package com.maven.mapstruct.entity;

import java.util.Date;

public class Employee {
	
	private int id;
	
	private String name;
	
	//Added for Type Conversion example from Date to String
	private Date startDt;
	
	private Division division;

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

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	
	

}
