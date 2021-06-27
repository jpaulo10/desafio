package com.zup.desafio.usuario;

import com.zup.desafio.veiculo.VeiculoBusca;
import com.zup.desafio.veiculo.VeiculoEntidade;
import com.zup.desafio.veiculo.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private VeiculoRepository veiculoRepository;

    public UsuarioEntidade salvarUsuario(UsuarioEntidade usuario) {
        return usuarioRepository.save(usuario);
    }

    public ResponseEntity<?> buscarUsuario(Integer id) {
        if (veiculoRepository.getByUsuarioId(id).isEmpty()) {
            return new ResponseEntity<>("Usuário não encontrado!", HttpStatus.NOT_FOUND);
        } else {
            List<VeiculoEntidade> listaVeiculos = veiculoRepository.getByUsuarioId(id);
            List<VeiculoBusca> retornaVeiculos = listaVeiculos.stream()
                    .map(v -> new VeiculoBusca(v.getMarca(), v.getModelo(), v.getAno())).collect(Collectors.toList());
            UsuarioEntidade usuario = usuarioRepository.getById(id);
            UsuarioBusca usuarioBusca = new UsuarioBusca(usuario.getCpf(), usuario.getNome(), usuario.getEmail(), usuario.getDataNascimento(), retornaVeiculos);
            return new ResponseEntity<>(usuarioBusca, HttpStatus.OK);
        }
    }
}
