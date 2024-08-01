package com.cf.ims.Specs;

import com.cf.ims.criteria.BrandSearchCriteria;
import com.cf.ims.criteria.ProductSearchCriteria;
import com.cf.ims.entities.BrandEntity;
import com.cf.ims.entities.ProductEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class BrandSpecs {
    public static Specification<BrandEntity> searchByCriteria(BrandSearchCriteria criteria) {

        Specification<BrandEntity> specification = new Specification<BrandEntity>() {
            @Override
            public Predicate toPredicate(final Root<BrandEntity> root, final CriteriaQuery<?> query,
                                         final CriteriaBuilder cb) {

                List<Predicate> predicates = new ArrayList<>();

                if (criteria.getId() != null) {
                    predicates.add(cb.equal(root.get("id"), criteria.getId()));
                }

                if (criteria.getName() != null) {
                    predicates.add(cb.like(root.get("name"), "%" + criteria.getName() + "%"));
                }
                return cb.and(predicates.toArray(new Predicate[]{}));
            }
        };
        return specification;

    }
}
