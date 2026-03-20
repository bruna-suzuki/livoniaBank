package com.livoniaBank.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transaction")
public class TransactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private BigDecimal amount;

    private String type;  //DEPOSIT, TRANSFER, PIX, WITHDRAW, PAYMENT

    private LocalDateTime date;

    @JoinColumn(name = "account_id")
    private BankAccountModel account;
}
