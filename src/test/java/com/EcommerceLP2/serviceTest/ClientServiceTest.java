package com.EcommerceLP2.serviceTest;

import com.ecommerce.infra.repository.ClientRepository;
import com.ecommerce.model.ClientModel;
import com.ecommerce.service.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    private ClientService clientService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        clientService = new ClientService(clientRepository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 11223344;
        String name = "jose";
        String cpf = "0123456789";
        String email = "jose@gmail.com";
        String phoneNumber = "phoneNumber";
        String street = "street";
        String district = "district";
        String cep = "cep";
        String city = "city";

        var clientModel = new ClientModel(id, name, cpf, email, phoneNumber, street, district, cep, city);
        clientService.save(clientModel);
        Mockito.verify(clientRepository, times(1)).save(any(ClientModel.class));
    }

    @Test
    public void  devePegarTodos(){

        clientService.findAll();
        Mockito.verify(clientRepository, times(1)).findAll();
    }

}
