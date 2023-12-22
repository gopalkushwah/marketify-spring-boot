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
public class Merchant {
    @Id
    private int id;
    
    @Column(name = "merchant_id")
    private String merchantId;
    private String email;
    private String name;
    private String mobile;
    private String password;
    private String rating;

    @Column(name = "shop_name")
    private String shopName;
    
    @Column(name = "bank_acc")
    private String bankAcc;

    @Column(name = "upi_id")
    private String upi_id;
    
    @Column(name = "bank_ifsc")
    private String bankIfsc;
    
    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "full_address")
    private String fullAddress;
    private String state;
    private String city;
    private String village;
    @Column(name = "ward_no")
    private String wardNo;
    @Column(name = "house_no")
    private String houseNo;

    @Temporal(value= TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @Temporal(value= TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "updation_date")
    private Date updationDate;

    public Merchant() {
    }

    public Merchant(int id, String merchantId, String email, String name, String mobile, String password, String rating,
            String shopName, String bankAcc, String upi_id, String bankIfsc, String imageUrl, String imageName,
            String fullAddress, String state, String city, String village, String wardNo, String houseNo,
            Date creationDate, Date updationDate) {
        this.id = id;
        this.merchantId = merchantId;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.rating = rating;
        this.shopName = shopName;
        this.bankAcc = bankAcc;
        this.upi_id = upi_id;
        this.bankIfsc = bankIfsc;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        this.fullAddress = fullAddress;
        this.state = state;
        this.city = city;
        this.village = village;
        this.wardNo = wardNo;
        this.houseNo = houseNo;
        this.creationDate = creationDate;
        this.updationDate = updationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public String getUpi_id() {
        return upi_id;
    }

    public void setUpi_id(String upi_id) {
        this.upi_id = upi_id;
    }

    public String getBankIfsc() {
        return bankIfsc;
    }

    public void setBankIfsc(String bankIfsc) {
        this.bankIfsc = bankIfsc;
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

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
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
