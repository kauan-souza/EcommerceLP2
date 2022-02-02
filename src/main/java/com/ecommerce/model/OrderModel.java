//package com.ecommerce.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class OrderModel {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id_pedido;
//
//    @NotNull(message = "enter a valid dateBuy")
//    private LocalDateTime dateBuy;
//
//    @NotNull(message = "enter a valid Provider")
//    private ProviderModel providerModel;
//
//    @NotNull(message = "enter a valid client")
//    private ClientModel clientModel;
//    private Double valorTotal;
//    private Double valorTotalItens;
//    private Double valorFrete;
//
//
//    @Deprecated
//    protected OrderModel() {}
//    public OrderModel(LocalDateTime dateBuy, ProviderModel providerModel, ClientModel clientModel) {
//        this.dateBuy = dateBuy;
//        this.providerModel = providerModel;
//        this.clientModel = clientModel;
//    }
//
//
//
//    public Double getValorFrete() {
//        return valorFrete;
//    }
//
//    public long getId_pedido() {
//        return id_pedido;
//    }
//
//    public LocalDateTime getDataCompra() {
//        return dateBuy;
//    }
//
//    public ProviderModel getFornecedor() {
//        return providerModel;
//    }
//
//    public ClientModel getCliente() {
//        return clientModel;
//    }
//}
//
//
