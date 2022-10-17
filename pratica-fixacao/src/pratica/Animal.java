package pratica;

public class Animal {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	private Float comprimento;
	
	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	
	
	private Integer patas;
	
	public Integer getPatas() {
		return patas;
	}

	public void setPatas(Integer patas) {
		this.patas = patas;
	}
	
	
	private String cor;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	private String ecossistema;
	
	public String getEcossistema() {
		return ecossistema;
	}

	public void setEcossistema(String ecossistema) {
		this.ecossistema = ecossistema;
	}
	
	
	public void caminha () {
		System.out.println("andando*");
	}
	
}
