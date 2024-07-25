package edu.piter.aula4java;

public class Metodos {
  public static void main(String[] args) {
/*
!                   MÉTODOS

?        Todas as ações das aplicações são consideradas métodos

      Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis
    de diferentes tipos e valores. Os métodos, por sua vez, correspondem a funções ou sub-rotinas disponíveis
    dentro de nossas classes.

?        Critério de Nomeação de Métodos

      Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam
    a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos
    o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

      - Deve ser nomeado como verbo;

      - Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

      Exemplos sugeridos para nomenclatura de métodos:
       
    somar(int n1, int n2){} // Método somar que recebe dois parâmetros.

    abrirConexão(){} // Método abrir conexão com a nomenclatura no padrão camel case e sem nenhum parâmetro.

    concluirProcessamento(){}

    findById(int id){} // Traduzindo o nome do método significa encontrar por ID. É muito comum encontrar nomenclaturas
    de métodos em inglês, ou até mesmo em outros idiomas.

    calcularImprimir(){} /* Há algo de errado com a nomenclatura desse método, ele deveria tr apenas uma finalidade,
    a de calcular, ou a de imprimir. Métodos com duas finalidades tendem a dar problemas no futuro.

!                 ATENÇÃO!
?   Não existe em Java o conceito de métodos globais. Todos os métodos devem SEMPRE ser definidos dentro de uma classe.

?       Critérios de Definição de Métodos

    Mas, como sabemos a melhor forma, de definir os métodos das nossas classes? Para chegar à essa conclusão, somos
  auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

    1 - Qual a proposta principal do método? Você deve se perguntar constantemente até compreender a real finalidade
    do mesmo.

    2 - Qual o tipo de retorno esperado após executar o método? Você deve analisar se o método será responsável
    por retornar algum valor ou não.
!   OBS: caso o método não retorne nenhum valor, ele será representado pela palavra-chave "void".

    3 - Quais parâmetros serão necessarios para a execução do método? Os métodos às vezes precisarão de argumentos
  como critérios para a execusão.

    4 - O método possui o risco de apresentar alguma exceção? Exceções são comuns na execução de métodos, sa vezes
  é necessário prever e tratar a possível existência de uma exceção.

    5 - Qual a visibilidade do método? Avaliar se será necessário que o método seja visível a toda aplicação,
  somente em pacotes, através de herança ou somente a nível a própria classe.

  Abaixo, temos um exemplos de uma classe com alguns métodos e suas respectivas considerações:
*/
    Somar somar = new Somar();
    System.out.println(somar.somar(2, 3));
  }  
}
class Somar {
  public double somar(int n1, int n2){
      return n1 + n2;
    }
}
