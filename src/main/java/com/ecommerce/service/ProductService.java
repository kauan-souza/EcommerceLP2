package com.ecommerce.service;

import com.ecommerce.infra.repository.ProductRepository;
import com.ecommerce.model.ClientModel;
import com.ecommerce.model.ProductModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void save(ProductModel productModel) {
        repository.save(productModel);
    }
    public List<ProductModel> findAll() {
        return repository.findAll();
    }
}
