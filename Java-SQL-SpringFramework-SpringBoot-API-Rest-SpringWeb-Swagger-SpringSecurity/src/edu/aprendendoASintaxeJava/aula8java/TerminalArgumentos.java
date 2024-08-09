package edu.piter.aula8java;

public class TerminalArgumentos {
/*
!         TERMINAL E ARGUMENTOS

?       Objetivo da Aula:

    Explorar opções de entrada e saída simples de dados em uma aplicação em Java.

?       Introdução;

    Nem sempre executamos nosso programa Java pela IDE, já pensou, nossos clientes tendo que instalar o Eclipse
  ou VsCode para rodar o sistema em sua empresa?

    Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o 
  instalador para qualquer sistema operacional.

    No nosso caso, iremos aprender como executar um programa Java via terminal, como MS - DOS ou terminal do 
  VsCode.

    Vamos criar uma classe chamada MinhaClasse.java com o código abaixo:

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    }
}

    Observe que nosso projeto Java criado por uma IDE, terá uma pasta chamada bin. É nesta pasta que ficarão os
  arquivos .class, o nosso bytecode.

    Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no
  meu caso está em: C:\estudos\dio-trilha-java-basico\java-terminal.

?       Terminal:

    Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

    1 - Abra o MS-DOS ou Power Shell;

    2 - Localize o diretódio do seu projeto, como no exemplo abaixo:
            cd C:\estudos\dio-trilha-java-basico\java-terminal ;
    
    3 - Acesse a pasta **** bin. ** cd bin ** ;

    4 - Agora digite o comando. ** java MinhaClasse **(nome da sua classe sem a extensão .class).

?       Argumentos:

    Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] de argumentos,
  do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:

        java MinhaClasse agumentoUm argumentoDois

    Exemplo:

public class AboutMe {
    public static void main(String[] args) {
        * Os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); // Vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");
    }
}

    Passando valores aos argumentos pelo VsCode:

    1 - No VsCode clicar em "Executar" ou "Run";

    2 - Depois clicar em "Adicionar Configuração..." ou "Add Configuration...";

    3 - No arquivo criado "launch.json", encontrar a configuração do arquivo "AboutMe.java";

    4 - Adicionar a linha ("args": ["nome", "sobrenome", "idade", "altura"]), abaixo da linha ("mainClass": "AboutMe",);

    5 - Após isso executar o arquivo "AboutMe.java", para ver o registro dos argumentos serem impressos.
    
    Executando o programa agora no terminal:

        cd C:\estudos\dio-trilha-java-basico\java-terminal
        cd bin

        java AboutMe nome sobrenome idade altura

?       Scanner:

    Nos exemplos anteriores, percebemos que podemos receber, dados digitados pelo usuário do nosso sistema, porém,
  tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta
  abordagem pode deixar margens de execução, com erro do nosso programa. Para issa, com a finalidade de deixar as
  nossas entradas de dados mais seguras, agora vamos receber estes dados via Scanner.

    A classe Scanner, permite que o usuário tenha, uma interação mais assertiva com o nosso programa, veja como
  vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usários:

import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
*/ 
}
