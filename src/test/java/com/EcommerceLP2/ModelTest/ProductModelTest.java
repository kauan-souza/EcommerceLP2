package com.EcommerceLP2.ModelTest;

import com.ecommerce.infra.excecao.ExcecaoModel;
import com.ecommerce.model.ProductModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductModelTest {

    @Test
    public void deveSalvarComSucesso(){

       long id = 11223344;
       String name = "relogio";
       String description = "aaa";
       Double valueUnitary = 100.00;

        ProductModel productModel = new ProductModel(id, name, description, valueUnitary);

        Assertions.assertEquals(11223344 , productModel.getId_produto());
        Assertions.assertEquals("relogio" , productModel.getName());
        Assertions.assertEquals(100.00 , productModel.getValorUnitario());
    }

    @Test
    public void deveSalvarSemSucesso(){

        long id = 11223344;
        String name = null;
        String description = null;
        Double valueUnitary = null;

        try {
            ProductModel productModel = new ProductModel(id, name, description, valueUnitary);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[description : enter a valid description, valueUnitary : enter a valid valueUnitary, name : enter a valid name]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }

}
