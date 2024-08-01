package com.cf.ims.controller;

import com.cf.ims.criteria.ProductSearchCriteria;
import com.cf.ims.model.Category;
import com.cf.ims.model.Product;
import com.cf.ims.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping("/search")
    public List<Product> search(@RequestBody ProductSearchCriteria criteria) {
        return productService.search(criteria);
    }
}
