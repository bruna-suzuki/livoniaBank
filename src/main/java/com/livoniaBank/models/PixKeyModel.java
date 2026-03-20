package com.livoniaBank.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_pix_key")
public class PixKeyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String key;

    private String keyType; // CPF, CNPJ, EMAIL, PHONE

    @ManyToOne
    @JoinColumn(name = "account_id")
    private BankAccountModel bankAccount;
}
