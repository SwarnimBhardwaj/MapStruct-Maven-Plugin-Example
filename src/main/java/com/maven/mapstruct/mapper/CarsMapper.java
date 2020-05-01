package com.maven.mapstruct.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.maven.mapstruct.dto.CarDTO;
import com.maven.mapstruct.dto.FuelType;
import com.maven.mapstruct.entity.BioDieselCar;
import com.maven.mapstruct.entity.Car;
import com.maven.mapstruct.entity.ElectricCar;

//Here's another way of customizing @Mapping capabilities by using @BeforeMapping and @AfterMapping annotations. 

//The annotations are used to mark methods that are invoked right before and after the mapping logic.

//They are quite useful in scenarios where we might want this behavior to be applied to all mapped super-types.

//Let's take a look at an example that maps the sub-types of Car; ElectricCar, and BioDieselCar, to CarDTO.

//While mapping we would like to map the notion of types to the FuelType enum field in the DTO, and after the mapping 
//is done we'd like to change the name of the DTO to uppercase.

//@MappingTarget is a parameter annotation that populates the target mapping DTO right before the mapping logic is executed in case of 
//@BeforeMapping and right after in case of @AfterMapping annotated method.


@Mapper
public abstract class CarsMapper {
	
	
	
	@BeforeMapping
	protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDTO) {
		
		if(car instanceof ElectricCar) {
			carDTO.setFuelType(FuelType.ELECTRIC);
		}
		if(car instanceof BioDieselCar) {
			carDTO.setFuelType(FuelType.BIO_DIESEL);
		}
			
	}
	
	
	@AfterMapping
	protected void converNameToUpperCase(@MappingTarget CarDTO carDTO) {
		carDTO.setName(carDTO.getName().toUpperCase());
	}
	
	public abstract CarDTO toCarDTO(Car car);

}
