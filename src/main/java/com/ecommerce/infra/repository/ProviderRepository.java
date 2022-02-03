package com.ecommerce.infra.repository;

import com.ecommerce.model.ProviderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<ProviderModel, Long> {
}
