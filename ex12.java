  package pro;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class ex12 {

  	  public static void main(String[] args) {
  
    		ArrayList<String> listaNomes = new ArrayList<>();
    		for (int i = 0; i <10; i++) {
    			System.out.println("Insira um nome: ");
    			Scanner leitura = new Scanner(System.in);
    			String nome = leitura.nextLine();
    			if (!nome.isEmpty()) {
    				listaNomes.add(nome);
    			}
    		}
    
    		listaNomes.set(0, "Emily");
    		
    		for (String elemento : listaNomes) {
    			System.out.println(elemento);
    		}
  	  }
    }