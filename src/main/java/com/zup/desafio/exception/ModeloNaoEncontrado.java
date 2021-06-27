package com.zup.desafio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Modelo não encontrado no sistema.")
public class ModeloNaoEncontrado extends Exception {
    public ModeloNaoEncontrado() {
        super();
    }
}
