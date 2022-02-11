package com.EcommerceLP2.ModelTest;

import com.ecommerce.infra.excecao.ExcecaoModel;
import com.ecommerce.model.ClientModel;
import com.ecommerce.model.OrderModel;
import com.ecommerce.model.ProviderModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class OrderModelTest {

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
        String fantasyName = "jose";
        String cnpj = "0123456789";
        String state = "rio grande do sul";
        LocalDateTime localDateTime = LocalDateTime.now();

        ProviderModel providerModel = new ProviderModel(id, fantasyName, cnpj, email, phoneNumber, street, district, cep, city, state);
        ClientModel clientModel = new ClientModel(id, name, cpf, email, phoneNumber, street, district, cep, city);

        OrderModel orderModel = new OrderModel(id,localDateTime, providerModel, clientModel);

        Assertions.assertEquals(11223344 , orderModel.getId_pedido());
        Assertions.assertEquals(localDateTime , orderModel.getDateBuy());
        Assertions.assertEquals(providerModel , orderModel.getProviderModel());
        Assertions.assertEquals(clientModel , orderModel.getClient());
    }


    @Test
    public void deveSalvarSemSucesso(){

        long id = 11223344;

        try {
            OrderModel orderModel = new OrderModel(id,null, null, null);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[providerModel : enter a valid Provider, dateBuy : enter a valid dateBuy, clientModel : enter a valid client]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }

}
