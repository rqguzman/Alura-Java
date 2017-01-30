public class Programa2 {

  public static void main(String[] args) {

    int idadeVisitante = 15;
    boolean amigoDoDono = true;

    // Usando a expresão booleana "ou" (||)
    if (idadeVisitante >= 18 || amigoDoDono) {
      System.out.println("Pode entrar.");
    }  else {
      System.out.println("Volte para casa!");
    }

    // Usando a expresão booleana "e" (&&)
    if (idadeVisitante >= 18 && amigoDoDono) {
      System.out.println("Pode entrar.");
    }  else {
      System.out.println("Volte para casa!");
    }

    // Encadeando if's: else if
    if (idadeVisitante > 60) {
      System.out.println("Aproveite a melhor idade!");
    }
    else if (idadeVisitante >= 18 && amigoDoDono) {
      System.out.println("Pode entrar.");
    }  else {
      System.out.println("Volte para casa!");
    }
  }
}
