class TesteFuncionario {

  public static void main(String[] args) {
    // Funcionario f1 = new Funcionario();
    //
    // f1.colaborador = new Pessoa();
    // f1.colaborador.nome = "Hugo";
    // f1.colaborador.dataNascimento = "02/05/1973";
    // f1.colaborador.rg = "12.345.678-9";
    // f1.departamento = "I.T.";
    // f1.salario = 100.0;
    // f1.dataAdmissao = "20/01/1993";
    // f1.recebeAumento(50.0);
    // f1.mostra();

    // EXERCICIO 4
    // Funcionario f1 = new Funcionario();
    // f1.colaborador = new Pessoa();
    // f1.colaborador.nome = "Danilo";
    // f1.salario = 100;
    //
    // Funcionario f2 = new Funcionario();
    // f2.colaborador = new Pessoa();
    // f2.colaborador.nome = "Danilo";
    // f2.salario = 100;
    //
    // if (f1 == f2) {
    //     System.out.println("iguais");
    // } else {
    //     System.out.println("diferentes");
    // }

    // EXERCICIO 5
    // Funcionario f1 = new Funcionario();
    // f1.colaborador = new Pessoa();
    // f1.colaborador.nome = "Danilo";
    // f1.salario = 100;
    //
    // Funcionario f2 = f1;
    //
    // if (f1 == f2) {
    //     System.out.println("iguais");
    // } else {
    //     System.out.println("diferentes");
    // }

    // // EXERCICIO 6
    // Funcionario f1 = new Funcionario();
    //
    // f1.colaborador = new Pessoa();
    // f1.colaborador.nome = "Hugo";
    // f1.colaborador.dataNascimento = new Data();
    // //f1.colaborador.dataNascimento.preencheData(2, 5, 1973);
    // f1.colaborador.rg = "12.345.678-9";
    // f1.departamento = "I.T.";
    // f1.salario = 100.0;
    // f1.dataAdmissao = new Data();
    // f1.dataAdmissao.preencheData(20, 1, 1993);
    // f1.recebeAumento(50.0);
    // f1.mostra();

    // EXERCICIO 8
    Funcionario f1;

    f1.colaborador = new Pessoa();
    f1.colaborador.nome = "Hugo";
    f1.colaborador.dataNascimento = new Data();
    //f1.colaborador.dataNascimento.preencheData(2, 5, 1973);
    f1.colaborador.rg = "12.345.678-9";
    f1.departamento = "I.T.";
    f1.salario = 100.0;
    f1.dataAdmissao = new Data();
    f1.dataAdmissao.preencheData(20, 1, 1993);
    f1.recebeAumento(50.0);
    f1.mostra();

  }
}
