package com.EcommerceLP2.ModelTest;

import com.ecommerce.infra.excecao.ExcecaoModel;
import com.ecommerce.model.ClientModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientModelTest {

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

        ClientModel clientModel = new ClientModel(id, name, cpf, email, phoneNumber, street, district, cep, city);

        Assertions.assertEquals(11223344 , clientModel.getId_cliente());
        Assertions.assertEquals("jose" , clientModel.getName());
        Assertions.assertEquals("0123456789" , clientModel.getCpf());
        Assertions.assertEquals("jose@gmail.com" , clientModel.getEmail());
        Assertions.assertEquals("phoneNumber" , clientModel.getPhoneNumber());
        Assertions.assertEquals("street" , clientModel.getStreet());
        Assertions.assertEquals("district" , clientModel.getDistrict());
        Assertions.assertEquals("cep" , clientModel.getCep());
        Assertions.assertEquals("city" , clientModel.getCity());
    }

    @Test
    public void deveSalvarSemSucesso(){

        long id = 11223344;
        String name = null;
        String cpf = null;
        String email = null;
        String phoneNumber = null;
        String street = null;
        String district = null;
        String cep = null;
        String city = null;

       try {
            ClientModel clientModel = new ClientModel(id, name, cpf, email, phoneNumber, street, district, cep, city);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[cep : enter a valid cep, city : enter a valid city, cpf : enter a valid cpf, district : enter a valid district, email : enter a valid email, name : enter a valid name, phoneNumber : enter a valid phoneNumber, street : enter a valid street]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
       }
    }


}
