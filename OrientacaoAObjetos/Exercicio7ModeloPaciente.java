package OrientacaoAObjetos;

public class Exercicio7ModeloPaciente {
	
	String nome;
	int idade;
	double peso;
	boolean situacao;
	
	public void ficha()
	{
		if(this.situacao==true)
			System.out.println("Voc� est� doente.");
		else
			System.out.println("Voc� est� saud�vel.");
	}
	public void doente()
	{
		this.situacao=true;
	}
	public void saudavel()
	{
		this.situacao=false;
	}
	
	public void status()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Peso: " + this.peso);
	}
}
