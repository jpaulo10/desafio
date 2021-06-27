package com.zup.desafio.fipe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoFipe {
    @JsonProperty("CodigoFipe")
    private String codigoFipe;

    @JsonProperty("Marca")
    private String marca;

    @JsonProperty("Modelo")
    private String modelo;

    @JsonProperty("AnoModelo")
    private Integer anoModelo;

    @JsonProperty("Combustivel")
    private String combustivel;

    @JsonProperty("MesReferencia")
    private String mesReferencia;

    @JsonProperty("Valor")
    private String valor;

    public VeiculoFipe() {
    }

    public VeiculoFipe(String codigoFipe, String marca, String modelo, Integer anoModelo, String combustivel, String mesReferencia, String valor) {
        this.codigoFipe = codigoFipe;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.mesReferencia = mesReferencia;
        this.valor = valor;
    }

    public String getCodigoFipe() {
        return codigoFipe;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return anoModelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getMes() {
        return mesReferencia;
    }

    public String getValor() {
        return valor;
    }
}
