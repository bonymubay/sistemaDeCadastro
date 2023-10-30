package com.api.apiBony.moodel;

import jakarta.persistence.*;

@Entity
public class User {

    public User(Long id, String nome, String email, String senha){
       this.id=id;
       this.nome=nome;
       this.email = email;
       this.senha = senha;
    }

    public User(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
