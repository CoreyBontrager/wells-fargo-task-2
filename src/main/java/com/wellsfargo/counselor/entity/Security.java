package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private int securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityCategory;

    @Column(nullable = false)
    private LocalDate securityPurchaseDate;

    @Column(nullable = false)
    private double securityPrice;

    @Column(nullable = false)
    private int quantityPurchased;

    protected Security() {

    }

    public Security(String securityName, String securityCategory, LocalDate securityPurchaseDate, double securityPrice, int quantityPurchased) {
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.securityPurchaseDate = securityPurchaseDate;
        this.securityPrice = securityPrice;
        this.quantityPurchased = quantityPurchased;
    }

    public int getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public LocalDate getSecurityPurchaseDate() {
        return securityPurchaseDate;
    }

    public void setSecurityPurchaseDate(LocalDate securityPurchaseDate) {
        this.securityPurchaseDate = securityPurchaseDate;
    }

    public double getSecurityPrice() {
        return securityPrice;
    }

    public void setSecurityPrice(double securityPrice) {
        this.securityPrice = securityPrice;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }


}
