package com.sangali.desafioAna.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TabelaAna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Nome;
    private Integer Conta;
    private Integer Bandeira;

    public TabelaAna() {
    }

    public TabelaAna(Long id, String nome, Integer conta, Integer bandeira) {
        this.id = id;
        Nome = nome;
        Conta = conta;
        Bandeira = bandeira;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return Nome;
    }

    public Integer getConta() {
        return Conta;
    }

    public Integer getBandeira() {
        return Bandeira;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setConta(Integer conta) {
        Conta = conta;
    }

    public void setBandeira(Integer bandeira) {
        Bandeira = bandeira;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabelaAna tabelaAna = (TabelaAna) o;
        return id.equals(tabelaAna.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "tabelaAna{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", Conta=" + Conta +
                ", Bandeira=" + Bandeira +
                '}';
    }
}
