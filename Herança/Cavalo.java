package Heran�a;

public class Cavalo extends Animal {
	
	public boolean correr;
	
	public void acaoC()
	{
		if(this.correr==true)
			System.out.println("Ele est� correndo.");
		else
			System.out.println("Ele n�o est� correndo");
	}

}
