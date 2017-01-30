public class Programa4 {

  public static void main(String[] args) {
    //Aninhando estruturas dentro de estruturas
    // 1. imprimindo apenas os números pares em uma sequência:

    int multiplicador = 3;

    for (int i = 0; i < 10; i++) {

      if (i % 2 == 0) {
        ////Para ilustrar o escopo de variável:
        //int numeroQualquer = 10;
          System.out.println( i * multiplicador);
          //System.out.println(numeroQualquer);
      }
      //System.out.println(numeroQualquer);
    }
  }
}
