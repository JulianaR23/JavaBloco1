package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int m[][]=new int [3][3];
		int soma=0, somaD=0;
		
		for(int linha=0; linha<3; linha++)
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite os valores para a matriz 3X3: ");
				m[linha][coluna]=ler.nextInt();
				
				soma=soma+m[linha][coluna];
				
				if(linha==coluna)
					somaD=somaD+m[linha][coluna];
			}
		
		System.out.println("\nA soma de todos os valores da matriz é de: " + soma);
		System.out.println("\nA soma dos valores da primeira diagonal é de: " + somaD);

	}

}
