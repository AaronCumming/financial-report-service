package com.example.demo.repository;

import com.example.demo.entity.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<FinancialTransaction, Long> {}
