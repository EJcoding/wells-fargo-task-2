package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    //one-to-one relationship between a client and their portfolio
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    @Column(nullable = false)
    private String investments;

    @Column(nullable = false)
    private String totalValue;

    protected Portfolio() {

    }

    //constructor
    public Portfolio(String creationDate, String investments, String totalValue) {
        this.creationDate = creationDate;
        this.investments = investments;
        this.totalValue = totalValue;
    }


    //getters
    public Long getClientId() {
        return client.getClientId();
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getInvestments() {
        return investments;
    }

    public String getTotalValue() {
        return totalValue;
    }


    //setters
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

}
