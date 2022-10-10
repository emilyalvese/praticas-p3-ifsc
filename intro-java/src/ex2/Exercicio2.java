package ex2;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

			Scanner leitura = new Scanner(System.in);
			System.out.println("Informe o nome do indivíduo: ");
			String nome = leitura.nextLine();
			System.out.println("\nInforme a idade do indivíduo: ");
			Integer idade = Integer.valueOf(leitura.nextLine());
			
			System.out.println("\nNome: ");
			System.out.println(nome);
			System.out.println("\nIdade: ");
			System.out.println(idade);
			
	}

}