package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProductModel extends Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_produto;

    @NotNull(message = "enter a valid name")
    private String name;

    @NotNull(message = "enter a valid description")
    private String description;

    @NotNull(message = "enter a valid valueUnitary")
    private Double valueUnitary;

    @Deprecated
    protected ProductModel() {}
    public ProductModel(Long id_produto, String name, String description, Double valueUnitary) {
        this.id_produto = id_produto;
        this.name = name;
        this.description = description;
        this.valueUnitary = valueUnitary;
        isValid();
    }

    public long getId_produto() {
        return id_produto;
    }

    public String getName() {
        return name;
    }

    public String getDescricao() {
        return description;
    }

    public Double getValorUnitario() {
        return valueUnitary;
    }
}
