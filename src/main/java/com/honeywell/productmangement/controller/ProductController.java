package com.honeywell.productmangement.controller;

import com.honeywell.productmangement.entities.ProductCategory;
import com.honeywell.productmangement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("productCategories")
    public List<ProductCategory> getAllProductCategories() {
        return productService.getAllProductCategories();
    }


}
