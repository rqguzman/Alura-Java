class Turma3 {
  Aluno3[] alunos;

  void imprimeNotas(){
    for (int i = 0; i < this.alunos.length; i++ ) {
      Aluno3 aluno = this.alunos[i];
      if (aluno == null) {
        continue;
      }
      System.out.println(aluno.nota);
    }
  }
}

class Aluno3{
  String nome;
  int nota;
}

class TesteDaTurma3 {
  public static void main(String[] args) {
    Turma3 fj11 = new Turma3();
    fj11.alunos = new Aluno3[10];

    fj11.alunos[0] = new Aluno3();
    fj11.alunos[0].nome = "Maurício";
    fj11.alunos[0].nota = 9;

    fj11.alunos[1] = new Aluno3();
    fj11.alunos[1].nome = "Marcelo";
    fj11.alunos[1].nota = 5;

    fj11.imprimeNotas();


  }
}
