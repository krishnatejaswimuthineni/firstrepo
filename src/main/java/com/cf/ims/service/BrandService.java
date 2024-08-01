package com.cf.ims.service;

import com.cf.ims.entities.BrandEntity;
import com.cf.ims.mappers.BrandMapper;
import com.cf.ims.model.Brand;
import com.cf.ims.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {
    @Autowired
    BrandRepository brandRepository;
    @Autowired
    BrandMapper brandMapper;
      public Brand create(Brand brand){
          BrandEntity brandEntity = brandMapper.mapDtoToEntity(brand);
          BrandEntity savedEntity = brandRepository.save(brandEntity);
          Brand savedBrand = brandMapper.mapEntityToDto(savedEntity);
           return savedBrand;
      }
        public Brand update(int id, Brand updatedBrand) {
        Optional<BrandEntity> optionalBrand = brandRepository.findById(id);
        if (optionalBrand.isPresent()) {
            BrandEntity existingBrand = optionalBrand.get();
            if(updatedBrand.getName() != null ){
                existingBrand.setName(updatedBrand.getName());
            }
            if(updatedBrand.getStatus() != null){
                existingBrand.setStatus(updatedBrand.getStatus());
            }
            BrandEntity savedEntity = brandRepository.save(existingBrand);
            Brand savedBrand = brandMapper.mapEntityToDto(savedEntity);
            return savedBrand;
        }
        return null;
    }
}
