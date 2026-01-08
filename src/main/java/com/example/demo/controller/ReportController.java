package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;

@RestController
public class ReportController {

    private final ClientRepository clientRepo;

    public ReportController(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/clients/html")
    public String getClientsHtml() {
        StringBuilder sb = new StringBuilder("<h1>Clients</h1><ul>");
        for (Client c : clientRepo.findAll()) {
            sb.append("<li>").append(c.getName()).append("</li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }


}
