//package com.ecommerce.model;
//
//import javax.persistence.Entity;
//import javax.validation.constraints.NotNull;
//
//@Entity
//public class ItemModel {
//
//    @NotNull(message = "enter a valid product")
//    private ProductModel productModel;
//
//    @NotNull(message = "enter a valid quantity")
//    private int quantity;
//
//    private Double valueTotalItem;
//
//    @Deprecated
//    protected ItemModel() {}
//    public ItemModel(ProductModel productModel, int quantity) {
//        this.productModel = productModel;
//        this.quantity = quantity;
//    }
//
//    public ProductModel getProduct() {
//        return productModel;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public Double getValueTotalItem() {
//        return valueTotalItem;
//    }
//}