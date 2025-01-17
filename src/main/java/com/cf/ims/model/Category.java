package com.cf.ims.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data

    public class Category  implements Serializable {
        private static final long serialVersionUID = 1L;

        private Integer id;
        private String name;
        private List<CategoryAttribute> attributes;
}
