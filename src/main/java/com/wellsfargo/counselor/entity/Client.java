package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int clientId;

    @ManyToOne
    private Advisor advisor;

    @Column(nullable = false)
    private String clientFirstName;

    @Column(nullable = false)
    private String clientLastName;

    @Column(nullable = false)
    private String clientAddress;

    @Column(nullable = false)
    private int clientPhoneNumber;

    @Column(nullable = false)
    private String clientEmail;

    protected Client() {

    }

    public Client(String clientFirstName, String clientLastName, String clientAddress, int clientPhoneNumber, String clientEmail) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientEmail = clientEmail;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public int getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(int clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }


}
