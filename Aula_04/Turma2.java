class Turma2 {
  int[] notas;

  void imprimeNotas(){
    for (int i = 0; i < this.notas.lenght; i++ ) {
      System.out.println(this.notas[i]);
    }
  }

}

class TesteDaTurma2 {
  public static void main(String[] args) {
    Turma fj11 = new Turma();
    fj11.notas = new int[10];

    fj11.notas[0] = 9;
    fj11.notas[1] = 5;
    fj11.imprimeNotas();


  }
}
