package com.cf.ims.model;

import com.cf.ims.constants.Status;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Product  implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String description;
    private Category category;
    private Brand brand;
    private Status status;
}
