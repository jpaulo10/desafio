package com.zup.desafio.fipe;

import java.util.List;

public class ModelosCarro {
    private List<Modelo> modelos;

    public ModelosCarro(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public ModelosCarro() {
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public static class Modelo {
        private Integer codigo;
        private String nome;

        public Modelo(Integer codigo, String nome) {
            this.codigo = codigo;
            this.nome = nome;
        }

        public Modelo() {
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
