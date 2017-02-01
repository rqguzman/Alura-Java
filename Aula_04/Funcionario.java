class Funcionario{

  Pessoa colaborador;
  String departamento;
  double salario;
  //String dataAdmissao;
  Data dataAdmissao;

  void recebeAumento(double valorAumento){
    this.salario += valorAumento;
  }

  double calculaGanhoAnual(){
    return this.salario * 12;
  }

  void mostra(){
    System.out.println("Nome: " + this.colaborador.nome);
    System.out.println("Data de Nascimento: " + this.colaborador.dataNascimento.getFormatada());
    System.out.println("RG: " + this.colaborador.rg);
    System.out.println("Departamento: " + this.departamento);
    System.out.println("Salário atual: " + this.salario);
    System.out.println("Data de Admissão: " + this.dataAdmissao.getFormatada());
    System.out.println("Ganho anual: R$ " + this.calculaGanhoAnual());
  }

}

class Empresa{
  String nomeEmpresa;
  String cnpj;

  Funcionario[] funcionarios;
  int freeSpot = 0;

  void adicionar(Funcionario f){
    this.funcionarios[this.freeSpot] = f;
    this.freeSpot++;
  }

  void exibeFuncionario(){
    for (Funcionario i : this.funcionarios) {
      if (i == null) {
        continue;
      }
      System.out.println("===============================");
      i.mostra();
    }
  }

  boolean contem(Funcionario f){
    for (int i = 0; i <= this.freeSpot; i++) {
      if (this.funcionarios[i] == f) {
        return true;
      }
    }
    return false;
  }
}
