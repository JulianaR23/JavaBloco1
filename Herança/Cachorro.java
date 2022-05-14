package Heran�a;

public class Cachorro extends Animal {
	
	private boolean correr;
	
	
	public boolean isCorrer() {return correr;}

	public void setCorrer(boolean correr) {this.correr = correr;}
	
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som da que a cachorrofaz � de: auu auu");
	}
	
	public void acao() 
	{
		if(this.correr==true)
			System.out.println("O cachorrinho est� correndo.");
		else
			System.out.println("O cachorrinho n�o est� correndo");
	}
	

	
	public void status()
	{
		System.out.println("O nome do cachorro �: " + this.getNome());
		System.out.println("A idade do cachorro �: " + this.getIdade() + " anos");
	}
	

}
