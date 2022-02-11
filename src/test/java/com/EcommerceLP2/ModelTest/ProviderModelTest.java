package com.EcommerceLP2.ModelTest;

import com.ecommerce.infra.excecao.ExcecaoModel;
import com.ecommerce.model.ClientModel;
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

    @Test
    public void deveSalvarSemSucesso(){

        long id = 11223344;
        String fantasyName = null;
        String cnpj = null;
        String email = null;
        String phoneNumber = null;
        String street = null;
        String district = null;
        String cep = null;
        String city = null;
        String state = null;

        try {
            ProviderModel providerModel = new ProviderModel(id, fantasyName, cnpj, email, phoneNumber, street, district, cep, city, state);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[cep : enter a valid cep, city : enter a valid city, email : enter a valid email, state : enter a valid state, street : enter a valid street, phoneNumber : enter a valid name phoneNumber, fantasyName : enter a valid fantasyName, cnpj : enter a valid cnpj, district : enter a valid district]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }

}
