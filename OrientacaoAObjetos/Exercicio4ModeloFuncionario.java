package OrientacaoAObjetos;

public class Exercicio4ModeloFuncionario {

	
	String nome,cargo;
	int idade;
	double salario, horasS;
	
	
	public Exercicio4ModeloFuncionario(String n, String c)
	{
		this.nome=n;
		this.cargo=c;
	}
	
	public void status()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salário: R$" + this.salario);
		System.out.println("Horas sobrando: " + this.horasS + "h.");
	}
	
	
}
