package com.cf.ims.service;

import com.cf.ims.Specs.ProductSpecs;
import com.cf.ims.criteria.ProductSearchCriteria;
import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.ProductEntity;
import com.cf.ims.mappers.ProductMapper;
import com.cf.ims.model.Brand;
import com.cf.ims.model.Product;
import com.cf.ims.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductMapper productMapper;
    public Product create(Product product){
        ProductEntity productEntity = productMapper.mapDtoToEntity(product);
        ProductEntity savedEntity = productRepository.save(productEntity);
        Product savedProduct = productMapper.mapEntityToDto(savedEntity);
        return savedProduct;
    }
    public List<Product> search(ProductSearchCriteria criteria) {

        Specification<ProductEntity> specification = ProductSpecs.searchByCriteria(criteria);

        List<ProductEntity> productEntities = productRepository.findAll(specification);

        List<Product> products = new ArrayList<>();
        for(ProductEntity productEntity : productEntities) {
            Product product = productMapper.mapEntityToDto(productEntity);
            products.add(product);
        }
        return products;
    }

}


