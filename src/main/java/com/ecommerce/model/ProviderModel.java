package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProviderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_fornecedor;

    @NotNull(message = "enter a valid fantasyName")
    private String fantasyName;

    @NotNull(message = "enter a valid cnpj")
    private String cnpj;

    @NotNull(message = "enter a valid email")
    private String email;

    @NotNull(message = "enter a valid name phoneNumber")
    private String phoneNumber;

    @NotNull(message = "enter a valid street")
    private String street;

    private String numero;

    @NotNull(message = "enter a valid district")
    private String district;

    private String complemento;

    @NotNull(message = "enter a valid cep")
    private String cep;

    @NotNull(message = "enter a valid city")
    private String city;

    @NotNull(message = "enter a valid state")
    private String state;

    @Deprecated
    protected ProviderModel() {}
    public ProviderModel(Long id_fornecedor, String fantasyName, String cnpj, String email,
                         String phoneNumber, String street, String district , String cep
    , String city , String state) {
        this.id_fornecedor = id_fornecedor;
        this.fantasyName = fantasyName;
        this.cnpj = cnpj;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.district = district;
        this.cep = cep;
        this.city = city;
        this.state = state;
    }

    public long getId_fornecedor() {
        return id_fornecedor;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public String getCnpj() {
        return cnpj;
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

    public String getComplemento() {
        return complemento;
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
