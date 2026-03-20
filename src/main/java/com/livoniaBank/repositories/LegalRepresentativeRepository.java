package com.livoniaBank.repositories;

import com.livoniaBank.models.LegalRepresentativeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LegalRepresentativeRepository extends JpaRepository<UUID, LegalRepresentativeModel> {
}
