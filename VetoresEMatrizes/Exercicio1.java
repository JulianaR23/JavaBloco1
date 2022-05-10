package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int v[] = new int [5];
		int maior=0;
		
		Scanner ler = new Scanner (System.in);
		
		for(int indice=0;indice<5;indice++)
			{
				System.out.println("Digite sua pontuação: ");
				v[indice]=ler.nextInt();
				
					if(maior<v[indice])
					maior=v[indice];
					
			}
		System.out.println("Sua maior pontuação é: " + maior);
	}
}
