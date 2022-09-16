package com.example.CRUDinterface.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "PRODUCT")
public class Product {

    public Product(Integer id, String name, Integer count, Integer productMass, boolean productMassCheck) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.productMass = productMass;
        this.productMassCheck = productMassCheck;
    }
    public Product(Integer id, String name, Integer count, boolean productMassCheck) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.productMassCheck = productMassCheck;
    }

    public Product() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PRODUCT_NAME")
    private String name;
    @Column(name = "PRODUCT_COUNT")
    private Integer count;
    @Column(name = "PRODUCT_MASS")
    private Integer productMass;
    @Column(name = "PRODUCT_MASSCHECK")
    private boolean productMassCheck = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getProductMass() {
        return productMass;
    }

    public void setProductMass(Integer productMass) {
        this.productMass = productMass;
    }

    public boolean isProductMassCheck() {
        return productMassCheck;
    }

    public void setProductMassCheck(boolean productMassCheck) {
        this.productMassCheck = productMassCheck;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id = " + id +
                ", name = '" + name +
                ", count = " + count +
                ", productMass = " + productMass +
                ", productMassCheck = " + productMassCheck +
                '}';
    }
}
