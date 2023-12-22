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
public class Customer {
    
    @Id
    private int id;
    
    @Column(name = "product_id")
    private String productId;

    @Column(name = "user_id")
    private String userId;
    
    @Column(name = "merchant_id")
    private String merchantId;
    
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

}
