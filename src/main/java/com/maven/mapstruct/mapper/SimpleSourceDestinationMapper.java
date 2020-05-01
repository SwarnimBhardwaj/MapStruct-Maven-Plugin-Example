package com.maven.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.maven.mapstruct.dto.SimpleSource;
import com.maven.mapstruct.entity.SimpleDestination;


//Notice we did not create an implementation class for our SimpleSourceDestinationMapper – because MapStruct creates it for us.

// commenting this out (componentModel = "spring") //used for Dependency injection to get instance of mapper
@Mapper
public interface SimpleSourceDestinationMapper {
	
	SimpleDestination sourceToDestination(SimpleSource source);
	
	SimpleSource destinationToSource(SimpleDestination destination);

}
