class Fatoriais2 {

  public static void main(String[] args) {

      long fatorial = 1L;

      for (int n = 1; n <=20 ; n++) {
        fatorial *= n;
        System.out.println("Fatorial de " + n + " é (" + (n-1) + "!) * " + n + " = " + fatorial + ".");
      }
  }
}
