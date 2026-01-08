package com.example.demo.controller;

import com.example.demo.entity.FinancialTransaction;
import com.example.demo.repository.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @PostMapping
    public FinancialTransaction createTransaction(@RequestBody FinancialTransaction transaction) {
        return transactionRepository.save(transaction);
    }

    @GetMapping
    public List<FinancialTransaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}
