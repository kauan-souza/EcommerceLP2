package com.ecommerce.controller;

import com.ecommerce.model.ProductModel;
import com.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public void saveProduct(@RequestBody @Valid ProductModel productModel){
        service.save(productModel);
    }

    @GetMapping
    public List<ProductModel> findAllProducts(){
        return service.findAll();
    }
}
