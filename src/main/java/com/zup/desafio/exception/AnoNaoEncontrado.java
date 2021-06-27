package com.zup.desafio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "ID do veículo não encontrado.")
public class AnoNaoEncontrado extends Exception {
    public AnoNaoEncontrado() {
        super();
    }
}
