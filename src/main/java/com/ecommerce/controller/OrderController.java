package com.ecommerce.controller;

import com.ecommerce.model.OrderModel;
import com.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public void saveOrder(@RequestBody @Valid OrderModel orderModel){
        service.save(orderModel);
    }

    @GetMapping
    public List<OrderModel> getAllOrder(){
        return service.findAll();
    }

}
