package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite tr�s n�meros: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3)
			System.out.println("\nSeu n�mero maior �:" + n1);
		
		else if(n2>n1 && n2>n3)
			System.out.println("\nSeu n�mero maior �: " + n2);
		
		else
			System.out.println("\nSeu n�mero maior �: " + n3);
	}

}
