package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ItemModel extends Entidade{

    @ManyToOne
    @JoinColumn(name = "id_produto")
    @NotNull(message = "enter a valid product")
    private ProductModel productModel;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_item;

    @NotNull(message = "enter a valid quantity")
    private Integer quantity;

    private Double valueTotalItem;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private OrderModel orderModel;

    @Deprecated
    protected ItemModel() {}
    public ItemModel(Long id_item, ProductModel productModel, Integer quantity) {
        this.id_item = id_item;
        this.productModel = productModel;
        this.quantity = quantity;
        isValid();
    }

    public Long getId_item() {
        return id_item;
    }

    public ProductModel getProduct() {
       return productModel;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getValueTotalItem() {
        return valueTotalItem;
    }
}