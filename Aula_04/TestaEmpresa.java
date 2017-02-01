class TestaEmpresa {

  public static void main(String[] args) {

    // FUNCIONARIOS
    Funcionario f1 = new Funcionario();

    f1.colaborador = new Pessoa();
    f1.colaborador.nome = "Hugo";
    f1.colaborador.dataNascimento = new Data();
    f1.colaborador.dataNascimento.preencheData(2, 5, 1973);
    f1.colaborador.rg = "12.345.678-9";
    f1.departamento = "I.T.";
    f1.salario = 100.0;
    f1.dataAdmissao = new Data();
    f1.dataAdmissao.preencheData(20, 1, 1993);

    Funcionario f2 = new Funcionario();

    f2.colaborador = new Pessoa();
    f2.colaborador.nome = "Armando";
    f2.colaborador.dataNascimento = new Data();
    f2.colaborador.dataNascimento.preencheData(7, 2, 1967);
    f2.colaborador.rg = "12.345.678-9";
    f2.departamento = "I.T.";
    f2.salario = 1000.0;
    f2.dataAdmissao = new Data();
    f2.dataAdmissao.preencheData(20, 1, 1989);

    Funcionario f3 = new Funcionario();

    f3.colaborador = new Pessoa();
    f3.colaborador.nome = "Marcelo";

    //EMPRESA
    Empresa empresaTeste = new Empresa();
    empresaTeste.nomeEmpresa = "Empresa Teste Ltda";
    empresaTeste.cnpj = "123.456.789/0001-10";
    empresaTeste.funcionarios = new Funcionario[10];//CRIANDO O ARRAY

    // ADICIONANDO FUNCIONARIOS A EMPRESA

    empresaTeste.adicionar(f1);
    empresaTeste.adicionar(f2);

    empresaTeste.exibeFuncionario();

    if (empresaTeste.contem(f3)) {
      System.out.println("Funcionario cadastrado.");
    } else {
      System.out.println("Funcionario NÃO cadastrado.");
    }
  }
}
