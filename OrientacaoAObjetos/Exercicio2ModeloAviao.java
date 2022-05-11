package OrientacaoAObjetos;

public class Exercicio2ModeloAviao {
	
	//ATRIBUTOS
	String nome, cor;
	double altitude, horario;
	boolean voando;
	
	//METODOS
	public void voar()
	{
		if(this.voando==true)
			System.out.println("O avião ja está voando!");
		else
			System.out.println("O avião ainda não decolou!");
	}
	public void decolar()
	{
		this.voando=true;
	}
	public void noChao()
	{
		this.voando=false;
	}
	
	
	//METODO CONSTRUTOR
	public Exercicio2ModeloAviao(String n, String c)
	{
		this.nome=n;
		this.cor=c;
	}
	
	public void estadoATual()
	{
		System.out.println("O nome do avião: " + this.nome);
		System.out.println("A cor do avião: " + this.cor);
		System.out.println("Altitude máxima que ele poderá chegar: " + this.altitude);
		System.out.println("Horario de saída: " + this.horario);
	}

}
