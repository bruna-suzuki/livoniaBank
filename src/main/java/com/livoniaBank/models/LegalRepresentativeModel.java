package com.livoniaBank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_representative")
public class LegalRepresentativeModel {

    @Id
    private UUID id;

    private String fullName;

    private String cpf;

    private String dateOfBirth;

    private String email;

    private String phoneNumber;
}
