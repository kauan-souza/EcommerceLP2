package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ClientModel extends Entidade{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_cliente;

    @NotNull (message = "enter a valid name")
    private String name;

    @NotNull(message = "enter a valid cpf")
    private String cpf;

    @NotNull(message = "enter a valid email")
    private String email;

    @NotNull(message = "enter a valid phoneNumber")
    private String phoneNumber;

    @NotNull(message = "enter a valid street")
    private String street;

    private String numero;

    @NotNull(message = "enter a valid district")
    private String district;

    private String complement;

    @NotNull(message = "enter a valid cep")
    private String cep;

    @NotNull(message = "enter a valid city")
    private String city;

    private String state;

    @Deprecated
    protected ClientModel() {}
    public ClientModel(Long id_cliente, String name, String cpf, String email, String phoneNumber,
                       String street, String district, String cep, String city) {
        this.id_cliente = id_cliente;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.district = district;
        this.cep = cep;
        this.city = city;
        isValid();
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getNumero() {
        return numero;
    }

    public String getDistrict() {
        return district;
    }

    public String getComplement() {
        return complement;
    }

    public String getCep() {
        return cep;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
