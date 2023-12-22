package com.marketify.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Product {
    
    @Id
    private int id;
    
    @Column(name = "product_id")
    private String productId;
    private String name;
    private int quantity;
    private double price;
    private String category;
    private double discount;
    private String description;

    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "image_name")
    private String imageName;

    @Temporal(value= TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @Temporal(value= TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "updation_date")
    private Date updationDate;

    public Product() {
    }

    public Product(int id, String productId, String name, int quantity, double price, String category, double discount,
            String description, String imageUrl, String imageName, Date creationDate, Date updationDate) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.description = description;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        this.creationDate = creationDate;
        this.updationDate = updationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdationDate() {
        return updationDate;
    }

    public void setUpdationDate(Date updationDate) {
        this.updationDate = updationDate;
    }


}
