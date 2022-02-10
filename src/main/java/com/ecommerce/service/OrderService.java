package com.ecommerce.service;

import com.ecommerce.infra.repository.OrderRepository;
import com.ecommerce.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void save(OrderModel orderModel) {
        repository.save(orderModel);
    }

    public List<OrderModel> findAll() {
        return repository.findAll();
    }

}
