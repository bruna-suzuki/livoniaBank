package com.livoniaBank.repositories;

import com.livoniaBank.models.CompanyAddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyAddressRepository extends JpaRepository<UUID, CompanyAddressModel> {
}
