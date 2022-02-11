package com.ecommerce.infra.excecao;

import java.util.Set;

public class ExcecaoModel extends ExcecaoGenericaDeNegocio {

    public ExcecaoModel(Set<String> mensagens) {
        super(mensagens.toString());
    }

    public ExcecaoModel(String message) {
        super(message);
    }
}
