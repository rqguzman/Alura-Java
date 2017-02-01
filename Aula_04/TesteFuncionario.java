class TesteFuncionario {

  public static void main(String[] args) {

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
    f1.recebeAumento(50.0);
    f1.mostra();

    Empresa empresaTeste = new Empresa();
    empresaTeste.nomeEmpresa = "Empresa Teste Ltda";
    empresaTeste.cnpj = "123.456.789/0001-10";
    empresaTeste.funcionarios = new Funcionario[10];
    empresaTeste.adicionar(f1);
    empresaTeste.exibeFuncionario();

  }
}
