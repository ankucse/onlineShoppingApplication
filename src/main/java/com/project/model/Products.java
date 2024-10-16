package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    @NotNull(message = "please input a valid product name")
    @Pattern(regexp = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$", message = "please input a valid product name")
    private String productName;
    @NotNull(message = "please input a valid product name")
    private Double price;
    @Pattern(regexp = "(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$", message = "please input a valid color")
    private String color;
    private String dimension;
    private String specification;
    @NotNull(message = "please input a valid manufacturer")
    private String manufacturer;
    @Min(value = 1, message = "quantity should be minimum one")
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

}
