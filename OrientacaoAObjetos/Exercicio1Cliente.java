package OrientacaoAObjetos;

public class Exercicio1Cliente {

	public static void main(String[] args) {
		
		Exercicio1ModeloCliente cliente1 = new Exercicio1ModeloCliente("Juliana", 24, "femenino");
		Exercicio1ModeloCliente cliente2 = new Exercicio1ModeloCliente("Roberto", 36, "masculino");
		
		
		System.out.println(" Cliente 1");
		cliente1.identidade=123456789;
		cliente1.comprarDeNovo();
		cliente1.comprar();
		cliente1.status();
		
		System.out.println("\n Cliente 2");
		cliente2.identidade=987654321;
		cliente2.primeiraCompra();
		cliente2.comprar();
		cliente2.status();
		

	}

}
