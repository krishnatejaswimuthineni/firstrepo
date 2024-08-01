package com.cf.ims.mappers;

import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.entities.ProductEntity;
import com.cf.ims.model.Category;
import com.cf.ims.model.Product;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductEntity mapDtoToEntity(Product product);
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "brand", ignore = true)
    @Mapping(target = "status", ignore = true)
    Product mapEntityToDto (ProductEntity productEntity);

}
