package OrientacaoAObjetos;

public class Exercicio6ModeloConta {
	
	String nome;
	int conta,digito, agencia;
	double valor;
	boolean usando;
	
	public void usar()
	{
		if(this.usando==true)
			System.out.println("Você está usando a conta! Legal!");
		else
			System.out.println("Você está usando pouco a sua conta, tente usar mais!");
	}
	public void utilizando()
	{
		this.usando=true;
	}
	public void naoUtilizando()
	{
		this.usando=false;
	}
	
	public Exercicio6ModeloConta(String n, int c, int d, int a)
	{
		this.nome=n;
		this.conta=c;
		this.digito=d;
		this.agencia=a;
	}
	
	public void status()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Número da agencia: " + this.agencia);
		System.out.println("Número da conta: " + this.conta);
		System.out.println("Número do digito: " + this.digito);
		System.out.println("Valor na conta: R$" + this.valor);
		
	}
	

}
