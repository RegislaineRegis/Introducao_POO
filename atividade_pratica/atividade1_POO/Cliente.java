public class Cliente {

  private int idCliente;
  private String nome;
  private String email;
  private String endereco;
  private String profissao;

  public Cliente(int idCliente, String nome, String email, String endereco, String profissao) {
    this.idCliente = idCliente;
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
    this.profissao = profissao;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public void visualizar() {

    System.out.println("*******************Dados do Cliente**********************");
    System.out.println("Codigo: " + this.idCliente);
    System.out.println("Nome: " + this.nome);
    System.out.println("E-mail: " + this.email);
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Profissão: " + this.profissao);
    System.out.println("\n");
  }
}
