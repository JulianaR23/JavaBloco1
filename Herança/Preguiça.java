package Heran�a;

public class Pregui�a extends Animal {
	
	private boolean subirArvores;
	
	
	public boolean isSubirArvores() {return subirArvores;}

	public void setSubirArvores(boolean subirArvores) {this.subirArvores = subirArvores;}
	
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som da que a pregui�a faz � de: iih iih");
	}


	public void subir()
	{
		if(this.subirArvores=true)
			System.out.println("A pregui�a subio na �rvore.");
		else
			System.out.println("A pregui�a n�o subiu na �rvore.");
	}
	
	
	public void status()
	{
		System.out.println("O nome da pregui�a �: " + this.getNome());
		System.out.println("A idade da pregui�a � de: " + this.getIdade() + " anos");
		
	}

}
