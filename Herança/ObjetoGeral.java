package Herança;

public class ObjetoGeral {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Preguiça preguiça = new Preguiça();
		Cavalo cavalo = new Cavalo();
		
		System.out.println("************************");
		cachorro.setNome("Toby");
		cachorro.setIdade(5);
		cachorro.setCorrer(true);
		cachorro.acao();
		cachorro.emitirSom();
		cachorro.status();
		System.out.println("\n************************\n");
		
		
		preguiça.setNome("Paulo");
		preguiça.setIdade(10);
		preguiça.setSubirArvores(true);
		preguiça.subir();
		preguiça.emitirSom();
		preguiça.status();
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
