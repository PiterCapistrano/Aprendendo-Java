package edu.estruturasDeRepeticao;

public class Aula01For {
/*
!         ESTRUTURA DE REPETIÇÃO

    Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem
  iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes. Através de laços de
  repetição é possível criar programas que percorram arrays, analisando individualmente cada elemento, e até mesmo
  criar trechos de código que sejam repetidos até que certa condição estabelecida seja cumprida.

    Perl possui basicamente quatro tipos de laços de repetição: "while"(enquanto), "do... while"(faça enquanto) 
  "for"(para) e "foreach"(para cada).

    O comando "for" (na tradução literal para a língua portuguesa "para") permite que uma variável contadora seja
  testada e incrementada a cada iteração, sendo essas informações definidas na chamada de comando. O comando "for"
  recebe como entrada uma variável contadora, a condição e o valor de incrementação.

    Uma outra forma de usarmos o laço "for" é declarando uma variável, seguida por dois valores da iteração 
  (primeiro e último) entre parênteses separados por dois pontos finais.

    A estrutura de sintaxe do controle de repetição "for" é exibida abaixo:

    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {
    
?        Comando que será executado até que a expressão de validação torne-se falsa

    }
 */
}
//  Exemplo prático: Vamos imaginar que o Joãozinho precisa contar até 20 carneirinhos para pegar no sono:

class ContadorCarneirinhos{
  public static void main(String[] args) {
    for(int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
      System.out.println(carneirinhos + " - Carneirinhos");
    }
  }
}