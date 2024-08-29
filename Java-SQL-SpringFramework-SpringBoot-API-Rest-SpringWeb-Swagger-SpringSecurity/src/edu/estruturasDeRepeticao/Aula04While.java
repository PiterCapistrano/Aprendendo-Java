package edu.estruturasDeRepeticao;

// Importação da classe que gera numeros aleatórios
import java.util.concurrent.ThreadLocalRandom;

public class Aula04While {
/*
!         WHILE

    O laço "while" (na tradução literal para a língua portuguesa "enquanto") determina que enquanto uma condição
  for válida, o bloco de código será executado. O laço while testa a condição antes de executar o código, logo, caso
  a condição seja inválida no primeiro teste o bloco nem será executado.

    A estrutura de sintaxe do controle de repetição while é exibida abaixo:

?    while (expressão booleana de validação)
?    {
    
?        comando que será executado até que a expressão de validação terne-se falsa

?    }

!      Proposta de Exemplo:
  
    Joãozinho recebeu R$ 50,00  de mesada e foi em uma loja de doces gastar todo seu dinheiro, logo, enquanto
  o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carinho.
 */

 public static void main(String[] args) {
  double mesada = 50.0;

  while (mesada > 0) {
    double valorDoce = valorAleatorio();

    if (valorDoce > mesada) 
          valorDoce = mesada;

      System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
      mesada = mesada - valorDoce;
  }
  System.out.println("Mesada: " + mesada);
  System.out.println("Joãozinho gastou toda a sua mesada em doces");
 }
 /* Criação da função "valorAleatorio" que retorna um "double" e utiliza o recurso da importação acima da classe
"ThreadLocalRandom" para gerar um valor aleatório entre 2 e 8.
 */
  private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }
}
