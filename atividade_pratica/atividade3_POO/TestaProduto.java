package atividade3_POO;

public class TestaProduto {
  public static void main(String[] args) {
		
		Produto produto1 = new Produto(1, "borracha", "Faber-Castell",50, 2.50f);
		Produto produto2 = new Produto(2, "lapis de cor","Prismacolor",10,2360.39f);		
		produto1.visualizar();
		produto2.visualizar();

	}
}
