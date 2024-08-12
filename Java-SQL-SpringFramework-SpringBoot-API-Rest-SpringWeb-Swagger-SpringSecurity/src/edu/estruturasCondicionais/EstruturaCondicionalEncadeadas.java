package edu.estruturasCondicionais;

public class EstruturaCondicionalEncadeadas {
/*
!       CONDICIONAIS ENCADEADAS

    EM um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão(else), podemos ter uma terceira,
  quarta e ou inúmeras condições.
 */

  public static void main(String[] args) {
    
    int nota = 6;

    if (nota >= 7) {
      System.out.println("Aprovado!");
    }if (nota >= 5 && nota < 7) {
      System.out.println("Recuperação!");
    } else {
      System.out.println("Reprovado!");
    }
  }
}
