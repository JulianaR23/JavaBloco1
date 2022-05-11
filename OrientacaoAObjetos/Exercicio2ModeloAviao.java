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
			System.out.println("O avi�o ja est� voando!");
		else
			System.out.println("O avi�o ainda n�o decolou!");
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
		System.out.println("O nome do avi�o: " + this.nome);
		System.out.println("A cor do avi�o: " + this.cor);
		System.out.println("Altitude m�xima que ele poder� chegar: " + this.altitude);
		System.out.println("Horario de sa�da: " + this.horario);
	}

}
