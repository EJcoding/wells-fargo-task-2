package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String certifications;

    @Column(nullable = false)
    private String address;

    protected FinancialAdvisor() {

    }

    //constructor
    public FinancialAdvisor(String firstName, String lastName, String phone, String email, String certifications, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.certifications = certifications;
        this.address = address;
    }

    //getters
    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCertifications() {
        return certifications;
    }

    public String getAddress() {
        return address;
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

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
