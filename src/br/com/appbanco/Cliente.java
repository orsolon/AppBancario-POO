package br.com.appbanco;

public class Cliente {
    String nome;
    String email;
    TipoPessoa tipo;

    public Cliente() {

    }

    public Cliente(String nome, String email, TipoPessoa tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
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

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void abrirConta(){

    }


}
