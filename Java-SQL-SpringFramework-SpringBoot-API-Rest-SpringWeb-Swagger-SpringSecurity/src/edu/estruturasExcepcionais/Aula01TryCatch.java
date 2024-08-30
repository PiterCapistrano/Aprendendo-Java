package edu.estruturasExcepcionais;

import java.util.Locale;
// A classe Scanner permite que digitemos inputs no terminal e utilizemos os dados digitados no nosso código.
import java.util.Scanner;

public class Aula01TryCatch {
/*
!         EXCEÇÕES

    Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, 
  erros devido a entrada errada ou outros imprevistos.

    Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java
  lançará uma "exceção" (jogará um erro).

    De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente.
  Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir
  um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e os
  demais não são erros mais sim fluxos não previstos pela aplicação.

    É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que
  denominamos de Tratamento de Exceções.

?      Mão na massa

    Vamos trazer o cenário que estudamos na aula sobre "Terminal e Argumentos" onde via terminal informamos alguns
  dados pessoais.
*/

  public static void main(String[] args) {
    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    // Imprimindo os dados obtidos pelo usuário
    System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
    System.out.println("Tenho " + idade + " anos!");
    System.out.println("Minha altura é " + altura + "cm");
    scanner.close();
  }
}
/*
    Aparentemente é um programa simples, mas vamos listar alguns possíveis exceções que podem acontecer.

    - Não informar o nome e/ou sobrenome.

    - O valor da idade ter um carctere NÃO numérico.

    - O valor da altura ter uma vírgula ou invês de ser um ponto (conforme padrão americano).

    Executando o nosso programa com os valores abaixo, vamos entender qual exceção acontecerá:

?     Entrada                        Valor                      Exceção                         Causa
    Digite seu nome:                 Piter 
    Digite seu sobrenome:         Capistrano
    Digite sua idade:          Trinta e dois (32)    java.util.InputMismatchExeption    
    Digite sua altura:               1,82            java.util.InputMismatchExeption
    
    
?     A melhor forma de prever que pode ocorrer uma exceção, é pensar que ela pode ocorrer.
        "Lei de Murphy"
        
?     Conhecendo algumas exceções já mapeadas

    A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as
  mais comuns:

?      Nome                                    Causa
    java.lang.NullPointerException        Quando tentamos obter alguma
                                        informação de uma variável nula.
    
    java.lang.ArithmeticException         Quando tentamos dividir um
                                        valor por zero.

    java.sql.SQLException                 Quando existe algum erro
                                        relacionado a interação com
                                        banco de dados.
                                        
    java.io.FileNotFoundException         Quando tentamos ler ou escrever
                                        em um arquivo que não exite.      
                                        
?     Tratamento de Exceções

    E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para
  amenizar o ocorrido?

  
 */