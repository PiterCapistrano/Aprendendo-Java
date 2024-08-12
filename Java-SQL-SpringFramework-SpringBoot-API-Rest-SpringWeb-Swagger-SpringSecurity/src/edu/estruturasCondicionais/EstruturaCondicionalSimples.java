package edu.estruturasCondicionais;

public class EstruturaCondicionalSimples {
/*
!         ESTRUTURAS CONDICIONAIS

    A Estrutura Condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando
  determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.

!         CONDICIONAIS SIMPLES

    Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma
  estrutura Simples, exemplo:
 */
}
class CaixaEletronico {
  public static void main(String[] args) {
    
    double saldo = 25.0;
    double valorSolicidado = 17.0;

    if (valorSolicidado < saldo) { 
      saldo = saldo - valorSolicidado;

      System.out.println("Saldo = "+saldo);
    }
  }
}