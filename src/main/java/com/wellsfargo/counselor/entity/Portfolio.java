package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private int portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDate portfolioCreationDate;

    protected Portfolio() {

    }

    public Portfolio(LocalDate portfolioCreationDate) {
        this.portfolioCreationDate = portfolioCreationDate;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getPortfolioCreationDate() {
        return portfolioCreationDate;
    }

    public void setPortfolioCreationDate(LocalDate portfolioCreationDate) {
        this.portfolioCreationDate = portfolioCreationDate;
    }

}
