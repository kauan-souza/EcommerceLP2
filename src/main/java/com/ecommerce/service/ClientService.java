package com.ecommerce.service;

import com.ecommerce.infra.repository.ClientRepository;
import com.ecommerce.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

   private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public ClientModel save(ClientModel clientModel) {
        repository.save(clientModel);
        return clientModel;
    }

    public String findByName(String name) {
        if(name == null || name.isBlank()) {
//            throw new NomeInvalidoException("Nome inválido!");
        }
        repository.findByName(name);
        return name;
    }

    public List<ClientModel> findAll() {
        return repository.findAll();
    }
}
