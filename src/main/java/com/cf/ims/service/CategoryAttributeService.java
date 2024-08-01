package com.cf.ims.service;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.CategoryAttributeEntity;
import com.cf.ims.mappers.CategoryAttributeMapper;
import com.cf.ims.model.Brand;
import com.cf.ims.model.CategoryAttribute;
import com.cf.ims.repository.CategoryAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryAttributeService {
    @Autowired
    CategoryAttributeRepository categoryAttributeRepository;
    @Autowired
    CategoryAttributeMapper categoryAttributeMapper;
    public CategoryAttribute create(CategoryAttribute categoryAttribute){
        CategoryAttributeEntity categoryAttributeEntity = categoryAttributeMapper.mapDtoToEntity(categoryAttribute);
        CategoryAttributeEntity savedEntity = categoryAttributeRepository.save(categoryAttributeEntity);
        CategoryAttribute savedCategory = categoryAttributeMapper.mapEntityToDto(savedEntity);
        return savedCategory;
    }
}
