package com.ecommerce.infra.repository;

import com.ecommerce.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <ClientModel, Long> {
    void findByName(String name);
}
