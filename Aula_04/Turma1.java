class Turma1 {
  int[] notas;

}

class TesteDaTurma1 {
  public static void main(String[] args) {
    Turma fj11 = new Turma();
    fj11.notas = new int[10];

    fj11.notas[0] = 9;
    fj11.notas[1] = 5;

    System.out.println(fj11.notas[0]);
  }
}
