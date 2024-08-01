package com.cf.ims.mappers;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.model.Brand;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BrandMapper {
    BrandEntity mapDtoToEntity(Brand brand);
    Brand mapEntityToDto (BrandEntity brandEntity);

}
