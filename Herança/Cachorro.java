package Heran�a;

public class Cachorro extends Animal {
	
	public boolean correr;
	
	public void acao() 
	{
		if(this.correr==true)
			System.out.println("Ele est� correndo.");
		else
			System.out.println("Ele n�o est� correndo");
	}
	

}
