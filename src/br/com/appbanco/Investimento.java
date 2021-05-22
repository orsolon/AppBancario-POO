package br.com.appbanco;

import java.math.BigDecimal;

public class Investimento extends Conta {

    public Investimento(int numeroConta, Cliente correntista, BigDecimal saldo) {
        super(numeroConta, correntista, saldo);
    }


    public void investir() {

    }
}
