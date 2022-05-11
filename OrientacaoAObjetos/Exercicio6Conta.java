package OrientacaoAObjetos;

public class Exercicio6Conta {

	public static void main(String[] args) {
		
		 Exercicio6ModeloConta conta1 = new Exercicio6ModeloConta("Juliana", 12345678, 9, 1234);
		 Exercicio6ModeloConta conta2 = new Exercicio6ModeloConta("Henrique", 87654321, 0, 7896);
		 
		 System.out.println(" Conta 1");
		 conta1.valor=4569.55;
		 conta1.utilizando();
		 conta1.usar();
		 conta1.status();
		 
		 System.out.println("\n---------------------");
		 System.out.println(" Conta 2");
		 conta2.valor=896.66;
		 conta2.naoUtilizando();
		 conta2.usar();
		 conta2.status();

	}

}
