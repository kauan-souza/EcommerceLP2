package com.Model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {

    @NotNull(message = "enter a valid product")
    private Produto product;

    @NotNull(message = "enter a valid quantity")
    private int quantity;

    private Double valueTotalItem;

    public Item(Produto product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Produto getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getValueTotalItem() {
        return valueTotalItem;
    }
}