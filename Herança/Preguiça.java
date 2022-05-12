package Herança;

public class Preguiça extends Animal {
	
	public boolean subirArvores;
	
	public void subir()
	{
		if(this.subirArvores=true)
			System.out.println("A preguiça subio na árvore.");
		else
			System.out.println("A preguiça não subiu na árvore.");
	}

}
