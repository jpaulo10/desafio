package com.zup.desafio.veiculo;

import com.zup.desafio.usuario.UsuarioEntidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeiculoRepository extends CrudRepository<VeiculoEntidade, Integer> {
    List<VeiculoEntidade> getByUsuarioId(Integer id);
}
