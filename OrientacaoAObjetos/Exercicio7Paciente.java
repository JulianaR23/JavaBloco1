package OrientacaoAObjetos;

public class Exercicio7Paciente {
	public static void main(String[] args) {
		
		Exercicio7ModeloPaciente paciente1 = new Exercicio7ModeloPaciente();
		Exercicio7ModeloPaciente paciente2 = new Exercicio7ModeloPaciente();
		
		System.out.println(" Paciente 1");
		paciente1.nome="Juliana";
		paciente1.idade=24;
		paciente1.peso=52.4;
		paciente1.saudavel();
		paciente1.ficha();
		paciente1.status();
		
		System.out.println("\n---------------------");
		System.out.println(" Paciente 2");
		paciente2.nome="Alfredo";
		paciente2.idade=58;
		paciente2.peso=69.87;
		paciente2.doente();
		paciente2.ficha();
		paciente2.status();
		
		
		
	}

}
