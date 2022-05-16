package Herança;

import java.util.ArrayList;

public class Exercicio3Estoque {

	public static void main(String[] args) {
		
		Exercicio3ModeloEstoque a = new Exercicio3ModeloEstoque(10,"Camisa",19.50);
		Exercicio3ModeloEstoque b = new Exercicio3ModeloEstoque(5, "Calça", 55.90);
		Exercicio3ModeloEstoque c = new Exercicio3ModeloEstoque(9, "blusas", 79.88);
		
		ArrayList<Exercicio3ModeloEstoque> tudo = new ArrayList<>();
		
		
		tudo.add(a);
		tudo.add(b);
		tudo.add(c);
		
		System.out.println();
		System.out.println(tudo);
		
		

	}

}
