public class BalancoTrimestral2 {

  public static void main(String[] args) {
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;

    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    double mediaMensal = (double) gastosTrimestre/3;

    System.out.println("Gastos trimestre: R$ " + gastosTrimestre);
    System.out.println("Valor da média mensal: R$ " + mediaMensal);
  }
}
