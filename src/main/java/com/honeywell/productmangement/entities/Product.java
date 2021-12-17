package com.honeywell.productmangement.entities;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_cost")
    private int product_cost;

    @Column(name = "category_id")
    private long productCategoryId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    ProductCategory productCategory;

    public Product(String product_name, int product_cost, long productCategoryId, ProductCategory productCategory) {
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.productCategoryId = productCategoryId;
        this.productCategory = productCategory;
    }
}
