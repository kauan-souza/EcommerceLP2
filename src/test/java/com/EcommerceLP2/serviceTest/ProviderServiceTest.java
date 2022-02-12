package com.EcommerceLP2.serviceTest;


import com.ecommerce.infra.repository.ProviderRepository;
import com.ecommerce.model.ProviderModel;
import com.ecommerce.service.ProviderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class ProviderServiceTest {

    @Mock
    private ProviderRepository providerRepository;

    private ProviderService providerService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        providerService = new ProviderService(providerRepository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 11223344;
        String fantasyName = "jose";
        String cnpj = "0123456789";
        String email = "jose@gmail.com";
        String phoneNumber = "phoneNumber";
        String street = "street";
        String district = "district";
        String cep = "cep";
        String city = "city";
        String state = "rio grande do sul";

        ProviderModel providerModel = new ProviderModel(id, fantasyName, cnpj, email, phoneNumber, street, district, cep, city, state);
        providerService.save(providerModel);
        Mockito.verify(providerRepository, times(1)).save(any(ProviderModel.class));
    }

    @Test
    public void devePegarTodos(){

        providerService.findAll();
        Mockito.verify(providerRepository, times(1)).findAll();
    }
}
