package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_pedido;

    @NotNull(message = "enter a valid dateBuy")
    private LocalDateTime dateBuy;

    @NotNull(message = "enter a valid provider")
    private Fornecedor provider;

    @NotNull(message = "enter a valid client")
    private Cliente client;
    private Double valorTotal;
    private Double valorTotalItens;
    private Double valorFrete;

    protected List<String> mensagens = new ArrayList<>();

    public Pedido(LocalDateTime dateBuy, Fornecedor provider, Cliente client) {
        this.dateBuy = dateBuy;
        this.provider = provider;
        this.client = client;
    }



    public Double getValorFrete() {
        return valorFrete;
    }

    public long getId_pedido() {
        return id_pedido;
    }

    public LocalDateTime getDataCompra() {
        return dateBuy;
    }

    public Fornecedor getFornecedor() {
        return provider;
    }

    public Cliente getCliente() {
        return client;
    }
}


