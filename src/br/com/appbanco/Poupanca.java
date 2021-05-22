package br.com.appbanco;

import java.math.BigDecimal;

public class Poupanca extends Conta {

    public Poupanca() {
    }

    public Poupanca(int numeroConta, Cliente correntista, BigDecimal saldo) {
        super(numeroConta, correntista, saldo);
    }


}
