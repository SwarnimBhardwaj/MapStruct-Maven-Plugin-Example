package com.maven.mapstruct.dto;

public class EmployeeDTO {
	
	private int employeeId;
	
	private String employeeName;
	
	//Added for Type Conversion example from String to Date
	private String employeeStartDt;
	
	private DivisonDTO divisionDTO;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public DivisonDTO getDivisionDTO() {
		return divisionDTO;
	}

	public void setDivisionDTO(DivisonDTO divisionDTO) {
		this.divisionDTO = divisionDTO;
	}

	public String getEmployeeStartDt() {
		return employeeStartDt;
	}

	public void setEmployeeStartDt(String employeeStartDt) {
		this.employeeStartDt = employeeStartDt;
	}
	
	

}
