package Herança;

public class Preguiça extends Animal {
	
	private boolean subirArvores;
	
	
	public boolean isSubirArvores() {return subirArvores;}

	public void setSubirArvores(boolean subirArvores) {this.subirArvores = subirArvores;}
	
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som da que a preguiça faz é de: iih iih");
	}


	public void subir()
	{
		if(this.subirArvores=true)
			System.out.println("A preguiça subio na árvore.");
		else
			System.out.println("A preguiça não subiu na árvore.");
	}
	
	
	public void status()
	{
		System.out.println("O nome da preguiça é: " + this.getNome());
		System.out.println("A idade da preguiça é de: " + this.getIdade() + " anos");
		
	}

}
