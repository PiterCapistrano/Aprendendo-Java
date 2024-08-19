package edu.estruturasCondicionais;

public class EstruturaCondicionalSwitchCase {
/*
!         SWITCH CASE

    A estrutura "switch" compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um 
  valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas
  após um caso correspondente ter sido encontrado, acrescentamos o comando "break" no final de cada bloco de códigos.
  O comando "break", quando executado, encerra a execução da estrutura onde ele se encontra.

    Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

  ?      Sigla                                Tamanho

          P                                   Pequeno
          M                                   Médio
          G                                   Grande
 */
}
//! FUNÇÃO COM IF/ELSE:
class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "M";

    if(sigla == "P"){
      System.out.println("PEQUENO");
    }else if (sigla == "M") {
      System.out.println("MÉDIO");
    }else if (sigla == "G") {
      System.out.println("GRANDE");
    } else
    System.out.println("Digite P, M ou G");
  }
}

//! FUNÇÃO COM SWITCH CASE:

class SistemaDeMedida {
  public static void main(String[] args) {
    String sigla = "A";

    switch (sigla) {
      case "P":{
        System.out.println("PEQUENO");
        break;
      }
       case "M":{
        System.out.println("MÉDIO");
        break;
       }
        case "G":{
          System.out.println("GRANDE");
          break;
        }
      default:{
        System.out.println("Digite P, M ou G");
      }
    }
  }
}

/*
!           CENÁRIO ONDE O SWITCH CASE É VIÁVEL DE SER IMPLEMENTADO:

    porém um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algorítimo seria conforme
  ilustrção abaixo:

?     Imagina que fomos requisitados a criar um sistema de plano telefonico onde:

    - O sistema terá 03 planos: BASIC, MIDIA, TURBO

    - BASIC: 100 minutos de ligação

    - MIDIA: 100 minutos de ligação + Whats e Instagram grátis
    
    - TURBO: 100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube
*/
//!         CENÁRIO COM IF/ELSE:
class PlanoTelefonicoIf {
    public static void main(String[] args) {
      String plano = "M"; // M / T

      if (plano == "B") {
          System.out.println("100 minutos de ligação");
      }else if (plano == "M") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whats e Instagram grátis");
      }else if (plano == "T") {
        System.out.println("100 minutos de ligação");
        System.out.println("Whats e Instagram grátis");
        System.out.println("5Gb Youtube");
      }else
      System.out.println("Selecione um plano válido: B, M ou T");
    }
  }

//!         CENÁRIO COM SWITCH/CASE:

class PlanoTelefonicoSwitch {
  public static void main(String[] args) {
    String plano = "M";

    switch (plano){
      case "T": {
        System.out.println("5Gb Youtube");
      }
      case "M": {
        System.out.println("Whats e Instagram grátis");
      }
      case "B": {
        System.out.println("100 minutos de ligação");
        break;
      }
      default:{
        System.out.println("Selecione um plano válido: B, M ou T");
      }
    }
  }
}