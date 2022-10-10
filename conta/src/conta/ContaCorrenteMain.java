package conta;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente pessoa = new ContaCorrente();
		
		pessoa.mostrarDados();
		pessoa.depositar(1000.0, 1000.0);
		pessoa.sacar(500.0, 1000.0);
		
	}

}