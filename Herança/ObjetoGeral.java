package Heran�a;

public class ObjetoGeral {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Pregui�a pregui�a = new Pregui�a();
		Cavalo cavalo = new Cavalo();
		
		System.out.println("************************");
		cachorro.setNome("Toby");
		cachorro.setIdade(5);
		cachorro.setCorrer(true);
		cachorro.acao();
		cachorro.emitirSom();
		cachorro.status();
		System.out.println("\n************************\n");
		
		
		pregui�a.setNome("Paulo");
		pregui�a.setIdade(10);
		pregui�a.setSubirArvores(true);
		pregui�a.subir();
		pregui�a.emitirSom();
		pregui�a.status();
		System.out.println("\n************************\n");
		
		
		cavalo.setNome("Alfredo");
		cavalo.setIdade(18);
		cavalo.setCorrer(true);
		cavalo.acaoC();
		cavalo.emitirSom();
		cavalo.status();
		System.out.println("\n************************\n");
		
		
		
	}

}
