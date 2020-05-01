package com.maven.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.maven.mapstruct.dto.ProductDTO;
import com.maven.mapstruct.entity.Product;

@Mapper
public interface ProductMapper {
	
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	@Mapping(target = "id", source="id",defaultExpression = "java(java.util.UUID.randomUUID().toString())")
	ProductDTO productToProductDTO(Product product);
	

}
