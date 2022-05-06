package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite três números: ");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3)
			System.out.println("\nSeu número maior é:" + n1);
		
		else if(n2>n1 && n2>n3)
			System.out.println("\nSeu número maior é: " + n2);
		
		else
			System.out.println("\nSeu número maior é: " + n3);
	}

}
