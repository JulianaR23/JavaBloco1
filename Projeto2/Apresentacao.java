package Projeto2;

import java.util.Scanner;

public class Apresentacao extends BaseAvatar { 
	Scanner ler = new Scanner(System.in);
	
    int falarcomquem;

    
    	public void apresentar() {
    		this.setNome("Manu");
    		this.setIdade(19);
    		this.setgenero("n�o-bin�rie");
    		System.out.println("Ol�, eu sou "+this.getNome()+", muito prazer!!\nTenho "+this.getIdade()+" anos e sou uma pessoa "+this.getgenero()+".\nEstou aqui para te ajudar nessa trajet�ria e tirar suas d�vidas...\n");
	
} 
		public void falarcomManuOuManu2() {
	
			System.out.println("Se voc� quer saber mais sobre a Generation digite o n�mero correspondente as op��es abaixo:");
			System.out.println("1- Para conhecer a Generation");
			System.out.println("2- Para tirar sua duvidas");
			falarcomquem=ler.nextInt();
		
	}
	
		public void falarcomManuOuManu2erro() {
	
			do {
				System.out.println("Numero invalido tente novamente");
				System.out.println("1- Para conhecer a Generation");
				System.out.println("2- Para tirar sua duvidas");			
				falarcomquem=ler.nextInt();
			}
			while(falarcomquem!=1&&falarcomquem!=2);
	
	}
			
		
			
}
		






