package OrientacaoAObjetos;

public class Exercicio5ModeloPatinete {
	
	String cor;
	double valor;
	boolean estilo, andando;
	
	public void tipo()
	{
		if(this.estilo==true)
			System.out.println("É um pantinete normal!");
		else
			System.out.println("É um patinete elétrico!");
	}
	public void normal()
	{
		this.estilo=true;
	}
	public void eletrico()
	{
		this.estilo=false;
	}
	
	public void andar()
	{
		if(this.andando==true)
			System.out.println("o patinete está em uso...");
		else
			System.out.println("o patinete está parado...");
	}
	
	public void status() 
	{
		System.out.println("Cor do patinete: " + this.cor);
		System.out.println("Valor do patinete: R$" + this.valor);
	}

}
