package com.cf.ims.repository;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.CategoryAttributeEntity;
import com.cf.ims.model.CategoryAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryAttributeRepository extends JpaRepository<CategoryAttributeEntity, Integer> {
}
