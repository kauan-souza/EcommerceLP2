package com.ecommerce.infra.repository;

import com.ecommerce.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel , Long> {
}
