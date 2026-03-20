package com.livoniaBank.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_partner")
public class PartnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String cpf;

    private Double ownershipPercentage;

    private CompanyInformationModel company;
}
