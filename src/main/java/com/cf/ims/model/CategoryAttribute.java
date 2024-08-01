package com.cf.ims.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class CategoryAttribute  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Boolean nullable;


    private Boolean active;

}
