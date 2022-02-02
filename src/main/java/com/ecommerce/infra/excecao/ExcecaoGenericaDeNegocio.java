package com.ecommerce.infra.excecao;

public abstract class ExcecaoGenericaDeNegocio extends RuntimeException {
    public ExcecaoGenericaDeNegocio(String message) {
        super(message);
    }
}
