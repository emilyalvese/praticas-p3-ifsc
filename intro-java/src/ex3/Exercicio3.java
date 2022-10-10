package ex3;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe um inteiro qualquer: ");
		Integer inteiro = Integer.valueOf(leitura.nextLine());
		
		if(inteiro%2==0) {
			System.out.println("O valor é par!");
		}
		if(inteiro%2!=0) {
			System.out.println("O valor é ímpar!");
		}
		
	}

}