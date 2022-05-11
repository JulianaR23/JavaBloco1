package OrientacaoAObjetos;

public class Exercicio2Aviao {

	public static void main(String[] args) {
		
		Exercicio2ModeloAviao aviao1 = new Exercicio2ModeloAviao("Boeing", "azul");
		Exercicio2ModeloAviao aviao2 = new Exercicio2ModeloAviao("Airbus", "amarelo");
		
		
		System.out.println(" Aviao1");
		aviao1.altitude=11.192;
		aviao1.horario=12.30;
		aviao1.decolar();
		aviao1.voar();
		aviao1.estadoATual();
		
		
		System.out.println("\n Aviao2");
		aviao2.altitude=10.259;
		aviao2.horario=19.00;
		aviao2.noChao();
		aviao2.voar();
		aviao2.estadoATual();
		
	}

}
