class Exercicio8 {

  public static void main(String[] args) {

      for (int x = 13; x > 1 ; x--) {

        if (x % 2 == 0) {
          x /= 2;
        } else {
          x = 3 * (x + 1);
        }

        System.out.print(x + " > ");
      }
  }
}
