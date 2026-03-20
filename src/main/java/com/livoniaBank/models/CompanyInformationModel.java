package com.livoniaBank.models;

import com.livoniaBank.enums.StatusAccountEnum;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_company_account")
public class CompanyInformationModel {

    @Id
    private UUID id;

    @Column(nullable = false)
    private String razaoSocial;

    private String nomeFantasia;

    @Column(unique = true)
    private String cnpj;


    private String openingDate;

    private String naturezaJuridica; //(MEI, LTDA, SA, etc)

    private String email;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private StatusAccountEnum status = StatusAccountEnum.INACTIVE;

    private List<PartnerModel> partner;
}
