package edu.estruturasCondicionais;

public class EstruturaCondicionalTernaria {
/*
!       CONDIÇÃO TERNÁRIA

    Como vimos em operadores, podemos abreviar nosso algorítmo condicional refatorando com o conceito de operador
  ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso:
*/

  public static void main(String[] args) {
    int nota = 7;

    String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

    System.out.println(resultado);
  }
}
