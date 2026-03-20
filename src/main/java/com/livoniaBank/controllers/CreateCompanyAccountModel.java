package com.livoniaBank.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/companies")
public class CreateCompanyAccountModel {

    @PostMapping
    private String createCompany() {
        return "Empresa criada";
    }
}
