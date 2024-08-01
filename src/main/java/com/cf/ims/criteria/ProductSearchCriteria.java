package com.cf.ims.criteria;

import com.cf.ims.constants.Status;
import com.cf.ims.model.Brand;
import com.cf.ims.model.Category;
import lombok.Data;

@Data
public class ProductSearchCriteria {
    private Integer id;
    private String name;
    private Status status;
    private int categoryId;
    private int brandId;
}
