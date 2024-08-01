package com.cf.ims.controller;

import com.cf.ims.model.Category;
import com.cf.ims.model.Product;
import com.cf.ims.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.create(product);
    }
}
