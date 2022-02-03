package com.EcommerceLP2.ModelTest;

import com.ecommerce.model.ProviderModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProviderModelTest {

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

        Assertions.assertEquals(11223344 , providerModel.getId_fornecedor());
        Assertions.assertEquals("jose" , providerModel.getFantasyName());
        Assertions.assertEquals("0123456789" , providerModel.getCnpj());
        Assertions.assertEquals("jose@gmail.com" , providerModel.getEmail());
        Assertions.assertEquals("phoneNumber" , providerModel.getPhoneNumber());
        Assertions.assertEquals("street" , providerModel.getStreet());
        Assertions.assertEquals("district" , providerModel.getDistrict());
        Assertions.assertEquals("cep" , providerModel.getCep());
        Assertions.assertEquals("city" , providerModel.getCity());
        Assertions.assertEquals("rio grande do sul" , providerModel.getState());
    }

}
