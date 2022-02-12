package com.EcommerceLP2.serviceTest;

import com.ecommerce.infra.repository.OrderRepository;
import com.ecommerce.model.ClientModel;
import com.ecommerce.model.OrderModel;
import com.ecommerce.model.ProviderModel;
import com.ecommerce.service.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    private OrderService orderService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        orderService = new OrderService(orderRepository);
    }

    @Test
    public void deveSalvar(){

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

        var orderModel = new OrderModel(id,localDateTime, providerModel, clientModel);
        orderService.save(orderModel);
        Mockito.verify(orderRepository, Mockito.times(1)).save(any(OrderModel.class));
    }

    @Test
    public void devePegarTodos(){

        orderService.findAll();
        Mockito.verify(orderRepository, Mockito.times(1)).findAll();
    }

}
