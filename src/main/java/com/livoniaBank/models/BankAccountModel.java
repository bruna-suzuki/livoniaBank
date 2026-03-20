package com.livoniaBank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_bank_account")
public class BankAccountModel {

    @Id
    private UUID id;

    private String accountNumber;

    private String agency;

    private BigDecimal balance;

    private String transaction;

    private String pixKey;

    private String card;

    private String transfer;

    @JoinColumn(name = "company_id")
    private CompanyInformationModel company;
}
