package com.zup.desafio.usuario;

import com.zup.desafio.veiculo.VeiculoBusca;
import java.time.LocalDate;
import java.util.List;

public class UsuarioBusca {
    private String cpf;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private List<VeiculoBusca> veiculos;

    public UsuarioBusca(String cpf, String nome, String email, LocalDate dataNascimento, List<VeiculoBusca> veiculos) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.veiculos = veiculos;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<VeiculoBusca> getVeiculos() {
        return veiculos;
    }
}
