package com.zup.desafio.veiculo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zup.desafio.usuario.UsuarioEntidade;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "veiculo")
public class VeiculoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotBlank
    @Column(name = "marca", nullable = false)
    private String marca;
    @NotBlank
    @Column(name = "modelo", nullable = false)
    private String modelo;
    @NotBlank
    @Column(name = "ano", nullable = false)
    private String ano;
    @Column(name = "valor")
    private String valor;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private UsuarioEntidade usuario;

    public VeiculoEntidade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public UsuarioEntidade getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntidade usuario) {
        this.usuario = usuario;
    }
}
