package atividade2_POO;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(1, "Regislaine", "TI","Desenvolvedor(a) de Software", "Michelle Souza");
		Funcionario funcionario2 = new Funcionario(2, "Ana maria","Administrativo","Analista Contabil","João Meira");
		
		funcionario1.visualizar();
		funcionario2.visualizar();

	}

}