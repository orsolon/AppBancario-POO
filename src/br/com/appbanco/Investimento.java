package br.com.appbanco;

import java.math.BigDecimal;

public class Investimento extends Conta implements Transacoes{

    public Investimento(int numeroConta, Cliente correntista, BigDecimal saldo) {
        super(numeroConta, correntista, saldo);
    }

    @Override
    public void depositar() {
        Transacoes.super.depositar();
    }

    @Override
    public void sacar() {
        Transacoes.super.sacar();
    }

    @Override
    public void transferir() {
        Transacoes.super.transferir();
    }

    public void investir() {

    }
}
