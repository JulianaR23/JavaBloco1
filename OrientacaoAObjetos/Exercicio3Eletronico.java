package OrientacaoAObjetos;

public class Exercicio3Eletronico {

	public static void main(String[] args) {
		
		Exercicio3ModeloEletronico produto1 = new Exercicio3ModeloEletronico();
		Exercicio3ModeloEletronico produto2 = new Exercicio3ModeloEletronico();
		
		System.out.println(" Produto 1");
		produto1.tipo="Celular";
		produto1.valor=1987.50;
		produto1.produtoNovo();
		produto1.produto();
		produto1.status();
		
		System.out.println("\n--------------------------------");
		System.out.println(" Produto 2");
		produto2.tipo="Notebook";
		produto2.valor=19856.99;
		produto2.produtoUsado();
		produto2.produto();
		produto2.status();

	}

}
