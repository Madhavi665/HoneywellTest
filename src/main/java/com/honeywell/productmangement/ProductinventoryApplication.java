package com.honeywell.productmangement;

import com.honeywell.productmangement.entities.Product;
import com.honeywell.productmangement.entities.ProductCategory;
import com.honeywell.productmangement.repository.ProductCategoryRepository;
import com.honeywell.productmangement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductinventoryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductinventoryApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public void run(String...args) throws Exception {
		this.productCategoryRepository.save(ProductCategory.builder().category_name("category1").build());
		this.productRepository.save(Product.builder().product_cost(100).product_name("Product1").productCategoryId(1).build());
		/*this.productRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
		this.productRepository.save(new User("Tony", "Stark", "tony@gmail.com"));*/
	}
}
