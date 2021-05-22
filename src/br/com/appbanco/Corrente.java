package br.com.appbanco;

import java.math.BigDecimal;

public class Corrente extends Conta  {

    public Corrente() {
    }

    public Corrente(int numeroConta, Cliente correntista, BigDecimal saldo) {

        super(numeroConta, correntista, saldo);
    }


}
