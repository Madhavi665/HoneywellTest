package com.honeywell.productmangement.service;

import com.honeywell.productmangement.entities.Product;
import com.honeywell.productmangement.entities.ProductCategory;
import com.honeywell.productmangement.repository.ProductCategoryRepository;
import com.honeywell.productmangement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductCategoryRepository productCategoryRepository;



    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public List<ProductCategory> getAllProductCategories() {
        return  productCategoryRepository.findAll();
    }
}

