package OrientacaoAObjetos;

public class Exercicio4Funcionario {

	public static void main(String[] args) {
		
		Exercicio4ModeloFuncionario funcionario1 = new Exercicio4ModeloFuncionario("Juliana", "Dev Junior");
		Exercicio4ModeloFuncionario funcionario2 = new Exercicio4ModeloFuncionario("Gustavo", "Analista");
		
		System.out.println(" Funcionário 1");
		funcionario1.idade=24;
		funcionario1.salario=3600.00;
		funcionario1.horasS=55;
		funcionario1.status();
		
		
		System.out.println("\n--------------------------");
		System.out.println(" Funcionário 2");
		funcionario2.idade=25;
		funcionario2.salario=2500.50;
		funcionario2.horasS=80;
		funcionario2.status();
		

	}

}
