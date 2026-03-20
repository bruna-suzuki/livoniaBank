package com.livoniaBank.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_creation_account")
public class CreationPjAccountModel {

    @Id
    private UUID id;

    private CompanyInformationModel companyInfo;

    private CompanyAddressModel companyAddress;

    private LegalRepresentativeModel legalRepresentative;

    
}
