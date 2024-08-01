package com.cf.ims.service;

import com.cf.ims.entities.CategoryAttributeEntity;
import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.mappers.CategoryMapper;
import com.cf.ims.model.Category;
import com.cf.ims.model.CategoryAttribute;
import com.cf.ims.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CategoryMapper categoryMapper;
    public Category save(Category category) {
        CategoryEntity categoryEntity = categoryMapper.mapDtoToEntity(category);

       List<CategoryAttributeEntity> categoryAttributeEntities = categoryEntity.getAttributes();

       for (CategoryAttributeEntity categoryAttribute : categoryAttributeEntities) {
           categoryAttribute.setCategory(categoryEntity);
       }

        CategoryEntity savedEntity = categoryRepository.save(categoryEntity);
        Category savedCategory = categoryMapper.mapEntityToDto(savedEntity);
        return savedCategory;
    }

}
