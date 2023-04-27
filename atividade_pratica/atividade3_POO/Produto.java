package atividade3_POO;

public class Produto {

  private int idProduto;
  private String nome;
  private String marca;
  private int quantidade;
  private float preco;

  public Produto(int idProduto, String nome, String marca, int quantidade, float preco) {
		this.idProduto = idProduto;
    this.nome = nome;
    this.marca = marca;
    this.quantidade = quantidade;
    this.preco = preco;
	}
  public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setProfissao(int quantidade) {
		this.quantidade = quantidade;
	}
  public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
  
  public void visualizar() {
  
    System.out.println("*******************Dados do Cliente**********************");
    System.out.println("Codigo: " + this.idProduto);
    System.out.println("Nome: " + this.nome);
    System.out.println("Marca: " + this.marca);     
    System.out.println("Quantidade: " + this.quantidade);
    System.out.println("Preço: " + this.preco);
    System.out.println("\n");
  }
}
