package edu.estruturasCondicionais;

public class EstruturaCondicionalComposta {
/*
!       CONDICIONAIS COMPOSTA

    Algumas vezes nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio,
  este cenário é denominado Estrutura Condicional Composta. Vejamos o exemplo abaixo:
 */
  public static void main(String[] args) {
  
  int nota = 6;

    if (nota >= 7) {
    System.out.println("Aprovado!");
    } else {
    System.out.println("Reprovado!");
    }
  }
}
