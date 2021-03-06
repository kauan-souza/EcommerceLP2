package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
public class OrderModel extends Entidade{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_pedido;

    @NotNull(message = "enter a valid dateBuy")
    private LocalDateTime dateBuy;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    @NotNull(message = "enter a valid Provider")
    private ProviderModel providerModel;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @NotNull(message = "enter a valid client")
    private ClientModel clientModel;

    private Double valorTotal;
    private Double valorTotalItens;
    private Double valorFrete;

    @Deprecated
    protected OrderModel() {}
    public OrderModel(Long id_pedido, LocalDateTime dateBuy, ProviderModel providerModel, ClientModel clientModel) {
        this.id_pedido = id_pedido;
        this.dateBuy = dateBuy;
        this.providerModel = providerModel;
        this.clientModel = clientModel;
        isValid();
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public long getId_pedido() {
        return id_pedido;
    }

    public LocalDateTime getDateBuy() {
        return dateBuy;
    }

    public ProviderModel getProviderModel() {
        return providerModel;
    }

    public ClientModel getClient() {
        return clientModel;
    }
}


