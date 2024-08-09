package edu.aprendendoASintaxeJava.aula1java;
/*
!       EXERCICIO PRÁTICO:

    Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

    1 - Ela tenha as características: ligada (boolean), canal (int) e volume (int).

    2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada.

    3 - Nossa TV aumentará e diminuirá o volume sem em +1 ou -1.

    4 - Nossa TV poderá mudar de canal de 1 em 1 ou definido o número correspondente.
*/

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar(){
    ligada = true;
  }

  public void desligar(){
    ligada = false;
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para = " + volume);
  }

  public void diminuirVolume(){
     volume--;
     System.out.println("Diminuindo o volume para = " + volume);
  }

  public void aumentarCanal(){
    canal++;
    System.out.println("Aumentou o canal para = " + canal);
  }

  public void diminuirCanal(){
    canal--;
    System.out.println("Diminuiu o canal para = " + canal);
  }

  public void mudarDeCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Mudou o canal para = " + canal);
  }
} 