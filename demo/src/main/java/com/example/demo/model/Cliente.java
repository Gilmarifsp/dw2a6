package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
@Id
private Long id;
private String nome;
private String email;
private String telefone;
private String cpf;
private Boolean ativo;

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
public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}
public String getcpf() {
    return cpf;
}

public void setcpf(String cpf) {
    this.cpf = cpf;
}
public Boolean getAtivo() {
    return ativo;
}

public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
}

}
