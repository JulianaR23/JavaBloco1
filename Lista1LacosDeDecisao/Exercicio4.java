package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n, par, impar;
		
		System.out.println("Digite um n�mero: ");
		n=ler.nextDouble();
		
		if(n%2==0)
			{par=Math.sqrt(n);
			System.out.println("\nSeu n�mero � par.\nE sua raiz quadrada �: " + par);
			}
		else
			{impar=Math.pow(n, 2);
			System.out.println("\nSeu n�mero � impar.\nE elevado ao quadrado �: " + impar);
			
			}
		
		
	}

}
