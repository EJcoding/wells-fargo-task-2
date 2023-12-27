package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    //one-to-many relationship between financial advisor and client(s)
    @OneToMany
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    //contact information
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String occupation;

    @Column(nullable = false)
    private String maritalStatus;

    @Column(nullable = false)
    private String financialGoals;

    protected Client() {

    }

    //constructor
    public Client(String firstName, String lastName, String phone, String email, String occupation, String maritalStatus, String financialGoals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.occupation = occupation;
        this.maritalStatus = maritalStatus;
        this.financialGoals = financialGoals;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getAdvisorId() {
        return financialAdvisor.getAdvisorId();
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getFinancialGoals() {
        return financialGoals;
    }


    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setFinancialGoals(String financialGoals) {
        this.financialGoals = financialGoals;
    }
}

