package com.zup.desafio.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntidade, Integer> {
    UsuarioEntidade getById(Integer id);
}
