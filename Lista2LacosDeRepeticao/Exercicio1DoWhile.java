package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		do
		{
			System.out.println("Digite um número do teclado: ");
			n = ler.nextInt();
			
				soma=soma+n;
				
		}while(n!=0);
		
		System.out.println("A soma dos números digitados foi: " + soma);
	}
}
