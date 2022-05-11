package OrientacaoAObjetos;

public class Exercicio1ModeloCliente {
	
	String nome, sexo;
	int idade;
	int identidade;
	boolean clienteFiel;
	
	public void comprar()
	{
		if(this.clienteFiel==true)
			System.out.println("Prazer te ter de volta na nossa loja!");
		else
			System.out.println("Muito bem vindo na nossa loja");
	} 
	public void comprarDeNovo()
	{
		this.clienteFiel=true;
	}
	public void primeiraCompra()
	{
		this.clienteFiel=false;
	}
	
	public Exercicio1ModeloCliente(String n, int i, String s)
	{
		this.nome=n;
		this.idade=i;
		this.sexo=s;
	}
	
	public void status()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Número do RG: " + this.identidade);
	}

}
