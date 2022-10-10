package conta;

import java.util.Scanner;

public class ContaCorrente {

	public String nomeDoTitular;
	public Long cpf;
	public Long numeroDaConta;
	public Double saldo;

	Scanner leitura = new Scanner(System.in);

	public void sacar(Double saque, Double saldo) {
		if (saldo > saque) {
			saldo = saldo - saque;
			System.out.println("Seu saque foi realizado com sucesso!\nNovo saldo: "+saldo);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void depositar(Double deposito, Double saldo) {
		saldo = saldo + deposito;
		System.out.println("Seu depósito foi realizado com sucesso!\nNovo saldo: "+saldo);
	}

	public void mostrarDados() {
		nomeDoTitular = "Emily";
		cpf = 13093824923l;
		numeroDaConta = 14632623l;
		saldo = 1000.0;
		
		System.out.println("Nome do Titular: " + nomeDoTitular);
		System.out.println("Cpf do Titular: " + cpf);
		System.out.println("Número da conta: " + numeroDaConta);
		System.out.println("Saldo da conta: " + saldo);
	}

}
