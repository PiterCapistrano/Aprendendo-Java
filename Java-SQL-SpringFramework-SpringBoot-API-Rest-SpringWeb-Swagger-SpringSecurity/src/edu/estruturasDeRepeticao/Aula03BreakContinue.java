package edu.estruturasDeRepeticao;

public class Aula03BreakContinue {
/*
!       BREAK E CONTINUE

    "Break" significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando
  pela frente. "Continue", como o nome diz, ele "continua" o laço. O comando "break" interrompe o laço, já o 
  "continue" interrompe somente a iteração atual.
*/

  public static void main(String[] args) {
    
    for(int numero = 1; numero <= 5; numero++) { // for para contagem de "1" até "5".
      if (numero == 3) {

        //break; // interrompe a contagem qundo ela for igual ao no número "3".
        
        continue; // imprime todos os números menos o numero "3", referente ao comando "if (numero == 3)".
      }
      System.out.println(numero); // saída com o comando "break" = "1" e "2".
                                  // saída com o comando "continue" = "1", "2", "4" e "5", pulando o número "3".
    }
  }
}
