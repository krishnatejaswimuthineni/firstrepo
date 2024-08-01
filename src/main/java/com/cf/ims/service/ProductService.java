package com.cf.ims.service;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.ProductEntity;
import com.cf.ims.mappers.ProductMapper;
import com.cf.ims.model.Brand;
import com.cf.ims.model.Product;
import com.cf.ims.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
