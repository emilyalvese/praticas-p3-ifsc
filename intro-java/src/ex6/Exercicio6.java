package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int maiorValor = 0, menorValor = 999999999;

		Scanner leitura = new Scanner(System.in);
		Integer[] vetor = new Integer[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira valor:");
			vetor[i] = Integer.valueOf(leitura.nextLine());
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}
		System.out.println("Maior valor do vetor: ");
		System.out.println(maiorValor);
		System.out.println("Menor valor do vetor: ");
		System.out.println(menorValor);
	}
}