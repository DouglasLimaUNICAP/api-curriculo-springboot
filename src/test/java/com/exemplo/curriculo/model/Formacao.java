package com.exemplo.curriculo.model;

import jakarta.persistence.*;

@Entity
public class Formacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String curso;
    private String instituicao;
    private String ano;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String getAno() {
        return ano;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
