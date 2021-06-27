package com.zup.desafio.veiculo;

import com.zup.desafio.exception.AnoNaoEncontrado;
import com.zup.desafio.exception.MarcaNaoEncontrada;
import com.zup.desafio.exception.ModeloNaoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    VeiculoService veiculoService;

    @PostMapping("/salvar-veiculo/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public VeiculoEntidade salvarVeiculo(@RequestBody VeiculoEntidade veiculo, @PathVariable("id") Integer id) throws
            MarcaNaoEncontrada, ModeloNaoEncontrado, AnoNaoEncontrado {
        return veiculoService.salvarVeiculo(veiculo, id);
    }
}
