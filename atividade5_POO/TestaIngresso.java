package atividade5_POO;

public class TestaIngresso {
  public static void main(String[] args) {
		
		Ingresso ingresso1 = new Ingresso(1, "Mulher maravilha", 2,25.60f, true);
		Ingresso ingresso2 = new Ingresso(2, "Homem Formiga",1,30.60f,false);		
		ingresso1.visualizar();
		ingresso2.visualizar();

	}
}
