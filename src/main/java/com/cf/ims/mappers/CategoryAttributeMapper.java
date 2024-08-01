package com.cf.ims.mappers;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.CategoryAttributeEntity;
import com.cf.ims.model.Brand;
import com.cf.ims.model.CategoryAttribute;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryAttributeMapper {
    CategoryAttributeEntity mapDtoToEntity(CategoryAttribute categoryAttribute);
    CategoryAttribute mapEntityToDto (CategoryAttributeEntity categoryAttributeEntity);
}
