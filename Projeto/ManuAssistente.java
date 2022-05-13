package Projeto;


public class ManuAssistente extends ModeloAvatar {
	
	
	public void apresentacao()
	{
		System.out.println("******************************************");
		System.out.println("Olá, eu sou " + this.nome +  " muito prazer!!\n\nTenho " +this.idade + " anos e sou uma pessoa não-binária.\nEstou aqui para ser sua assistente e te ajudar nessa trajetória tirando suas dúvidas...");
		System.out.println("\nPor favor, Digite uma opção:");
		System.out.println("\n1 - Como participar do nosso programa?\n2 - Preciso ter conhecimento em programação?");
		System.out.println("3 - Quais exigências para poder participar?\n4 - Quantos tempo dura o Bootcamp?");
		System.out.println("5 - Não tenho internet e computador em casa, posso participar?");
		System.out.println("\n******************************************");
	}

		
	
	

}
