public class Programa {

  public static void main(String[] args) {

    // TIPO inteiro
    int idadeJoao = 18;
    int idadeMaria = 21;

    int somaDasIdades = idadeJoao + idadeMaria;

    System.out.println(somaDasIdades);

    // TIPO double
    double pi = 3.1415;
    double dobroDoPi = pi * 2;
    System.out.println(dobroDoPi);

    // TIPO boolean
    boolean amigo = true;
    boolean inimigo = false;
    boolean traira = !amigo;//! representa a negação de amigo

    boolean maiorDeIdade = idadeJoao >= 18;

    // TIPO char
    char letra = 'M';

    // TIPO String
    String nomeCompleto = "João da Silva";

    System.out.println(nomeCompleto);

    // TIPO long
    long numeroGrande = 99999999999L;

    // TIPO float
    float outroPi = 3.14F;

    // Conversões entre tipos
    // 1. int para long.
    int numero = 10;
    long copiaDeNumero = numero;

    // 2. long para int.
    long outroNumeroGrande = 999999999998L;
    int numeroPequeno = (int) outroNumeroGrande;
    System.out.println(numeroPequeno);

    // 3. double para float.
    double grande = 10.8;
    float copiaGrande = (float) grande;
    System.out.println(copiaGrande);

  }
}
