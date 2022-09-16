package com.example.CRUDinterface.Service;

import com.example.CRUDinterface.Model.Product;

public interface ProductServiceInterface {
    Product saveProduct(Product product);

    Product findProductById(Integer productID);

}
