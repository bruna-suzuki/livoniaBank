package com.livoniaBank.repositories;

import com.livoniaBank.models.CreationPjAccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CreationPjAccountRepository extends JpaRepository<UUID, CreationPjAccountModel> {
}
