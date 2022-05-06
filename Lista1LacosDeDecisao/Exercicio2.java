package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite três números: ");
		n1=ler.nextDouble();
		n2=ler.nextDouble();
		n3=ler.nextDouble();
		
		if(n1>n2 && n1>n3 && n2>n3)
			System.out.println("\nEm ordem crescente: \n" + n3 + "\n" + n2 + "\n" + n1);
		
		else if(n1>n2 && n1>n3 && n3>n2)
			System.out.println("\nEm ordem crescente: \n" + n2 + "\n" + n3 + "\n" + n1);
		
		else if(n2>n1 && n2>n3 && n1>n3)
			System.out.println("\nEm ordem crescente: \n" + n3 + "\n" + n1 + "\n" + n2);
		
		else if(n2>n1 && n2>n3 && n3>n1)
			System.out.println("\nEm ordem crescente: \n" + n1 + "\n" + n3 + "\n" + n2);
		
		else if(n3>n1 && n3>n2 && n2>n1)
			System.out.println("\nEm ordem crescente: \n" + n3 + "\n" + n2 + "\n" + n1);
		
		else
			System.out.println("\nEm ordem crescente: \n" + n2 + "\n" + n1 + "\n" + n3);

	}

}
