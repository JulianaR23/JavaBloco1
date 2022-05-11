package OrientacaoAObjetos;

public class Exercicio5Patinete {

	public static void main(String[] args) {
		
		Exercicio5ModeloPatinete patinete1 = new Exercicio5ModeloPatinete();
		Exercicio5ModeloPatinete patinete2 = new Exercicio5ModeloPatinete();
		
		System.out.println(" Patinete 1");
		patinete1.cor="AZUL E AMARELO";
		patinete1.valor=409.99;
		patinete1.normal();
		patinete1.tipo();
		patinete1.andando = true;
		patinete1.andar();
		patinete1.status();
		
		System.out.println("\n-----------------------------");
		System.out.println(" Patinete 2");
		patinete2.cor="VERMELHO";
		patinete2.valor=1988.96;
		patinete2.eletrico();
		patinete2.tipo();
		patinete2.andando = false;
		patinete2.andar();
		patinete2.status();
		
	}

}
