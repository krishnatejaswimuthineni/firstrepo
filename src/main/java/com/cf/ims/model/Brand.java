package com.cf.ims.model;

import com.cf.ims.constants.Status;
import lombok.Data;

import java.io.Serializable;
@Data
public class Brand implements Serializable{
    public static final long serialVersionUID = 1;

    private Integer id;
    private String name;
    private Status status;
}
