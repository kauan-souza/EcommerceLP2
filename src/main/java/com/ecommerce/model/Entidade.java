package com.ecommerce.model;

import com.ecommerce.infra.excecao.ExcecaoModel;

import javax.validation.Configuration;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashSet;
import java.util.Set;

public class Entidade {

    void isValid() {
        Configuration<?> configuracaoes = Validation.byDefaultProvider().configure();
        ValidatorFactory fabrica = configuracaoes.buildValidatorFactory();
        Validator validador = fabrica.getValidator();
        Set<ConstraintViolation<Entidade>> regrasVioladas = validador.validate(this);

        Set<String> mensagens = new HashSet<>();

        for (ConstraintViolation<Entidade> constraintViolation : regrasVioladas) {
            String campo = constraintViolation.getPropertyPath().toString();
            String msg = constraintViolation.getMessage();
            mensagens.add(campo.concat(" : ").concat(msg));
        }

        if (!mensagens.isEmpty()) {
            throw new ExcecaoModel(mensagens);
        }
    }
}
