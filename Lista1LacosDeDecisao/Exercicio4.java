package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n, par, impar;
		
		System.out.println("Digite um número: ");
		n=ler.nextDouble();
		
		if(n%2==0)
			{par=Math.sqrt(n);
			System.out.println("\nSeu número é par.\nE sua raiz quadrada é: " + par);
			}
		else
			{impar=Math.pow(n, 2);
			System.out.println("\nSeu número é impar.\nE elevado ao quadrado é: " + impar);
			
			}
		
		
	}

}
