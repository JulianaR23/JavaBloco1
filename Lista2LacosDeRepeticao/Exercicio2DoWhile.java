package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2DoWhile {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n, soma=0, cont=0, media=0;
		
		
		do
		{
			System.out.println("Digite um n�mero do teclado: ");
			n = ler.nextInt();
			
			soma=soma+n;
			
			if(n%3==0 && n!=0)
			{
				cont=cont+1;
			}
			
			
			
		}while(n!=0);
		media=soma/cont;
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
	}

}
