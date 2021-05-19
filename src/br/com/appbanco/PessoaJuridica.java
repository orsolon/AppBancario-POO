package br.com.appbanco;

public class PessoaJuridica extends Cliente{
    String cnpj;
    String razaoSocial;

    public PessoaJuridica(String nome, String email) {
        super(nome, email);
    }

}
