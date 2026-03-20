package com.livoniaBank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_address")
public class CompanyAddressModel {

    @Id
    private UUID id;

    private String cep;

    private String streetName;

    private Integer number;

    private String complement;

    private String city;

    private String state;
}
