package com.zup.desafio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Marca não localizada no sistema")
public class MarcaNaoEncontrada extends Exception {
    public MarcaNaoEncontrada() {
        super();
    }
}
