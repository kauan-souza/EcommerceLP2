package com.ecommerce.service;

import com.ecommerce.infra.repository.ProviderRepository;
import com.ecommerce.model.ProviderModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    private ProviderRepository repository;

    public ProviderService(ProviderRepository repository) {
        this.repository = repository;
    }

    public void save(ProviderModel providerModel) {
        repository.save(providerModel);
    }
    public List<ProviderModel> findAll() {
        return repository.findAll();
    }

}
