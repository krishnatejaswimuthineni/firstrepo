package com.cf.ims.controller;

import com.cf.ims.model.Brand;
import com.cf.ims.model.CategoryAttribute;
import com.cf.ims.service.CategoryAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoryattribute")
public class CategoryAttributeController {
    @Autowired
    CategoryAttributeService categoryAttributeService;
    @PostMapping("/save")
    public CategoryAttribute save(@RequestBody  CategoryAttribute categoryAttribute) {
        return categoryAttributeService.create(categoryAttribute);
    }
}
