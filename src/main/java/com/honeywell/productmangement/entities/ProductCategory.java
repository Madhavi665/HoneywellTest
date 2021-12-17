package com.honeywell.productmangement.entities;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "productcategory")
@Builder
public class ProductCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long category_id;

    @Column(name = "category_name")
    private String category_name;

    @OneToMany(mappedBy = "productcategory", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Product> products;

    public ProductCategory() {
    }

    public ProductCategory(long category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

}
