package com.cf.ims.mappers;

import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.entities.ProductEntity;
import com.cf.ims.model.Category;
import com.cf.ims.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductEntity mapDtoToEntity(Product product);
    Product mapEntityToDto (ProductEntity productEntity);
}
