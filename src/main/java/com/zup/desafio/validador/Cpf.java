package com.zup.desafio.validador;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Este código foi extraído de https://programadev.com.br/spring-validacao/ e utilizado para fins didáticos
 * no desafio da orange talents
 */

@Documented
@Constraint(validatedBy = CpfValidador.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Cpf {
    String message() default "Documento Inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}