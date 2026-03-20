package com.livoniaBank.repositories;

import com.livoniaBank.models.CompanyInformationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyInformationRepository extends JpaRepository<UUID, CompanyInformationModel> {
}
