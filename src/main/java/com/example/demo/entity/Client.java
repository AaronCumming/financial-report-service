package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One client can have multiple transactions
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<FinancialTransaction> transactions;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<FinancialTransaction> getTransactions() { return transactions; }
    public void setTransactions(List<FinancialTransaction> transactions) { this.transactions = transactions; }
}
