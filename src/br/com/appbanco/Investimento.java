package br.com.appbanco;

import java.math.BigDecimal;

public class Investimento extends Conta {

    public Investimento(int numeroConta, Cliente correntista, BigDecimal saldo) {
        super(numeroConta, correntista, saldo);
    }


    public void investir(BigDecimal valor) {
        double taxa = 0.2;
        BigDecimal valorTaxa = new BigDecimal(String.valueOf(valor));
        BigDecimal result = valorTaxa.multiply(BigDecimal.valueOf(taxa));
        this.setSaldo(this.getSaldo().add(result));
    }
}
