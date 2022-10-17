package pratica;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Gato> listaGatinhos = new ArrayList<>();
		Gato gato1 = new Gato();
		gato1.setNome("Pipoca");
		gato1.setRaca("American Shorthair");
		gato1.setComprimento(0.25f);
		gato1.setPatas(4);
		gato1.setCor("Cinza com branco");
		gato1.setEcossistema("A gatinha morava na minha casa, principalmente no meu sofá, mas doamos ela");
		listaGatinhos.add(gato1);
		
		Gato gato2 = new Gato();
		gato2.setNome("Matildinha");
		gato2.setRaca("American Shorthair");
		gato2.setComprimento(0.20f);
		gato2.setPatas(4);
		gato2.setCor("Preto e branco");
		gato2.setEcossistema("A gatinha mora na casa da Brenda");
		listaGatinhos.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Zara");
		gato3.setRaca("Ragdoll");
		gato3.setComprimento(0.25f);
		gato3.setPatas(4);
		gato3.setCor("Branco com marronzinho");
		gato3.setEcossistema("A gatinha mora na casa da minha vizinha");
		listaGatinhos.add(gato3);
		
		for (Gato gato : listaGatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getPatas());
			System.out.println(gato.getCor());
			System.out.println(gato.getEcossistema());
			
		}
		
		
		ArrayList<Cachorro> listaCachorrinhos = new ArrayList<>();
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Dago");
		cachorro1.setRaca("Boxer");
		cachorro1.setComprimento(1.15f);
		cachorro1.setPatas(4);
		cachorro1.setCor("Marrom, preto e branco");
		cachorro1.setEcossistema("O cahorrinho morava comigo, mas ele já faleceu");
		listaCachorrinhos.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Kira");
		cachorro2.setRaca("Pitbull");
		cachorro2.setComprimento(1.20f);
		cachorro2.setPatas(4);
		cachorro2.setCor("Marrom com preto");
		cachorro2.setEcossistema("A cahorrinha morava comigo, mas ela já faleceu");
		listaCachorrinhos.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Milly");
		cachorro3.setRaca("Pinscher");
		cachorro3.setComprimento(0.30f);
		cachorro3.setPatas(4);
		cachorro3.setCor("Marrom com branco");
		cachorro3.setEcossistema("A cahorrinho morava comigo, mas ela fugiu e nunca mais voltou");
		listaCachorrinhos.add(cachorro3);
		
		for (Cachorro cachorro : listaCachorrinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getPatas());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getEcossistema());
		}
	
		
	}

}
