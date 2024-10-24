package com.dev.delta.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private Double totalAmount;

    @Column(nullable = false)
    private Boolean makeBudgetActive;

    @Column(nullable = false)
    private Boolean lockBudget;

    @OneToMany(mappedBy = "budget", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fund> funds;

    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getMakeBudgetActive() {
        return makeBudgetActive;
    }

    public void setMakeBudgetActive(Boolean makeBudgetActive) {
        this.makeBudgetActive = makeBudgetActive;
    }

    public Boolean getLockBudget() {
        return lockBudget;
    }

    public void setLockBudget(Boolean lockBudget) {
        this.lockBudget = lockBudget;
    }

    public List<Fund> getFunds() {
        return funds;
    }

    public void setFunds(List<Fund> funds) {
        this.funds = funds;
    }
}

