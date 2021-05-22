package br.com.appbanco;

import java.math.BigDecimal;

public class Conta implements Transacoes {
    private int numeroConta;
    private Cliente correntista;
    protected BigDecimal saldo;

    public Conta() {

    }

    public Conta(int numeroConta, Cliente correntista, BigDecimal saldo) {
        this();
        this.numeroConta = numeroConta;
        this.correntista = correntista;
        this.saldo = saldo;
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


    @Override
    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado = new BigDecimal(String.valueOf(valor));
        this.setSaldo(this.getSaldo().add(valorDepositado));
    }

    @Override
    public boolean sacar(BigDecimal valor) {

        BigDecimal valorSaldo = new BigDecimal(String.valueOf(this.getSaldo()));
        BigDecimal valorSacado = new BigDecimal(String.valueOf(valor));
        double answer = (valorSaldo.compareTo(valorSacado));
        if (answer == 0 || answer == 1) {
            this.setSaldo(this.getSaldo().subtract(valorSacado));
            return true;
        }
        return false;
       /*
        switch (tipo) {
            case TipoPessoa.FISICA:
                BigDecimal valorSaldo = new BigDecimal(String.valueOf(this.getSaldo()));
                BigDecimal valorSacado = new BigDecimal(String.valueOf(valor));
                double answer = (valorSaldo.compareTo(valorSacado));
                if (answer == 0 || answer == 1) {
                    this.setSaldo(this.getSaldo().subtract(valorSacado));
                    return true;
                }
            case TipoPessoa.JURIDICA:
                double taxa = 0.5;

        }

        return false;


    }
*/

    }

    public void descontarTaxaPJ (BigDecimal valor){
        double taxa = 0.5;
        BigDecimal valorTaxa = new BigDecimal(String.valueOf(valor));
        BigDecimal result = valorTaxa.multiply(BigDecimal.valueOf(taxa));
        this.setSaldo(this.getSaldo().subtract(result));

    }

    @Override
    public void transferir() {

    }
}
