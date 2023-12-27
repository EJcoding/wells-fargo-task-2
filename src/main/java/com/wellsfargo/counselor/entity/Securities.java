package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Securities {
    @Id
    @GeneratedValue()
    private long securityId;

    //one-to-many relationship between portfolios and securities in them
    @OneToMany
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String quantity;

    protected Securities() {

    }

    //constructor
    public Securities(String securityName, String category, String purchaseDate, String purchasePrice, String quantity) {
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }


    //getters
    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolio.getPortfolioId();
    }

    public String getSecurityName() {
        return securityName;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public String getQuantity() {
        return quantity;
    }


    //setters
    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
