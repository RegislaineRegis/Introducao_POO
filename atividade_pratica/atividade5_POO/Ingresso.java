package atividade5_POO;

public class Ingresso {

  private int idIngresso;
  private String nomeFilme;
  private int quantidade;
  private float preco;
  private boolean clubePipoca;

  public Ingresso(int idPIngresso, String nomeFilme, int quantidade, float preco, boolean clubePipoca) {
		this.idIngresso = idPIngresso;
    this.nomeFilme = nomeFilme;
    this.quantidade = quantidade;
    this.preco = preco;
    this.clubePipoca = clubePipoca;
	}

  public int getIdIngresso() {
		return idIngresso;
	}
	public void setIdIngresso(int idIngresso) {
		this.idIngresso = idIngresso;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
  public boolean getClubePipoca() {
		return clubePipoca;
	}
	public void setClubePipoca(boolean clubePipoca) {
		this.clubePipoca = clubePipoca;
	}
  
  public void visualizar() {
  
    System.out.println("*******************Dados do Produto**********************");
    System.out.println("Codigo: " + this.idIngresso);
    System.out.println("Nome do Filme: " + this.nomeFilme);
    System.out.println("Quantidade de Ingresso: " + this.quantidade);     
    System.out.println("Preco por Ingresso: " + this.preco);
    System.out.println("Pacote Pipoca SIM/NÃO: " + (this.clubePipoca ? "SIM" : "NÃO"));
    System.out.println("\n");
  }
}
