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
