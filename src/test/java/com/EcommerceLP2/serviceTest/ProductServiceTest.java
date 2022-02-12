package com.EcommerceLP2.serviceTest;

import com.ecommerce.infra.repository.ProductRepository;
import com.ecommerce.model.ProductModel;
import com.ecommerce.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    private ProductService productService;

    @BeforeEach
    public void iniciar(){
        MockitoAnnotations.openMocks(this);
        productService = new ProductService(productRepository);
    }

    @Test
    public void deveSalvarComSucesso(){

        long id = 11223344;
        String name = "relogio";
        String description = "aaa";
        Double valueUnitary = 100.00;

        var productModel = new ProductModel(id, name, description, valueUnitary);
        productService.save(productModel);
        Mockito.verify(productRepository, times(1)).save(any(ProductModel.class));
    }

    @Test
    public void devePegarTodos(){

        productService.findAll();
        Mockito.verify(productRepository, times(1)).findAll();
    }
}


