package ex7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		String[] vetor = new String[10];
		vetor[0] = "10";
		vetor[1] = "9";
		vetor[2] = "8";
		vetor[3] = "7";
		vetor[4] = "6";
		vetor[5] = "5";
		vetor[6] = "4";
		vetor[7] = "3";
		vetor[8] = "2";
		vetor[9] = "1";

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println("Tamanho do vetor: " + vetor.length);
		System.out.println("Valor da última posição do vetor: " + vetor[vetor.length - 1]);

	}

}