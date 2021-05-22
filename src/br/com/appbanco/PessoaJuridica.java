package br.com.appbanco;

public class PessoaJuridica extends Cliente{
    String cnpj;
    String razaoSocial;

    public PessoaJuridica(String nome, String email, TipoPessoa tipo, String cnpj, String razaoSocial) {
        super(nome, email, tipo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
