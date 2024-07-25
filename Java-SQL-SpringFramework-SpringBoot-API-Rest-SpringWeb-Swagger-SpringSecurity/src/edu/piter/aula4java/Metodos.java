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
/*
!       UTILIZINANDO O MÉTODO SOMAR NA CLASSE MAIN
*/
    Somar somar = new Somar();
    System.out.println(somar.somar(2, 3));
/*
!       UTILIZINANDO O MÉTODO IMPRIMIR NA CLASSE MAIN
*/
    Imprimir imprimir = new Imprimir();
    System.out.println(imprimir.imprimir("Teste de impressão!"));
/*
!       UTILIZINANDO O MÉTODO DIVIDIR NA CLASSE MAIN
*/
    Dividir dividir = new Dividir();  
    // Para utilizar um método com "Exception" deve-se utilizar a função "try, catch", para tratar as excessões
    try{
    System.out.println(dividir.dividir(10, 5));
    } catch (Exception e){
      System.out.println(e.getMessage());
    }
/*
!       UTILIZINANDO O MÉTODO VALIDAR NA CLASSE MAIN
*/
    Validar validar = new Validar();
    if (validar.validar("Piter", 123456)) {
      System.out.println("Logando!");
    } else {
      System.out.println("Usuário ou senha invalida!");
    }     
/*
!       UTILIZINANDO UM MÉTODO PRIVADO NA CLASSE MAIN
*/
    Metodos metodos = new Metodos(); 
    // Para chamar um método privado devemos criar outro método para acessar os dados do Método
    System.out.println(metodos.chamarMetodoPrivado());
/*
!       UTILIZINANDO UM MÉTODO DE INTÂNCIA NA CLASSE MAIN
*/    
    Instancia instancia = new Instancia("Método de Instâcia executado com sucesso!");
    instancia.printMessage(); 

    /*
!       UTILIZINANDO UM MÉTODO DE INTÂNCIA NA CLASSE MAIN
*/   
    Estatica.printMensagemEstatica();

  }
/*
! -----------------------------------------------------------------------------------------------------------

!       MÉTODO PRIVADO
*/  
  private void metodoPrivado(){
    System.out.println("Este método não pode ser visto por outras classes no porjeto!");
  }
/*
!       MÉTODO CRIADO PARA CHAMAR O MÉTODO PRIVADO
*/
  public String chamarMetodoPrivado(){ // Método criado para chamar o método privado em uma classe.
    metodoPrivado();
    return "Método privado chamado com sucesso.";
  }
}
/*
! -------------------------------------------------------------------------------------------------------------------------
*/
/*
!       MÉTODO SOMAR
 */
class Somar {
  public double somar(int n1, int n2){
      return n1 + n2;
    }
}
/*
?     1 - Assinatura do Método:

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "double": O método retorna um valor do tipo "double"(0.0).

    - "somar(int n1, int n2)": O método se chama "somar" e aceita dois parâmetros do tipo "int"(0).

?     2 - Corpo do Método:

    - "return n1 + n2": O método retorna a soma dos dois parâmetros fornecidos.

?     3 - Descrição da Funcionalidade:

    O método "somar" recebe dois números inteiros como parâmetros, calcula a soma desses números e retorna o 
  resultado como um valor do tipo "double". Apesar de os parâmetros serem do tipo "int", o resultado é retornado
  como "double" para garantir maior flexibilidade no uso do método, especialmente em contextos onde o resultado
  precisa ser tratado como um número de ponto flutuante.

?     4 - Utilizando o Método "somar" no Método "Main":

    Para executarmos o método "somar" no método "main", devemos inserir as seguintes linhas de código dentro do
  método "main":

    Somar somar = new Somar(); - Cria uma instância da classe "Somar".

    System.out.println(somar.somar(2, 3)); - Chama o método "somar" na isntância "somar", passando os valores "2" e
    "3" como argumentos. O resultado da soma(5.0) é então impresso no console.

!       RESUMO

    Esse exemplo simples demonstra como métodos podem ser utilizados para encapsular operações e como criar e usar
  instâncias de classes para chamar esses métodos.
*/
/*
!       MÉTODO IMPRIMIR
*/
class Imprimir{
  public String imprimir(String texto) {
    return texto;
  }
}
/*
!       MÉTODO DIVIDIR
*/
class Dividir {
  public double dividir(int dividendo, int divisor) throws Exception { 
    // Em métodos com Exception, deve-se utilizar a função "if, else", para tratar as excessões
    if (dividendo <= 0 || divisor <= 0) {
      throw new Exception("Nem o dividendo e nem o divisor podem ser iguais ou menores que 0");
    }
    return (double) dividendo / divisor;
  }
}
/*
!       MÉTODO VALIDAR
*/
class Validar{
  public boolean validar (String login, int senha){
  return "Piter".equals(login) && senha == 123456;
  }
}
/*
!       MÉTODO DE INSTÂNCIA
*/
class Instancia{
  private String message;

  public Instancia(String message){
    this.message = message;
  }
  public void printMessage(){
    System.out.println(message);
  }
}
/*
!       MÉTODO ESTÁTICOS
*/
class Estatica{
  public static void printMensagemEstatica(){
    System.out.println("Mensagem do método Estático!");
  }
}
/*
?     Funcionalidade e Características do método "static":

?    1 - Associação com a Classe e Não com a Instância:

    - Métodos "static" são associados à própria classe, e não a instâncias(objetos) dessa classe.
    Isso significa que eles podem ser chamados sem criar uma instância da classe.

    - Por exemplo, se temos um método "static" chamado "printMensagemEstatica" na classe "Estatica", podemos
    chamá-lo diretamente usando "Etatica.printMensagemEstatica();", sem necessidade de criar um objeto da classe
    "Estatica".

?     2 - Acesso a Membros Estáticos:

    - Métodos "static" só podem acessar outros membros (variáveis e métodos) "static" da mesma classe diretamente.
    Eles não podem acessar membros de instância (não estáticos) diretamente porque métodos "static" não tem referência
    a uma instância específica(o "this").

?     3 - Uso Comum:

    - Métodos "static" são frequentemente usados para definir funcionalidades que pertencem à classe como um todo,
    e não a uma instância específica. Exemplos comuns incluem métodos utilitários (por exemplo, métodos na classe
    "Math" como "Math.sqrt()") e métodos de fábrica (factory methods) que criam instâncias de objetos.

?     4 - Inicialização Estática:

    - Quando a classe é carregada pela primeira vez, seus métodos "static" e blocos de inicialização "static" são
    executados. Isso pode ser útil para inicializar recursos compartilhados ou configurar o estado da classe.

?     5 - Sobrescrita e Ocutação:

    - Métodos "static" não poderm ser sobrescritos no mesmo sentido que métodos de instância. Se uma subclasse define
    um método "static" com a mesma assinatura de um método "static" na superclasse, o método na subclasse oculta
    (mas não sobrescreve) o método da superclasse.

!       RESUMO

    - Métodos "static" são chamados pela classe e não por instâncias.

    - Eles não podem acessar membros de instância diretamente.

    - São úteis para funcionalidades que não dependem do estado de um objeto específico.

    - São executados quando a classe é carregada.

    - Não podem ser sobrescritos, mas podem ser ocultados em subclasses.
 */