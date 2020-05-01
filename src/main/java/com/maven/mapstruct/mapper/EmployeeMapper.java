package com.maven.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.maven.mapstruct.dto.DivisonDTO;
import com.maven.mapstruct.dto.EmployeeDTO;
import com.maven.mapstruct.entity.Division;
import com.maven.mapstruct.entity.Employee;

@Mapper
public interface EmployeeMapper {
	
	//We will use mapping in case of field names are different in source and destination classes.
	
	@Mappings({
		@Mapping(target="employeeId", source="id"),
	    @Mapping(target="employeeName", source="name"),
	    //Following mapping added for TYPE CONVERSION 
	    @Mapping(target="employeeStartDt", source="startDt",dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	EmployeeDTO employeeToEmployeeDTO(Employee employee);
	
	@Mappings({
		@Mapping(target="id", source="employeeId"),
	    @Mapping(target="name", source="employeeName"),
	    //Following mapping added for TYPE CONVERSION 
	    @Mapping(target="startDt",source = "employeeStartDt",dateFormat = "dd-MM-yyyy HH:mm:ss")
	})
	Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);
	
	
	//Here we are adding mapper functions for Child beans in above classes. Eg DivisionDTO bean is present in EmployeeDTO and 
	// Division is bean inside Employee.
	
	DivisonDTO divisionToDivisionDTO(Division division);
	
	Division divisonDTOToDivision(DivisonDTO divisionDTO);

}
