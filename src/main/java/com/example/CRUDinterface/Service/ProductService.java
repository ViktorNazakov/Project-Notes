package com.example.CRUDinterface.Service;

import com.example.CRUDinterface.Model.Product;
import com.example.CRUDinterface.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductServiceInterface{

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product findProductById(Integer productID) {
        Optional<Product> product = productRepo.findById(productID);
        return product.orElse(null);
    }

    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

}
