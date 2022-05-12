package Herança;

public class Cavalo extends Animal {
	
	public boolean correr;
	
	public void acaoC()
	{
		if(this.correr==true)
			System.out.println("Ele está correndo.");
		else
			System.out.println("Ele não está correndo");
	}

}
