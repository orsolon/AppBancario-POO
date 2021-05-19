package br.com.appbanco;

import java.math.BigDecimal;

public class Aplicacao {

	private static Object String;

	public static void main(String[] args) {
	    Conta c1, c2;
	    Cliente p1, p2;
		p1 = new Cliente("Maria","maria@gmail.com");
		p2 = new Cliente("Jose","jose@gmail.com");
	   	c1 = new Conta(123456,p1, 100f);
		c2 = new Conta(987567,p2, 120f);

		System.out.println("----------Bem Vindo ao App Banco --------" + "\n");
        System.out.printf("A CONTA %d FOI CRIADA COM SUCESSO! %n", c1.getNumeroConta());
		System.out.println("Em nome de : " + c1.getCorrentista().getNome());
		System.out.println("O saldo inicial é de: " + c1.getSaldo());
		System.out.println("_________________________________________" + "\n");
		System.out.printf("A CONTA %d FOI CRIADA COM SUCESSO! %n", c2.getNumeroConta());
		System.out.println("Em nome de : " + c2.getCorrentista().getNome());
		System.out.println("O saldo inicial é de: " + c2.getSaldo());

    }
}
