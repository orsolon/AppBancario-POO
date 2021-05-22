package br.com.appbanco;

import java.math.BigDecimal;

public class Aplicacao {

	private static Object String;

	public static void main(String[] args) {
	    Conta c1, c2, c3;
	    Cliente p1, p2;
		p1 = new PessoaFisica("maria@gmail.com", "333.444.555-11", TipoPessoa.FISICA,"222.333.444-11" );
		p2 = new PessoaJuridica("José Luis", "minhaempresa@gmail.com", TipoPessoa.JURIDICA , "00.222.229/0001-00", "SouEmpresa");
	   	c1 = new Poupanca(123456,p1,new BigDecimal("100.25"));
		c2 = new Corrente(987567,p2,new BigDecimal("135.00"));
		c3 = new Investimento(1235, p1, new BigDecimal("20.00"));


		System.out.println();
		System.out.println("----------Bem Vindo ao App Banco --------" + "\n");
        System.out.printf("A CONTA PESSOA FISICA SOB NÚMERO:  %d FOI CRIADA COM SUCESSO! %n" , c1.getNumeroConta());
		System.out.println("Em nome de : " + c1.getCorrentista().getNome());
		System.out.println("O saldo inicial é de: " + c1.getSaldo());
		System.out.println("Vamos DEPOSITAR R$ 102,25");
		c1.depositar(new BigDecimal("102.25"));
		System.out.println("O saldo Atual é de: " + c1.getSaldo());
		System.out.println("Vamos SACAR R$ 50.00");
		c1.sacar(new BigDecimal("50.00"));
		System.out.println("O saldo Atual é de: " + c1.getSaldo());


		System.out.println("_________________________________________" + "\n");
		System.out.printf("A CONTA PESSOA JURIDICA SOB NÚMERO: %d FOI CRIADA COM SUCESSO! %n", c2.getNumeroConta());
		System.out.println("Em nome de : " + c2.getCorrentista().getNome());
		System.out.println("O saldo inicial é de: " + c2.getSaldo());
		System.out.println("Vamos DEPOSITAR R$ 500.00");
		c2.depositar(new BigDecimal("500.00"));
		System.out.println("O saldo Atual é de: " + c2.getSaldo());
		System.out.println("Vamos SACAR R$ 60.00");
		c2.sacar(new BigDecimal("50.00"));
		System.out.println("O saldo Atual é de: " + c2.getSaldo());




    }
}
