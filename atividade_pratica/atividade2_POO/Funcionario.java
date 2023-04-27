package atividade2_POO;

public class Funcionario {

  private int idFuncionario;
  private String nome;
  private String setor;
  private String profissao;
  private String coordenadorResponsavel;
      
  public Funcionario(int idFuncionario, String nome, String setor, String profissao, String coordenadorResponsavel) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.setor = setor;
		this.profissao = profissao;
		this.coordenadorResponsavel = coordenadorResponsavel;
	}
  public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
  public String getCoordenadorResponsavel() {
		return coordenadorResponsavel;
	}
	public void setCoordenadorResponsavel(String coordenadorResponsavel) {
		this.coordenadorResponsavel = coordenadorResponsavel;
	}

  
    public void visualizar() {
  
      System.out.println("*******************Dados do Cliente**********************");
      System.out.println("Codigo: " + this.idFuncionario);
      System.out.println("Nome: " + this.nome);
      System.out.println("Setor: " + this.setor);     
      System.out.println("Profissão: " + this.profissao);
      System.out.println("Coordenador Responsável: " + this.coordenadorResponsavel);
      System.out.println("\n");
  }
  
}
