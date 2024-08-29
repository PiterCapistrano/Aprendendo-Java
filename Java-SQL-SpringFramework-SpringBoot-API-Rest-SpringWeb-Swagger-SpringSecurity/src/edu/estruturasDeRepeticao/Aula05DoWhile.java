package edu.estruturasDeRepeticao;

// Importação da classe que gera um número aleatório
import java.util.Random;

public class Aula05DoWhile {
/*
!       DO WHILE

    O laço "do / while" (na tradução literal para a língua portuguesa "faça enquanto"), assim como o laço "while",
  considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto,
  "do / while" testa a condição após executar o código, sendo assim, mesmo que a condição seja considerada inválida
  no primeiro teste o bloco será executado pelo menos uma vez. 

    A estrutura de sintaxe da estrutura de repetição "do / while" é exibida abaixo:

?    do {

?     comando que será executado até que a expressão de validação trone-se falsa

?    }
?    while (expressão booleana de validação);


!       Exemplo prático "do / while"

    Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer docinhos:
*/

  public static void main(String[] args) {
    System.out.println("Discando...");

    do {
      // executando repetidas vezes até alguém atender o telefone.
      System.out.println("Telefone tocando!");
    } while(tocando());

    System.out.println("Alô!!!");
  }
  private static boolean tocando(){
    boolean atendeu = new Random().nextInt(3) == 1;
     // se o número inteiro aleatório de 1 até 3 for igual a 1 significa que ele atendeu o telefone
    System.out.println("Atendeu? " + atendeu);
    //negando o ato de continuar tocando
    return ! atendeu;
  }
}
