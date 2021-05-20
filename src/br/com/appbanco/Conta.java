package br.com.appbanco;

import java.math.BigDecimal;

public class Conta {
    private int numeroConta;
    private Cliente correntista;
    protected BigDecimal saldo;


    public Conta(int numeroConta, Cliente correntista, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
