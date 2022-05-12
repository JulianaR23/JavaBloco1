package Herança;

public class Cachorro extends Animal {
	
	public boolean correr;
	
	public void acao() 
	{
		if(this.correr==true)
			System.out.println("Ele está correndo.");
		else
			System.out.println("Ele não está correndo");
	}
	

}
