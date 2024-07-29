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
      System.out.println("Usuário ou senha inválida!");
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
!       UTILIZINANDO UM MÉTODO DE ESTÁTICO NA CLASSE MAIN
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
?     1 - Assinatura do Método "metodoPrivado":

    - "private": O método é privado, o que significa que só pode ser acessado dentro da própria classe "Metodos".

    - "void": O método não retorna nenhum valor.

    - "metodoPrivado()": O método não aceita nenhum parâmetro.

?     2 - Corpo do Método "metodoPrivado":

    - "System.out.println("Este método não pode ser visto por outras classes no projeto!");": Imprime a mensagem
  no console.

?     3 - Descrição da Funcionalidade do Método "metodoPrivado":

    O método "metodoPrivado" imprime uma mensagem no console. Como é um método privado, ele não pode ser chamado 
  diretamente de fora da classe "Metodos".
  
?     4 - Assinatura do Método "chamarMetodoPrivado":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "String": O método retorna um valor do tipo "String".

    - "chamarMetodoPrivado()": O método não aceita nenhum parâmetro.

?     5 - Corpo do Método "chamarMetodoPrivado":

    - "metodoPRivado();": Chama o método privado "metodoPrivado" dentro da própria classe.

    - "return "Método privado chamado com sucesso.";": Retorna uma string indicando que o método privado foi
  chamado com sucesso.
  
?     6 - Descrição de Funcionalidade do Método "chamarMetodoPrivado":

    O método "chamarMetodoPrivado" chama o método "metodoPrivado" e depois retorna uma mensagem indicando que o
  método privado foi chamado com sucesso. Este método permite que o "metodoPrivado" seja acessado indiretamente
  de fora da classe "Metodos".

?     7 - Corpo do Método "main"

    - "Metodos metodos = new Metodos();": Cria uma nova instância da classe "Metodos".

    - "System.out.println(metodos.chamarMetodoPrivado());": Chama o método "chamarMetodoPrivado" na isntância
  "métodos" e imprime a string retornada no console.

?     8 - Descrição da Funcionalidade do Método "main":

    - Cria uma nova instância da classe "Metodos".

    - Usa essa instância para chamar o método "chamarMetodoPrivado", que por sua vez chama o método "metodoPrivado".

    - Imprime a mensagem retornada pelo método "chamarMetodoPrivado" no console, indicando que o método privado foi
  chamado com sucesso.

?     9 - Resumo e Conclusão

    - Método "metodoPrivado": Um método privado que imprime uma mensagem no console. Ele não pode ser chamado 
  diretamente de fora da classe "Métodos".
     Atributos privados são uma prática essencial em programação orientada a objetos para garantir a integridade 
  e segurança dos dados, promover o encapsulamento e facilitar a manutenção do código. Eles permitem que os 
  desenvolvedores controlem como os dados são acessados e modificados através de métodos públicos, garantindo 
  uma interface consistente e segura para a classe.

    - Método "chamarMetodoPrivado": Um método público que chama o método "metodoPrivado" e retorna uma mensagem
  indicando que o método privado foi chamado com sucesso. Ele permite que o método privado seja acessado indiretamente.

    - Método "main": Cria uma instância da classe "Metodos", chama o método "chamarMetodoPrivado" e imprime a mensagem
  retornada, demonstrando como acessar um método privado indiretamente.

    Este exemplo ilustra a utilização de métodos públicos para acessar métodos privados, garantindo a encapsulação
  e proteção dos dados e funcionalidades internas da classe.

! -------------------------------------------------------------------------------------------------------------------------

!       MÉTODO SOMAR
 */
class Somar {
  public double somar(int n1, int n2){
      return n1 + n2;
    }
}
/*
?     1 - Assinatura do Método "somar":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "double": O método retorna um valor do tipo "double"(0.0).

    - "somar(int n1, int n2)": O método se chama "somar" e aceita dois parâmetros do tipo "int"(0).

?     2 - Corpo do Método "somar":

    - "return n1 + n2": O método retorna a soma dos dois parâmetros fornecidos.

?     3 - Descrição da Funcionalidade do Método "somar":

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

?     5 - Resumo e Conclusão

    Esse exemplo simples demonstra como métodos podem ser utilizados para encapsular operações e como criar e usar
  instâncias de classes para chamar esses métodos.

!       MÉTODO IMPRIMIR
*/
class Imprimir{
  public String imprimir(String texto) {
    return texto;
  }
}
/*
?     1 - Assinatura do Método "imprimir":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "String": O método retorna um valor do tipo "String"(" ").

    - "somar(String texto)": O método se chama "imprimir" e aceita dois parâmetros do tipo "String"(" ").

?     2 - Corpo do Método "imprimir":

    - "return texto;": O método retorna o parâmetro fornecido.

?     3 - Descrição da Funcionalidade do Método "imprimir":

    - Cria uma nova instancia da classe "imprimir" com a linha de código: "Imprimir imprimir = new Imprimir();"

    - Usa essa instância para chamar o método "imprimier", passando a string "Teste de impressão!" como argumento:
    System.out.println(imprimir.imprimir("Teste de impressão!"));
    
    - Imprime o resultado da chamada ao método "imprimir" no console.

?     4 - Resumo e Conclusão:

    - Método "imprimir": Rece uma string como parâmetro e retorna a mesma string.

    - No Método "main" : Cria uma instância da classe "Imprimir", utiliza essa instância para chamar o método
    "imprimir" com a string "Teste de impressão!", e imprime o resultado no console.

    Esse exemplo simples demonstra como métodos podem ser utilizados para retornar valores e como criar e usar
    instâncias de classes para chamar esses métodos.

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
?     1 - Assinatura do Método "dividir":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "double": O método retorna um valor do tipo "doublo".

    - "dividir(int dividendo, int divisor)": O método se chama "dividir" e aceita dois parâmetros do tipo "int".

    - "throws Exception": O método pode lançar uma exceção do tipo "Exception".

?     2 - Corpo do Método "dividir":

?        Tratamento de Exceções:

    - "if (dividendo <= 0 || divisor <= 0)": Verifica se o dividendo ou o divisor são menores ou iguais a zero.

    - "throw new Exception("Nem o dividendo e nem o divisor podem ser iguais ou menores que 0");": Se a condição 
    for verdadeira, uma exceção é lançada com a mensagem apropriada.

?        Cálculo da Divisão:

    - "return (double) dividendo / divisor;": Se nenhuma exceção for lançada, o método retorna o resultado da 
    divisão dos dois parâmetros como um valor do tipo "double".

?     3 - Descrição de Funcionalidade do Método "dividir":

    O método "dividir" realiza a divisão de dois números inteiros ("dividendo" e "divisor") e retorna o resultado
  como um "double". Antes de realizar a divisão, ele verifica se algum dos parâmetros é menor ou igual a zero e,
  caso seja, lança uma exceção com uma mensagem de erro.

?     4 - Corpo do Método "main":

    - "Dividir dividir = new Dividir();": Cria uma instância da classe "Dividir".

?       Bloco "try-catch":

    - "try": Envolve a chamada ao método "dividir" em bloco "try" para capturar possíveis exceções.

    - "System.out.println(dividir.dividir(10, 5));": Chama o método "dividir" na instância "dividir", passando os
    valores "10" e "5" como argumentos. O resultado da divisão(2) é impresso no console.

    - "catch (Exception e)": Captura qualquer exceção lançada pelo método "dividir".

    - "System.out.println(e.getMessage());": Imprime a mensagem da exceção, descrita na linha de código
    "throw new Exception("Nem o dividendo e nem o divisor podem ser iguais ou menores que 0");" no console.

?     5 - Descrição de Funcionalidade na Classe "Main":

    - Cria através da linha de código "Dividir dividir = new Dividir();", uma nova instância da classe "Dividir".

    - Usa essa instância para chamar o método "dividir" dentro de um bloco "try-catch" para capturar e tratar exceções.

    - Se a divisão for bem-sucedida, imprime o resultado da divisão no console.
    
    - Se uma exceção for lançada, captura a exceção e imprime a menssagem de erro no console.

?     6 - Resumo e Conclusão:

    - Método "dividir": Calcula e retorna a divisão de dois inteiros como um "double". Lança uma exceção se qualquer
    um dos parâmetros for menor ou igual a zero.

    - Método "main": Cria uma instância da classe "Dividir", utiliza essa instância para chamar o método "dividir"
    com tratamento de exceções, e imprime o resultado ou a mensagem de erro no console.

    Este exemplo demonstra como utilizar o tratamento de exceções em métodos que podem lançar exceções e como chamar
  tais métodos de forma segura usando blocos "try-catch".

!       MÉTODO VALIDAR
*/
class Validar{
  public boolean validar (String login, int senha){
  return "Piter".equals(login) && senha == 123456;
  }
}
/*
?     1 - Assinatura do Método "validar":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "boolean": O método retorna um valor do tipo "boolean"(true ou false).

    - "validar(String login, int senha)": O método se chama "validar" e aceita dois parâmetros: um "String"("login")
    e um "int"("senha").

?     2 - Corpo do Método "validar":

    - "return "Piter".equals(login) && senha == 123456;": O método verifica se o valor de "login" é igual a "Piter"
    e se a "senha" é igual a "123456". Se ambas as condições forem verdadeiras, o método retorna "true"; caso contrário,
    "false".

?     3 - Descrição da Funcionalidade do Método "validar":

    O método "validar" realiza uma verificação simples de autentificação. Ele compara o valor do parâmetro "login"
  com a string "Piter" e o valor do parâmetro "senha" com o número "123456". Se ambas as comparações forem verdadeiras,
  o método retorna "true", indicando que a autenticação foi bem-sucedida; caso contrário, retorna "false".

?     4 - Corpo do Método "main":

    - "Validar validar = new Validar();": Cria uma instância da classe "Validar".

    - "if (validar.validar("Piter", 123456))": Chama o método "validar" na instância "validar", passando os valores
  "Piter" e "123456" como argumentos. Se o método retorna "true", executa o bloco de código dentro do "if".

    - "System.out.println("Logando!");": Imprime a mensagem "Logando!" no console se a autenticação for bem-sucedida.

    - "else": Se o método "validar" retorna "false", executa o bloco de código dentro do "else".

    - "System.out.println("Usuário ou senha inválida!");": Imprime a mensagem "Usuário ou senha inválida!" no console
  se a autenticação falhar.

?     5 - Descrição da Funcionalidade do Método "main":

    - Cria através da linha de código "Validar validar = new Validar();", uma nova instância da classe "Validar".
    
    - Usa essa instância para chamar o método "validar", passando os valores "Piter" e "123456" como argumentos.

    - Se o método "validar" retornar "true", imprime a mensagem "Logando!" no console.

    - Se o método "validar" retornar "false", imprime a mensagem "Usuário ou senha inválida!" no console.

?     6 - Resumo e Conclusão:

    - Método "validar": Verifica se o login e a senha fornecidos correspondem aos valores "Piter" e "123456", 
  respectivamente. Retorna "true" se ambos os valores forem corretos; caso contrário, retorna "false".

    - Método "main": Cria uma instância da classe "Validar", utiliza essa instância para chamar o método "validar"
  com os valores "Piter" e "123456", e imprime uma mensagem no console com base no resultado da verificação.

    Este exemplo demonstra como utilizar um método de verificação simples para autentificação e como utilizar o
  resultado dessa verificação para imprimir mensagens apropriadas no console.

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
?      1 - Atributo "message":

    - "private String message;": Um atributo privado que armazena a mensagem a ser impressa. Ele só pode ser
  acessado e modificado por métodos dentro da classe "Instancia".
    Atributos privados são uma prática essencial em programação orientada a objetos para garantir a integridade 
  e segurança dos dados, promover o encapsulamento e facilitar a manutenção do código. Eles permitem que os 
  desenvolvedores controlem como os dados são acessados e modificados através de métodos públicos, garantindo 
  uma interface consistente e segura para a classe.

?     2 - Construtor "Instancia":

    - "public Instancia(String message)": Um construtor que aceita uma string como parâmetro e inicializa o atributo
  "message" com esse valor.

    - "this.message = message;": Atribui o valor do parâmetro "message" ao atributo "message" da instância.

?     3 - Método "printMessage":

    - "public void printMessage()": Um método público que não retorna nenhum valor ("void").

    - "System.out.println(message);": Imprime o valor do atributo "message" no console.

?     4 - Descrição da Funcionalidade da Classe "Instancia":

    A classe "Instancia" possui um atributo "message" para armazenar uma mensagem, um construtor para inicializar
  esse atributo, e um método "printMessage" para imprimir a mensagem no console.

?     5 - Corpo do Método "main":

    - "Instanci instancia = new Instancia("Método de Instância executado com sucesso!");": Cria uma nova instância
  da classe "Instancia", passando a string "Método de Instância executado com sucesso!" como argumento para o construtor.
  Isso inicializa o atributo "message" da instância com esse valor.

    - "instanci.printMessage();": Chama o método "printMessage" na instância "instancia", que imprime o valor do 
  atributo "message" no console.

?     6 - Descrição da Funcionalidade da Classe "Main":

    - Cria uma nova instância da classe "Instância", inicializando o atributo "message" com a string "Método de
  Instância executado com sucesso!".

    - Usa essa instância para chamar o método "printMessage", que imprime a mensagem "Método de Instância executado
  com sucesso!" no console.

?     7 - Resumo e Conclusão:

    - Método "printMessage": Imprime o valor do atributo "message" no console.

    - Método "main": Cria uma instância da classe "Instancia" com uma mensagem especifica, e chama o método 
  "printMessage" dessa instância para imprimir a mensagem no console.
  
    Este exemplo demonstra como utilizar um construtor para inicializar atributos de uma classe e como métodos de
  instância podem ser utilizados para realizar ações com esses atributos.

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

?     6 - Resumo e Conclusão:

    - Métodos "static" são chamados pela classe e não por instâncias.

    - Eles não podem acessar membros de instância diretamente.

    - São úteis para funcionalidades que não dependem do estado de um objeto específico.

    - São executados quando a classe é carregada.

    - Não podem ser sobrescritos, mas podem ser ocultados em subclasses.
 */