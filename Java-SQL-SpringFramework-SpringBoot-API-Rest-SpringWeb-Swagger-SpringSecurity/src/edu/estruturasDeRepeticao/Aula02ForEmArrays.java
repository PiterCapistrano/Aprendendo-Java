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
