package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, somaP=0, somaI=0;
		
		for(int x=0; x<10; x++)
		{
			System.out.println("Digite um n�mero: ");
			n = ler.nextInt();
			
			if(n%2==0) {somaP=somaP+1;}
			else {somaI=somaI+1;}
			
		}
		
		System.out.println("\nQuantidade de n�meros pares: " + somaP);
		System.out.println("Quantidade de n�meros impares: " + somaI);

	}

}
