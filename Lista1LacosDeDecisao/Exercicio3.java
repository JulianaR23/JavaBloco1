package Lista1LacosDeDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite uma idade: ");
		idade=ler.nextInt();
				
		if(idade>=10 && idade<=14)
			System.out.println("Você está na categoria Infantil.");
		
			else if(idade>=15 && idade<=17)
			System.out.println("Você está na categoria Juvenil.");
		
			else if(idade>=18 && idade<=25)
			System.out.println("Você está na categoria Adulto.");
			
			else 
				System.out.println("Não há categoria.");
		
		
	}

}
