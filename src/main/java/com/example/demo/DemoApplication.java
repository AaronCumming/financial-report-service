package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Client;
import com.example.demo.entity.FinancialTransaction;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.TransactionRepository;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(ClientRepository clientRepo, TransactionRepository txRepo) {
        return args -> {
            Client client = new Client();
            client.setName("Alice");
            clientRepo.save(client);

            FinancialTransaction t1 = new FinancialTransaction();
            t1.setType("ASSET");
            t1.setAmount(5000);
            t1.setClient(client);
            txRepo.save(t1);

            FinancialTransaction t2 = new FinancialTransaction();
            t2.setType("LIABILITY");
            t2.setAmount(2000);
            t2.setClient(client);
            txRepo.save(t2);
        };
    }
}
