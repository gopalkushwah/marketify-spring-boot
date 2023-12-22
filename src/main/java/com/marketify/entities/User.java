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
public class User {

    @Id
    private int id;
    
    @Column(name = "user_id")
    private String userId;
    private String email;
    private String name;
    private String mobile;
    private String password;
    
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

    @Column(name = "bank_acc")
    private String bankAcc;

    @Column(name = "upi_id")
    private String upi_id;
    
    @Column(name = "bank_ifsc")
    private String bankIfsc;
    

    @Temporal(value= TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @Temporal(value= TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "updation_date")
    private Date updationDate;

    
    public User() {
    }

    public User(int id, String userId, String email, String name, String mobile, String password, String imageUrl,
            String imageName, String fullAddress, String state, String city, String village, String wardNo,
            String houseNo, String bankAcc, String upi_id, String bankIfsc, Date creationDate, Date updationDate) {
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        this.fullAddress = fullAddress;
        this.state = state;
        this.city = city;
        this.village = village;
        this.wardNo = wardNo;
        this.houseNo = houseNo;
        this.bankAcc = bankAcc;
        this.upi_id = upi_id;
        this.bankIfsc = bankIfsc;
        this.creationDate = creationDate;
        this.updationDate = updationDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    
}
