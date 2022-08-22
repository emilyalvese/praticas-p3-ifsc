package pro;

public class ex3 {

	public Double calculaAbastecimento(Double qtdLitros, Double precoLitro){
      if(qtdLitros == null){
        System.out.println("Valores nulos foram fornecidos para quantidadeLitros!");
      }
      if(precoLitro == null){
          System.out.println("Valores nulos foram fornecidos para precoLitro!");
        }
      return qtdLitros*precoLitro;
    }
}
