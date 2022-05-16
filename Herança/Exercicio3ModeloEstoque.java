package Herança;

public class Exercicio3ModeloEstoque {
	
	private int quant;
	private String tipo;
	private double preco;
	
	public Exercicio3ModeloEstoque(int n, String x, double p)
	{
		this.preco=p;
		this.quant=n;
		this.tipo=x;
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
