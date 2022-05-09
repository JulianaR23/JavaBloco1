package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, op, calma=0, nerM=0, homA=0, outroC=0, nervM=0, menorC=0, p;
		
		System.out.println("Digite seu número na fila: ");
		p = ler.nextInt();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite seu sexo: 1-feminino / 2-masculino / 3-Outros");
		sexo = ler.nextInt();
		
		System.out.println("Digite uma opção: 1-sou calma; 2-sou nervosa e 3-sou agressiva).");
		op = ler.nextInt();
		
		while(p<=150)
		{
			if(op==1) { calma=calma+1;}
			if(sexo==1 && op==2) { nerM=nerM+1;}
			if(sexo==2 && op==3) { homA=homA+1;}
			if(sexo==3 && op==1) { outroC=outroC+1;}
			if(op==2 && idade>=40) { nervM=nervM+1;}
			if(op==1 && idade<=18) { menorC=menorC+1;}
			
			if(sexo>=4 || op>=4 || idade<0) { System.out.println("Há uma opção inválida, por favor altere.");}
			
			System.out.println("Digite seu número na fila: ");
			p = ler.nextInt();
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu sexo: 1-feminino / 2-masculino / 3-Outros");
			sexo = ler.nextInt();
			
			System.out.println("Digite uma opção: 1-sou calma; 2-sou nervosa e 3-sou agressiva).");
			op = ler.nextInt();
			
		}
		
		System.out.println("Número de pessoas calmas: " + calma);
		System.out.println("Número de mulheres nervosas: "+ nerM);
		System.out.println("Número de homens agressivos: " + homA);
		System.out.println("Número de outros calmos: " + outroC);
		System.out.println("Número de pessoas nervosas acima de 40 anos: " + nervM);
		System.out.println("Número de pessoas calmas abaixo de 18 anos: " + menorC);
		
	}

}
