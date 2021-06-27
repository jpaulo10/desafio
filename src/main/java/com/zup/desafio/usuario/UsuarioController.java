package com.zup.desafio.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/salvar-usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioEntidade salvarUsuario(@Valid @RequestBody UsuarioEntidade usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
        return usuarioService.buscarUsuario(id);
    }

}
