package com.EcommerceLP2.ModelTest;

import com.ecommerce.infra.excecao.ExcecaoModel;
import com.ecommerce.model.ItemModel;
import com.ecommerce.model.ProductModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemModelTest {

    @Test
    public void deveSalvarComSucesso(){

        long id = 11223344;
        String name = "relogio";
        String description = "aaa";
        Double valueUnitary = 100.00;

        ProductModel productModel = new ProductModel(id, name, description, valueUnitary);

        ItemModel itemModel = new ItemModel(id, productModel, 2);

        Assertions.assertEquals(11223344 , itemModel.getId_item());
        Assertions.assertEquals(productModel , itemModel.getProduct());
        Assertions.assertEquals(2 , itemModel.getQuantity());
    }

    @Test
    public void deveSalvarSemSucesso(){

        long id = 11223344;

        try {
            ItemModel itemModel = new ItemModel(id, null, null);
        }catch (ExcecaoModel di){
            String mensagemEsperada = "[quantity : enter a valid quantity, productModel : enter a valid product]";
            Assertions.assertEquals(mensagemEsperada, di.getMessage());
        }
    }
}
