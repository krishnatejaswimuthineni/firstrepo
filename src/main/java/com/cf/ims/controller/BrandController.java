package com.cf.ims.controller;

import com.cf.ims.model.Brand;
import com.cf.ims.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    BrandService brandService;
    @PostMapping("/save")
    public Brand saveOrUpdate(@RequestBody final Brand brand) {
        return brandService.create(brand);
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Brand> update(@PathVariable int id, @RequestBody Brand updatedBrand) {
        Brand brand = brandService.update(id, updatedBrand);
        if (brand != null) {
            return ResponseEntity.ok(brand);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
