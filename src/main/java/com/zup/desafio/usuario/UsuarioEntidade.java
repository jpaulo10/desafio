package com.zup.desafio.usuario;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.zup.desafio.veiculo.VeiculoEntidade;
import com.zup.desafio.validador.Cpf;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "usuario")
public class UsuarioEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Cpf
    @NotBlank
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Email
    @NotBlank
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "data_nascimento")
    @DateTimeFormat(pattern = "dd-MM-yyy")
    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "America/Sao_Paulo")
    private LocalDate dataNascimento;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    @JsonManagedReference
    private List<VeiculoEntidade> veiculos;

    public UsuarioEntidade() {
    }

    public UsuarioEntidade(Integer id, String cpf, String nome, String email, LocalDate dataNascimento, List<VeiculoEntidade> veiculos) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.veiculos = veiculos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<VeiculoEntidade> getVeiculos() {
        return veiculos;
    }
}
