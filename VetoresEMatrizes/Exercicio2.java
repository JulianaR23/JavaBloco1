package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dado[] = new int[10];
		int media=0, soma=0, maior=0;
		
		System.out.println("Jogue o dado 10 vezes e digite o valor que deu");
		
		for(int indice=0;indice<10;indice++)
		{
			System.out.println("Digite o valor: ");
			dado[indice]=ler.nextInt();
			
			soma=soma+dado[indice];
			
			if(dado[indice]>=6)
				maior=maior+1;
			
		}
		media=soma/10;
		System.out.println("\nA média aritmética dos valores é de: " + media);
		System.out.println("\nOcorrências de maior pontuação: " + maior);
		

	}

}
