package com.cf.ims.criteria;

import com.cf.ims.constants.Status;
import lombok.Data;

@Data
public class BrandSearchCriteria {
    private Integer id;
    private String name;
    private Status status;
}
