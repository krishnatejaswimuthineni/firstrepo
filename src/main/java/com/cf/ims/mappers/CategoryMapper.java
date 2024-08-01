package com.cf.ims.mappers;

import com.cf.ims.entities.CategoryAttributeEntity;
import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.model.Category;
import com.cf.ims.model.CategoryAttribute;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    CategoryEntity mapDtoToEntity(Category category);
    Category mapEntityToDto (CategoryEntity categoryEntity);
    CategoryAttributeEntity mapDtoToEntity(CategoryAttribute categoryAttribute);
    CategoryAttribute mapEntityToDto (CategoryAttributeEntity categoryAttributeEntity);
}


