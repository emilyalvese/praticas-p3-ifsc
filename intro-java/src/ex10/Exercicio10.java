package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void calculaMedia(Double nota1, Double nota2, Double nota3) {
		Double MF = 0.0;

		MF = (nota1 + nota2 + nota3) / 3;

		if (MF >= 6) {
			System.out.println("Aprovado(a)");
		} else if (MF >= 4 && MF < 6) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado(a)");
		}
	}

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		String nomeAluno = leitura.nextLine();
		Double nota1 = Double.valueOf(leitura.nextLine());
		Double nota2 = Double.valueOf(leitura.nextLine());
		Double nota3 = Double.valueOf(leitura.nextLine());

		calculaMedia(nota1, nota2, nota3);
	}

}