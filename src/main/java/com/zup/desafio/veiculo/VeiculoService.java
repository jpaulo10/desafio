package com.zup.desafio.veiculo;

import com.zup.desafio.exception.*;
import com.zup.desafio.fipe.*;
import com.zup.desafio.usuario.UsuarioEntidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;
    @Autowired
    private FeignAPI consultaAPI;

    public VeiculoEntidade salvarVeiculo(VeiculoEntidade veiculo, Integer id) throws MarcaNaoEncontrada,
            ModeloNaoEncontrado, AnoNaoEncontrado {
        MarcaCarro marcaCarro = consultaAPI.getMarcas()
                .stream().filter(mc -> mc.getNome().equalsIgnoreCase(veiculo.getMarca()))
                .findFirst().orElseThrow(MarcaNaoEncontrada::new);
        String idMarca = marcaCarro.getCodigo();

        ModelosCarro.Modelo modelo = consultaAPI.getModelos(idMarca).getModelos()
                .stream().filter(m -> m.getNome().equalsIgnoreCase(veiculo.getModelo()))
                .findFirst().orElseThrow(ModeloNaoEncontrado::new);
        Integer idModelo = modelo.getCodigo();

        Veiculo anoVeiculo = consultaAPI.getAno(idMarca, idModelo)
                .stream()
                .filter(a -> a.getCodigo().substring(0, a.getCodigo().indexOf("-")).equals(veiculo.getAno()))
                .findFirst().orElseThrow(AnoNaoEncontrado::new);
        String ano = anoVeiculo.getCodigo();

        VeiculoFipe veiculoFipe = consultaAPI.getVeiculo(idMarca, idModelo, ano);
        veiculo.setValor(veiculoFipe.getValor());
        UsuarioEntidade usuario = new UsuarioEntidade();
        usuario.setId(id);
        veiculo.setUsuario(usuario);
        return veiculoRepository.save(veiculo);
    }
}
