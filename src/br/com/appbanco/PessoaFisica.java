package br.com.appbanco;

public class PessoaFisica extends Cliente{
    String cpf;

    public PessoaFisica(String nome, String email, TipoPessoa tipo, String cpf) {
        super(nome, email, tipo);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
