package br.com.appbanco;

public class PessoaFisica extends Cliente{
    String cpf;
    String nome;

    public PessoaFisica(String nome, String email) {
        super(nome, email);
    }
}
