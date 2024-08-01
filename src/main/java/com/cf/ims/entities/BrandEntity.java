package com.cf.ims.entities;

import com.cf.ims.constants.Status;
import com.cf.ims.converter.StatusConverter;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "product_brand")
@Data
public class BrandEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 256, unique = true)
    private String name;

    @Column(name = "status", nullable = false)
    @Convert(converter = StatusConverter.class)
    private Status status;
}
