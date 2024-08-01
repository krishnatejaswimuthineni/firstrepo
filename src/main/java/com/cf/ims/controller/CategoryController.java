package com.cf.ims.controller;

import com.cf.ims.model.Category;
import com.cf.ims.model.CategoryAttribute;
import com.cf.ims.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/save")
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }
}
