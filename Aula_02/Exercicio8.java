class Exercicio8 {

  public static void main(String[] args) {

    int numero = 13;

    while (numero > 1) {

      if (numero > 1) {
        System.out.print(numero + " > ");
      }
      if (numero % 2 == 0) {
        numero = numero/2;
      } else {
        numero = (3 * numero) + 1;
      }
      if (numero == 1) {
        System.out.println(numero);
      }
    }


  }
}
