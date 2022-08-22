package pro;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		String[] vetor = new String[5];
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("insira valor:");
			vetor[i] = leitura.nextLine();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			System.out.println("Tamanho do vetor: 5 posições");
		}
		System.out.println(vetor[5]);
	}
}