package com.example.demo.service;

import com.example.demo.entity.Client;
import com.example.demo.entity.FinancialTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    public double calculateNetWorth(Client client) {
        double total = 0;
        List<FinancialTransaction> transactions = client.getTransactions();
        if (transactions != null) {
            for (FinancialTransaction t : transactions) {
                if ("ASSET".equalsIgnoreCase(t.getType())) {
                    total += t.getAmount();
                } else if ("LIABILITY".equalsIgnoreCase(t.getType())) {
                    total -= t.getAmount();
                }
            }
        }
        return total;
    }
}
