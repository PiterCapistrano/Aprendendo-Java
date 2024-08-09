package edu.aprendendoASintaxeJava.aula5java;

public class Escopo {
/*
!         ESCOPO DE CÓDIGO

?     Objetivo:

    Identificar a localização mais conveniente para a escrita de algoritmos necessário para o nosso programa. Então
  é através desse conceito de escopo que conseguimos ter uma melhor, ou mais adequada estrutura das nossas implementações.

!         ESCOPO

    O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis
  vai de acordo com o bloco onde ela foi declarada.

    A variável é criada no primeiro acesso à ela, se tornando inacessível apóso o interpretador sair do bloco de
  execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos
  que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

    Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo
  principal da Classe, sendo portanto acessíveis por todos os métodos.

    Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo
  desse método, ou seja, dentro das chaves que limitam o método.

    Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em
  questão. Sem um domínio sobre escopo de códigos seu projeto tende a conter falhas estruturais e comprometer a
  proposta principal da aplicação.
*/
}
class Conta {
  double saldo = 10.0; // Variável da classe Conta

  public double sacar (Double valor) {
  double novoSaldo = saldo - valor; // Variável local do método
  return novoSaldo;
  }
  public void imprimirSaldo(){

  System.out.println(saldo); // Disponível em toda classe

 // System.out.println(novoSaldo); - Somente o método sacar conhece esta variável "novoSaldo"

  }

  public double calcularDividaExponencial() {
    // Variáveis locais do método
    double valorParcela = 50.0;
    double valorMontante = 0.0; // Começando a variável

    for(int x = 1; x <= 5; x++) { // x variácel de escopo de método
      // Esta variável será reiniciada a cada execução do projeto
      double valorCalculado = valorParcela + x;
      valorMontante = valorMontante + valorCalculado;
    }
    // Escopo de fluxo
    // X e valorCalculado nunca estarão disponíveis fora do bloco "for".
    return valorMontante;
  }
  public static void main(String[] args) {
  
    Conta conta = new Conta();

    System.out.println(conta.calcularDividaExponencial()); // Saída = 265.0
    System.out.println(conta.sacar(2.5)); // Saída = 7.5
  }
}