package edu.estruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class Aula02HierarquiaDasExcecoes {
/*
!          HIERARQUIA DAS EXCEÇÕES

    A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas
  em uma hierarquia denominadas "Checked and Unchecked Exceptions" ou Exceções Checadas e Não Checadas.

?     O que determina uma exceção ser classificado como checada ou não checada?
?     É o risco dela ser disparada logo você precisa tratá-la, exemplo:

    Vamos imaginar que precisamos realizar de duas maneiras a conversão String para um número, porém o texto 
  contém Alfanuméricos.
*/
  public static void main(String[] args) {
    Number valor = Double.valueOf("a1.75");

    try{
    valor = NumberFormat.getInstance().parse("a1.75");

    
    System.out.println(valor);
    } catch (ParseException e){
      e.printStackTrace();
    }
  }
}
/*
!           EXCEÇÕES CUSTOMIZADAS

    Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for
  utilizar os recursos desenvolvidos no projeto, exemplo:

    - Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário
    lançará uma exceção que denominamos de CepInvalidoException.

    - Primeiro criamos nossa exceção:

?    public class CepInvalidoException extends Exception {}

    - Em seguida criamos nosso método de formatação de cep.

public class FromatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23765064");
      System.out.println(cepFormatado);
      } catch (CepInvalidoException e) {
      System.out.println("O cep não corresponde com as regras de negócio");
      }
    }
    static String formatarCep (String cep) throws CepInvalidoException{
      if (cep.length() != 8) 
        throw new CepInvalidoException();

        // Simulando um cep formatado
        return "23.765-064";
  }
 }
*/