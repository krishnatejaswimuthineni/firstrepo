package com.cf.ims.repository;

import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
