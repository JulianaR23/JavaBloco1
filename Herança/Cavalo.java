package Heran�a;

public class Cavalo extends Animal {
	
	private boolean correr;
	
	
	public boolean isCorrer() {return correr;}
	
	public void setCorrer(boolean correr) {this.correr = correr;}
	
	
	@Override
	public void emitirSom()
	{
		System.out.println("O som que o cavalo faz � de: irraa irraa");
	}
	

	public void acaoC()
	{
		if(this.correr==true)
			System.out.println("O Cavalinho est� correndo.");
		else
			System.out.println("O Cavalinho n�o est� correndo");
	}
	
	
	public void status()
	{
		System.out.println("O nome do cavalo �: " + this.getNome());
		System.out.println("A idade do cavalo �: " + this.getIdade() + " anos");
	}

}
