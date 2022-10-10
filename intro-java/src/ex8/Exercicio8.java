package ex8;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		ArrayList<String> listaElementos = new ArrayList<>();
		for (int i = 0; i <10; i++) {
			listaElementos.add(leitura.nextLine());
		}
		for (String elemento : listaElementos) {
			System.out.println(elemento);
		}

	}
	
}