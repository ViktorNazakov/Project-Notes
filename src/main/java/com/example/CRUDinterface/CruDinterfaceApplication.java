package com.example.CRUDinterface;

import com.example.CRUDinterface.Model.Product;
import com.example.CRUDinterface.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CruDinterfaceApplication {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(CruDinterfaceApplication.class, args);
	}

	@PostConstruct
	private void initDb() {
		Product user = new Product();

		user.setName("Bread");
		user.setCount(2);
		user.setProductMassCheck(false);

		productRepo.save(user);
	}

}
