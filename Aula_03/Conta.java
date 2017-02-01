class Conta {
  // Dados de uma conta
  int numero;
  Pessoa titular;
  double saldo;
  int agencia;

  // Comportamentos
  void deposita(double valorASerDepositado){
    this.saldo += valorASerDepositado;
  }

  void saca(double valorASerSacado){
    if (this.saldo >= valorASerSacado) {
      this.saldo -= valorASerSacado;
    }
  }

  void transfere(double valor, Conta destino) {
    this.saldo -= valor;
    destino.saldo += valor;
  }
}

class Pessoa{
  String nome;
  //String dataNascimento;
  Data dataNascimento;
  String cpf;
  String rg;
}

class Programa {

  public static void main(String[] args) {
    Conta mauricio = new Conta();
    mauricio.numero = 123;
    mauricio.saldo = 800.00;
    mauricio.agencia = 842;
    mauricio.titular = new Pessoa();
    mauricio.titular.nome = "Maurício Aniche";
    mauricio.titular.cpf = "123456789";
    mauricio.titular.dataNascimento = new Data();
    mauricio.titular.dataNascimento.dia = 10;
    mauricio.titular.dataNascimento.dia = 10;
    mauricio.titular.dataNascimento.dia = 1975;
    System.out.println(mauricio.titular.nome);


    mauricio.deposita(100.0);
    mauricio.saca(5000.00);

    Conta guilherme = new Conta();
    guilherme.numero = 456;
    guilherme.saldo = 1200.00;
    guilherme.titular = new Pessoa();
    guilherme.titular.nome = "Guilherme Silva";
    guilherme.agencia = 842;

    guilherme.deposita(100.0);

    System.out.println(mauricio.saldo);
    System.out.println(guilherme.saldo);
  }
}
