package br.com.appbanco;

public enum TipoPessoa {

    FISICA('F'), JURIDICA('J');

    public char sigla;

    public char getSigla() {
        return sigla;
    }

    TipoPessoa(char sigla){
        this.sigla = sigla;
    }


}
