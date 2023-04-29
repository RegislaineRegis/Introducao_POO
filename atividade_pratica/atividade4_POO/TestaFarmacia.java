package atividade4_POO;

public class TestaFarmacia {
  
  public static void main(String[] args) {
		
		Farmacia produto1 = new Farmacia(1, "AS-Infantil", "Sanofi-Aventis",50, 12.50f);
		Farmacia produto2 = new Farmacia(2, "Dipirona","Neosaldina",20,23.39f);		
		produto1.visualizar();
		produto2.visualizar();

	}
}
