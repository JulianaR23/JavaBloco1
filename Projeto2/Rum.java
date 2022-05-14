package Projeto2;

public class Rum extends BaseAvatar {

	public static void main(String[] args) {
		
	   Apresentacao a1 = new Apresentacao();
	   Manu1 m1 = new Manu1();
	   Manu2 m2 = new Manu2();
	   
	   a1.apresentar();
	   a1.falarcomManuOuManu2();
	   
	   do {
	   if(a1.falarcomquem==1)
	   { m1.perguntasmanu();}
	   else if(a1.falarcomquem==2)
	   { m2.perguntasmanu();}
	   else { a1.falarcomManuOuManu2erro();}
	   
	   }while(a1.falarcomquem!=1 && a1.falarcomquem!=2);
	   
	   if(a1.falarcomquem==1)
	   { m1.perguntasmanu();}
	   else if(a1.falarcomquem==2)
	   { m2.perguntasmanu();}
	}
}