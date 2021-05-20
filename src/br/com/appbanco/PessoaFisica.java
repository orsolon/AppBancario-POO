package br.com.appbanco;

public class PessoaFisica extends Cliente{
    String cpf;


    public PessoaFisica(String nome, String email) {
        super(nome, email);
    }

    public PessoaFisica( String email, String cpf, String nome1) {
        this.cpf = cpf;
        this.nome = nome1;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
