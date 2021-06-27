package com.zup.desafio.fipe;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://parallelum.com.br/fipe/api/v1", name = "fipe")
public interface FeignAPI {

    @GetMapping("/carros/marcas")
    List<MarcaCarro> getMarcas();

    @GetMapping("/carros/marcas/{id}/modelos")
    ModelosCarro getModelos(@PathVariable String id);

    @GetMapping("/carros/marcas/{idMarca}/modelos/{idModelo}/anos")
    List<Veiculo> getAno(@PathVariable String idMarca, @PathVariable Integer idModelo);

    @GetMapping("/carros/marcas/{idMarca}/modelos/{idModelo}/anos/{ano}")
    VeiculoFipe getVeiculo(@PathVariable String idMarca, @PathVariable Integer idModelo, @PathVariable String ano);
}
