package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_produto;

    @NotNull(message = "enter a valid name")
    private String name;

    @NotNull(message = "enter a valid description")
    private String description;

    @NotNull(message = "enter a valid valueUnitary")
    private Double valueUnitary;

    public Produto(String name, String description, Double valueUnitary) {
        this.name = name;
        this.description = description;
        this.valueUnitary = valueUnitary;
    }

    public long getId_produto() {
        return id_produto;
    }

    public String getNome() {
        return name;
    }

    public String getDescricao() {
        return description;
    }

    public Double getValorUnitario() {
        return valueUnitary;
    }
}