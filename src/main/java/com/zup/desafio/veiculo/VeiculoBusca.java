package com.zup.desafio.veiculo;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class VeiculoBusca {
    private String marca;
    private String modelo;
    private String ano;
    private String diaRodizio;
    private Boolean rodizioAtivo = false;

    public VeiculoBusca(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        defineDiaRodizio();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public String getDiaRodizio() {
        return diaRodizio;
    }

    public Boolean getRodizioAtivo() {
        return rodizioAtivo;
    }

    public void defineDiaRodizio() {
        String ultimoDigito = ano.substring(ano.length() - 1);

        switch (ultimoDigito) {
            case "0":
            case "1":
                this.diaRodizio = "segunda-feira";
                defineRodizio();
                break;
            case "2":
            case "3":
                this.diaRodizio = "terça-feira";
                defineRodizio();
                break;
            case "4":
            case "5":
                this.diaRodizio = "quarta-feira";
                defineRodizio();
                break;
            case "6":
            case "7":
                this.diaRodizio = "quinta-feira";
                defineRodizio();
                break;
            case "8":
            case "9":
                this.diaRodizio = "sexta-feira";
                defineRodizio();
                break;
        }
    }

    public void defineRodizio() {
        Calendar calendar = Calendar.getInstance();
        String diaAtual = new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)];
        if (diaAtual.equals(this.diaRodizio))
            rodizioAtivo = true;
    }
}
