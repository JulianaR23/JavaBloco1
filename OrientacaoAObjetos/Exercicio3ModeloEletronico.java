package OrientacaoAObjetos;

public class Exercicio3ModeloEletronico {

	String tipo;
	double valor;
	boolean estado;
	
	public void produto()
	{
		if(this.estado==true)
			System.out.println("Este produto está novo!");
		else
			System.out.println("Este produto ja foi usado, mas encontra-se em boas condições!");
	}
	public void produtoNovo()
	{
		this.estado=true;
	}
	public void produtoUsado()
	{
		this.estado=false;
	}
	
	public void status()
	{
		System.out.println("Tipo do produto: " + this.tipo);
		System.out.println("Valor do produto: " + this.valor);
		
	}
	
	
}
