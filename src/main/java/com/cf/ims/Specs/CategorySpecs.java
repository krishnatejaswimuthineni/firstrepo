package com.cf.ims.Specs;

import com.cf.ims.criteria.CategorySearchCriteria;
import com.cf.ims.criteria.ProductSearchCriteria;
import com.cf.ims.entities.CategoryEntity;
import com.cf.ims.entities.ProductEntity;
import com.cf.ims.model.Category;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CategorySpecs {
    public static Specification<CategoryEntity> searchByCriteria(CategorySearchCriteria criteria) {

        Specification<CategoryEntity> specification = new Specification<CategoryEntity>() {
            @Override
            public Predicate toPredicate(final Root<CategoryEntity> root, final CriteriaQuery<?> query,
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
