package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio1While {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, somaM=0, somaP=0;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade>0)
		{
			
			if(idade<21)
				somaM=somaM+1;
					
			else if(idade>=50)
				somaP=somaP+1;
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
				
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos é de: " + somaM);
		System.out.println("Quantidade de pessoas com maior de 50 anos é de: " + somaP);
	}
}
