package br.com.appbanco;

import java.math.BigDecimal;

public interface Transacoes {


    public void depositar(BigDecimal valor);

    public boolean sacar(BigDecimal valor) ;

    public  void transferir();

}
