package Lista2LacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		 for(n=1000;n<=1999;n++)
		 {
			 if(n%11==5)
			 {
				 System.out.println("Número que que restão 5: " + n);
			 }
		 }
			
		
	}

}
