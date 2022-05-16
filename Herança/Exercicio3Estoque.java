package Herança;

import java.util.*;

public class Exercicio3Estoque {

	public static void main(String[] args) {

		ArrayList<String> tudo = new ArrayList<>();
	
		tudo.add("Camisa");
		tudo.add("Calça");
		tudo.add("Blusa");
		
		System.out.println("Tudo o que tem no estoque: " + tudo);
		
		tudo.remove(1);
		
		System.out.println("Tudo o que tem no estoque: " + tudo);
		
		tudo.add(2,"Sapato");
		tudo.add(3, "Bota");
		
		System.out.println("Tudo o que tem no estoque: " + tudo);

	}

}
