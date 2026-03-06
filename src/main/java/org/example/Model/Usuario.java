package org.example.Model;

import java.sql.Date;

public class Usuario
{
    private long id;
    private String nome_usuario;
    private String telefone;
    private String email;
    private String senha;
    private Date dataNascimento;
    private String tipoUsuario;
    private String cpf;

    public Usuario(String cpf, String tipoUsuario, Date dataNascimento, String senha, String telefone, String email, String nome_usuario, long id) {
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.nome_usuario = nome_usuario;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
}
