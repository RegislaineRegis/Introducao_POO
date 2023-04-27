public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1, "Regislaine", "regislaine@teste.com.br","Rua: Norte 2, numero: 24, bairro: Zona Azul", "Desenvolvedora de Sistema");
		Cliente cliente2 = new Cliente(2, "Ana maria","anamaria@teste.com.br","Rua: Jose Amaral, numero: 10, bairro: Centro","Advogada");
		
		cliente1.visualizar();
		cliente2.visualizar();

	}

}
