package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, somaP=0, somaI=0;
		
		for(int x=0; x<10; x++)
		{
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			
			if(n%2==0) {somaP=somaP+1;}
			else {somaI=somaI+1;}
			
		}
		
		System.out.println("\nQuantidade de números pares: " + somaP);
		System.out.println("Quantidade de números impares: " + somaI);

	}

}
