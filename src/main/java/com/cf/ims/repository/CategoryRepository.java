package com.cf.ims.repository;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
