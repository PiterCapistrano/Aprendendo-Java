package edu.estruturasDeRepeticao;

public class Aula02ForEmArrays {
/*
!       FOR EM ARRAYS

    Também usamos o controle de fluxo "for" para interagir sobre arrays e coleções:
*/
  public static void main(String[] args) {

/* Estrutura de array, que é um conjunto simbolizado pelo "[]", com alguns elementos, que devem ser descritos
dentro de chaves "{}" e separados por virgula, esses elementos são contabilizados apartir do número "0". Por
exemplo: elemento 0 = primeiro elemento dentro da chaves, elemento 1 = segundo elemento dentro das chaves e 
assim por diante.
*/ 
    String alunos[] = { "PITER", "FELIPE", "JONAS", "JULIA" };

// .length é usado para obter o tamanho ou a quantidade de elementos em diferentes tipos de estruturas de dados.
    for(int x = 0; x < alunos.length; x++) { 
      System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
    }
  }
}
/*
!       FOR EACH

    O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a
  interação é baseada aos elementos da coleção.
 */
class ForAbreviada {
  public static void main(String[] args) {
    
    String alunos[] = { "PITER", "FELIPE", "JONAS", "JULIA" };

   /* Forma abreviada: 
       O código abaixo utiliza uma forma simplificada do loop "for", chamada de "enhanced for loop" ou "for-each 
    loop".
       Nesse loop, declaramos o tipo de dado que está armazenado no array, que neste caso é uma "String".
       Em seguida, declaramos uma variável temporária "aluno", que representará cada elemento do array "alunos" 
    em cada iteração do loop. O uso dos dois pontos " : " indica que o loop percorrerá automaticamente todos os 
    elementos do array "alunos", atribuindo cada elemento à variável "aluno" em cada iteração.
       Assim, o loop executará o bloco de código, onde a variável "aluno" será atualizada para cada valor 
    presente no array "alunos".
    */
      for(String aluno : alunos) {
        System.out.println("Nome do aluno é = " + aluno);
      }
  }
}