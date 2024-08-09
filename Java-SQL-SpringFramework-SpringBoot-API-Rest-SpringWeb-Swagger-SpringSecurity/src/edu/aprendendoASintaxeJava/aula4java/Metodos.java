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

!       MÉTODOS ABSTRATOS
 */
abstract class Animal {
  abstract void animal();
}

class Dog extends Animal {
  void animal() {
    System.out.println("Bark");
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.animal(); // Saída: Bark
  }
}
/*
?     1 - Classe Abstrata "Animal":

    - "abstract class Animal": A classe "Animal" é declarada como abstrata. Uma classe abstrata não pode ser
  instanciada diretamente; ela serve como uma classe base para outras classes.

    - "abstract void animal()": O método "animal", é declarado como abstrato. Isso significa que ele não
  possui uma implementação na classe "Animal" e deve ser implementado por qualquer classe concreta que estenda 
  "Animal".

?     2 - Descrição da Funcionalidade da Classe "Animal":

    A classe "Animal" define um método abstrato "animal", que deve ser implementado por qualquer classe que
  estenda "Animal". Isso estabelece um contrato que todas as subclasse de "Animal" devem seguir, garantindo que
  cada uma delas forneça uma implementação especifica do método "animal".

?     3 - Classe "Dog":

    - "class Dog extends Animal": A classe "Dog" estende a classe abstrata "Animal", o que significa que "Dog"
  herda as propriedades e métodos abstratos definidos em "Animal".

?     4 - Método "animal":

    - "void animal()": Este método é a implementação concreta do método abstrato "animal" definido na classe
  "Animal".

    - "System.out.println("Bark");": Quando chamado, o método imprime "Bark" no console.

?     5 - Método "main":

    - "public static void main(String[] args)": O ponto de entrada do programa.

    - "Dog dog = new Dog();": Cria uma nova instância da classe "Dog".

    - "dog.animal();": Chama o método "animal" na instância "dog", o que resulta na impressão de "Bark" no
  console.

?     6 - Descrição da Funcionalidade da Classe "Dog":

    A classe "Dog" implementa o método abstrato "animal" da classe "Animal". A implementação de "animal" em
  "Dog" imprime "Bark" no console, fornecendo a especificação concreta do som que um cão faz.

?     7 - Resumo e Conclusão:

    - Classe Abstrata "Animal": Define um método abstrato "animal" que deve ser implementado por qualquer classe
  concreta que estenda "Animal".

    - Classe Concreta "Dog": Estende "Animal" e fornece uma implementação concreta para o método "animal", que
  imprime "Bark" no console.

    - Método "main": Cria uma instância de "Dog" e chama "animal", demonstrando a implementação específica de
  "Dog" para o método abstrato "animal".

    Este exemplo ilustra o conceito de herança e polimorfismo na programação orientada a objetos. A classe abstrata
  "Animal" estabelece um contrato para suas subclasses através do método abstrato "animal". A classe "Dog" implementa
  esse contrato fornecendo sua própria versão de "animal", permitindo que diferentes subclasses de "Animal"
  forneçam implementações específicas para suas necessidades.

!       MÉTODOS FINAL  
*/  
class FinalMethods {
  public final void printMessage() {
    System.out.println("Mensagem Final!");
  }

  public static void main(String[] args) {
    FinalMethods finalMethods = new FinalMethods();
    finalMethods.printMessage(); // Saída: Mensagem Final!
  }
}
/*
?     1 - Assinatura do Método "printMessage":

    - "public": O método é público, o que significa que pode ser acessado de outras classes.

    - "final": O modificador "final" indica que este método não pode ser sobrescrito por subclasses. Ou seja,
  se uma classe herdar "FinalMethods", ela não poderá fornecer sua própria implementação para o método "printMessage".

    - "void": O método não retorna nenhum valor.

    - "printMessage()": O método não aceita nenhum parâmetro.

?     2 - Corpo do Método "printMessage":

    - "System.out.println("Mensagem Final!");": Imprime a mensagem "Mensagem Final!" no console.

?     3 - Descrição da Funcionalidade do Método "printMessage":

    O método "printMessage" na classe "FinalMethods" é declarado como "final", o que significa que ele não pode
  ser sobrescrito por subclasses. Ele imprime a mensagem "Mensagem Final!" no console quendo chamado.

?     4 - Assinatura do Método "main":

    - "public static void main(String[] args)": Este é o ponto de entrada do programa Java.
    O método "main" é necessário para que a JVM( Java Virtual Machine ) possa executar o programa.

?     5 - Corpo do Método "main":

    - "FinalMethods finalMEthods = new FinalMethods();": Cria uma nova instância da classe "FinalMethods".

    - "finalMethods.printMessage();": Chama o método "printMessage" na instância "finalMethods", o que resulta na 
  impressão de "Mensagem Final!" no console.

?     6 - Descrição da Funcionalidade do Método "main":

    - Cria uma nova instância da classe "FinalMethods".

    - Usa essa instância para chamar o método "printMessage", que imprime "Mensagem Final!" no console.

?     7 - Resumo e Conclusão:

?       Método "printMessage":

    - É um métdo público e final que imprime "Mensagem Final!" no console.

    - O modificador "final" impede que o método seja sobrescrito por subclasses.

?       Método "main":

    - Cria uma instância de "FinalMethods".

    - Chama o método "printMessage" dessa instância para demonstrar sua funcionalidade, resultando na impressão
  mensagem no console.

    O exemplo demonstra o uso do modificador "final" em métodos, que impede que o método seja sobrescrito em subclasses.
  Isso é útil quando você quer garantir que a implementação de um método permaneça a mesma em todas as subclasses
  e não possar ser alterada. O método "main" mostra como instanciar a classe "FinalMethods" e chamar seu método
  "printMessage" para exibir a mensagem final no console.

!       MÉTODOS SÍNCRONOS
*/
class Sincronos {
  private int count = 0;

  public synchronized void increment(){
    count++;
  }
  public int getCount() {
    return count;
  }

  public static void main(String[] args) {
    Sincronos sincronos = new Sincronos();
    sincronos.increment();
    System.out.println(sincronos.getCount()); // Saída: 1
  }
}
/*
?     1 - Assinatura do Método "increment":

    - "public synchronized void increment()": O método é público e "synchronized", o que significa que apenas 
  um thread pode executar este método por vez.

    - "void": O método não retorna nenhum valor.

?     2 - Corpo do Método "increment":

    - "count++;": Incrementa o valor do atributo "count" em 1.

?     3 - Descição de Funcionalidade do Método "increment":

    O método "increment" aumenta o valor do atributo "count" em 1. O modificador "synchronized" garante que o método
  só possa ser executado por um thread de cada vez, evitando problemas de concorrência em um ambiente multithread.

?     4 - Assinatura do Método "getCount":

    - "public int getCount()": O método é público e retorna um valor do tipo "int".

?     5 - Corpo do Método "getCount":

    - "return count;": Retorna o valor atual do atributo "count".

?     6 - Descrição da Funcionalidade do Método "getCount":

    O método "getCount" retorna o valor atual do atributo "count", permitindo que outros métodos ou classes acessem
  o valor de "count".

?     7 - Assinatura do Método "main":

    - "public static void main(String[] args)": Este é o ponto de entrada do programa Java. O método "main" é 
  necessário para que a JVM ( Java Virtual Machine ) possa executar o programa.

?     8 - Corpo do Método "main":

    - "Sincronos sincronos = new Sincronos();": Cria uma nova instância da classe "Sincronos".

    - "sincronos.increment();": Chama o método "increment" na instância "sincronos", incrementando o valor de 
  "count" em 1.

    - "System.out.println(sincronos.getCount());": Chama o método "getCount" na instância "sincronos" e imprime o
  valor retornando no console, que será 1.

?     9 - Descrição da Funcionalidade do Método "main":

    - Cria uma instância da classe "Sincronos".

    - Chama o método "increment" para aumentar o valor de "count" em 1.

    - Chama o método "getCount" para obter o valor atual de "count" e imprime esse valor no console, resultando
  na saída "1".

?     10 - Resumo e Conclusão:

?       Método "increment":

    - É um método público e "synchronized" que incrementa o valor do atributo "count" em 1.

    - O modificador "synchronized" garante que apenas um thread possa executar o método por vez, prevenindo 
  problemas de concorrência.

?       Método "getCount":

    - É um método público que retorna o valor atual do atributo "count".

?       Método "main":

    - Cria uma instância da classe "Sincronos".

    - Chama o método "increment" para incrementar o valor de "count".

    - Chama o método "getCount" para obter e imprimir o valor de "count", mostrando que ele foi incrementado 
  corretamente.

    A classe "Sincronos" demonstra o uso de métodos sincronizados para garantir a segurança em um ambiente multithread.
  O método "increment" incrementa o contador de forma segura, e o método "getCount" permite acessar o valor atual
  do contador. O método "main" mostra como usar esses métodos para manipular e acessar o valor do contador.

!       MÉTODOS CONSTRUTORES
*/

class Constructor {
  private String message;

  public Constructor(String message) {
    this.message = message;
  }

  public void printMessageConstructor(){
    System.out.println(message);
  }

  public static void main(String[] args) {
    Constructor constructor = new Constructor("Mensagem do Método Construtor!");
    constructor.printMessageConstructor(); // Saída: Mensagem do Método Construtor!
  }
}
/*
?     1 - Assinatura do Construtor:

    - "public Constructor(String message)": Este é o construtor da classe "Constructor", que é chamado quando uma
  nova instância da classe é criada.

?     2 - Corpo do Construtor:

    - "this.message = message;": Atribui o valor do parâmetro "message" ao campo de instância "message".

?     3 - Descrição da Funcionalidade do Construtor:

    O construtor da classe "Constructor" inicializa o campo "message" com o valor fornecido como argumento ao criar
  uma nova instância da classe. Isso permite que cada instância da classe "Constructor" tenha seu próprio valor de
  "message".

?     4 - Assinatura do Método "printMessageConstructor":

    - "public void printMessageConstructor()": O método é público e não retorna nenhum valor(void).

?     5 - Corpo do Método "printMessageConstructor":

    - "System.out.println(message);": Imprime o valor do campo "message" no console.

?     6 - Descrição da Funcionalidade do Método "printMessageConstructor":

    O método "printMessageConstructor" imprime a mensagem armazenada no campo "message" no console. Este método
  permite que a mensagem passada ao construtor seja exibida quando o método é chamado.

?     7 - Assinatura do Método "main":

    - "public static voin main(String[] args)": Este é o ponto de entrada do programa Java. O método "main" é 
  necessário para que a JVM ( Java Virtual Machine ) possa executar o programa.

?     8 - Corpo do do Método "main":

    - "Constructor constructor = new Constructor("Mensagem do Método Construtor!");": Cria uma nova instância de
  classe "Constructor", passando a mensagem "Mensagem do Método Construtor!" para o construtor.
  
    - "constructor.printMessageConstructor();": Chama o método "printMessageConstructor" na instância "constructor",
  o que resulta na impressão da mensagem no console.

?     9 - Descrição da Funcionalidade do Método "main":

    - Cria uma nova instância da classe "Constructor", inicializando o campo "message" com a string "Mensagem do
  Método Construtor!".

    - Chama o método "printMessageConstructor" para imprimir a mensagem armazenada no campo "message" no console.

?     10 - Resumo e Conclusão:

?       Construtor "Constructor(String message)":

    - Inicializa o campo "message" com o valor passado como argumento ao criar uma nova instância da classe.

?       Método "printMessageConstructor":

    - Imprime a mensagem armazenada no campo "message" no console.

?       Método "main":

    - Cria uma instância da classe "Constructor" com a mensagem "Mensagem do Método Construtor!".

    - Chama o método "printMessageConstructor" para exibir a mensagem no console.

?       Funcionalidade Geral

    A classe "Constructor" demonstra como usar um construtor para inicializar um campo de instância com um valor
  fornecido no momento da criação do objeto. O método "printMessageConstructor" permite imprimir esse valor no
  console. O método "main" ilustra a criação de um objeto da classe "Constructor" e a chamado do método
  "printMessageConstructor" para exibir a mensagem inicializada.

!       MÉTODO GETTER E SETTER
*/
class GetterSetter{
  private String message;
  
  public String getMessage(){
    return message;
  }

  public void setMessage(String message){
    this.message = message;
  }

  public static void main(String[] args) {
    GetterSetter getterSetter = new GetterSetter();
    getterSetter.setMessage("Mensagem do Método Getter e Setter!");
    System.out.println(getterSetter.getMessage()); // Saída: Mensagem do Método Getter e Setter!
  }
}
/*
?     1 - Assinatura do Método "getMessage":

    - "public String getMessage()": O método é público e retorna um valor do tipo "String".

?     2 - Corpo do Método "getMessage":

    - "return message;": Retorna o valor atual do campo "message".

?     3 - Descrição da Funcionalidade do Método "getMessage":

    O método "getMessage" é um método de acesso (getter) que retorna o valor atual do campo "message". Ele permite
  que outras partes do programa obtenham o valor de "message".


?     4 - Assinatura do Método "setMessage":

    - "public void setMessage(String message)": O método é público e não retorna nenhum valor(void).

?     5 - Corpo do Método "setMessage":

   - "this.message = message;": Atribui o valor do parâmetro "message" ao campo de instância "message".

?     6 - Descrição da Funcionalidade do Método "setMessage":

    O método "setMessage" é um método modificador (setter) que define o valor do campo "message". Ele permite que
  outras partes do programa modifiquem o valor de "message".

?     7 - Assinatura do Método "main":

    - "public static void main(String[] args)": Este é o ponto de entrada do programa Java. O método "main" é 
  necessário para que a JVM ( Java Virtual Machine ) possa executar o programa.

?     8 - Corpo do método "main":

    - "GetterSetter getterSetter = new GetterSetter();": Cria uma nova instância da classe "GetterSetter".

    - "getterSetter.setMessage("Mensagem do Método Getter e Setter!");": Chama o método "setMessage" na instância
  "getterSetter", definindo o valor de "message" para "Mensagem do Método Getter e Setter!".

    - "System.out.println(getterSetter.getMessage());": Chama o método "getMessage" na instância "getterSetter" e 
  imprime o valor retornado no console, que será "Mensagem do Método Getter e Setter!".

?     9 - Descrição da Funcionalidade do Método "main":

    O método "main" na classe "GetterSetter" faz o seguinte:

    - Cria uma nova instância da classe "GetterSetter".

    - Chama o método "setMessage" para definir o valor do campo "message".

    - Chama o método "getMessage" para obter o valor atual do campo "message" e imprime esse valor no console.

?     10 - Resumo e Conclusão:

?       Método "getMessage":

    - Retorna o valor atual do campo "message".

?       Método "setMessage":

    - Define o valor do campo "message" com o valor fornecido como argumento.

?       Método "main":

    - Cria uma instência da classe "GetterSetter".

    - Usa o método "setMessage" para definir o valor do campo "message".

    - Usa o método "getMessage" para obter e imprimir o valor de "message".

    A classe "GetterSetter" demonstra o uso de métodos de acesso (getters) e métodos modificadores (setters) para
  manipular o valor de um campo privado. O método "getMessage" permite obter o valor do campo "message", enquanto
  o método "setMessage" permite definir o valor desse campo. O método "main" ilustra como criar uma instância da
  classe, definir o valor do campo "message" usando o setter, e obter e imprimir esse valor usando o getter.

!       MÉTODOS COM PARÂMETROS VARIÁVEIS
*/
class Variaveis {
  public void printMessage(String... messages){
    for(String message : messages){
      System.out.println(message);
    }
  }
  public static void main(String[] args) {
    Variaveis variaveis = new Variaveis();
    variaveis.printMessage("Mensagens", "dos", "Métodos", "com", "Parâmetros", "Variáveis");
  }
}
/*
?     1 - Assinatura do Método "printMessage":

    - "public void printMessage(String... messages)": O método é público, não retorna nehum valor (void) e aceita
  um número variável de argumentos do tipo "String".
  
?     2 - Corpo do Método "printMessage":

    - "for(String message : messages) { System.out.println(message); }": O método utiliza um laço "for-each" para
  iterar sobre cada "String" no array "messages" e imprime cada mensagem no console.

?     3 - Descrição da Funcionalidade "printMessage":

    O método "printMessage" é projetado para receber um número variável de argumentos "String" (usando a sintaxe
  varargs "String..."). Dentro do método, ele percorre cada mensagem fornecida e imprime cada uma delas no console.
  Esse método é útil quando se deseja passar uma quantidade indeterminada de parâmetros para um método.

?     4 - Assinatura do Método "main":

    - "public static void main(String[] args)": Este é o ponto de entrada do programa Java. O método "main" é
  necessário para que a JVM ( Java Virtual Machine ) possa executar o programa.

?     5 - Corpo do Método "main":

    - "Variaveis variaveis = new Variaveis();": Cria uma nova instância da classe "Variaveis".

    - "variaveis.printMessage("Mensagens", "dos", "Métodos", "com", "Parâmetros", "Variáveis");": Chama o método
  "printMessage" na instância "variaveis", passando uma lista de "String" como argumentos. Cada argumento será 
  impresso no console.

?     6 - Descrição de Funcionalidade "main":

    - Cria uma nova instância da classe "Variaveis".

    - Chama o método "printMessage" com uma lista de argumentos "String": "Mensagens", "dos", "Métodos", "com", 
  "Parâmetros", "Variáveis".

    - Cada um desses argumentos será impresso no console em linhas separadas.

?     7 - Resumo e Conclusão:

?       Método "printMessage":

    - Recebe um número variável de argumentos "String".

    - Imprime cada argumento em uma linha separada no console.

?       Método "main":

    - Cria uma instância da classe "Variaveis".

    - Chama o método "printMessage" com uma lista de mensagens para demonstrar a funcionalidade de impressão de
  múltiplos argumentos.

?        Conclusão:

    A classe "Variaveis" demonstra o uso de um método que aceita parâmetros variáveis ("varargs"). O método 
  "printMessage" é capaz de receber uma quantidade indeterminada de strings e imprimi-las uma por uma no console.
  O método "main" ilustra como criar uma instância da classe "Variaveis" e chamar o método "printMessage" com 
  vários argumentos, mostrando como esses parâmetros variáveis podem ser usados na prática.

!         MÉTODOS SOBRSCRITOS (OVERRIDE)
*/

class Carro {
  public void estadoCarro() {
    System.out.println("Saindo com o carro!");
  }
}

class Ligado extends Carro {
  @Override
  public void estadoCarro(){
    System.out.println("Vruuum!");
  }
}

  class Desligado extends Carro{
    @Override
    public void estadoCarro(){
      System.out.println("Ligar o carro para ele se mover!");
    }
  

  public static void main(String[] args){
    boolean ligado = true;
    Carro carro = new Carro();
    Carro carroLigado = new Ligado();
    Carro carroDesligado = new Desligado();
if (ligado == true) {
      
      carro.estadoCarro(); // Saída: Saindo com o carro!
      carroLigado.estadoCarro(); // Saída: Vruuum!
    }else
      carroDesligado.estadoCarro(); // Saída: Ligar o carro para ele se mover!
  }
}

/*
?     1 - Definição da Classe "Carro":

    - A classe "Carro" posui um método "estadoCarro" que imprime "Saindo com o carro!" no console. Esta é a classe
  base.

?     2 - Definição da Classe "Ligado":

    - A classe "Ligado" herda de "Carro" e sobrescreve o método "estadoCarro" para imprimir "Vruuum!" no console.
  Esta classe representa o estado do carro quando está ligado.

?     3 - Definição da Classe "Desligado":

    - A classe "Desligado" herda de "Carro" e sobrescreve o método "estadoCarro" para imprimir "Ligar o carro para
  ele se mover!" no console. Esta classe representa o estado do carro quando está desligado.

?     4 - Funcionalidade do Método "main":

?       Váriavel "ligado":

    - "boolean ligado = true;": Define uma variável booleana "ligado" como "true".

?       Criação de Objetos:

    - "Carro carro = new Carro();": Cria uma instância da classe "Carro".

    - "Carro carroLigado = new Ligado();": Cria uma instância da classe "Ligado" e a atribui a uma variável do 
  tipo "Carro".

    - "Carro carroDesligado = new Desligado();": Cria uma instância da classe "Desligado" e a atribui a uma 
  variável do tipo "Carro".

?       Estrutura Condicional:

    - "if (ligado == true) {...} else {...}": Verifica se a variável "ligado" é "true".

?    - Caso "ligado" seja "true":

    - "carro.estadoCarro();": Chama o método "estadoCarro" na instância de "Carro", imprimindo "Saindo com o carro!".

    - "carroLigado.estadoCarro();": Chama o método "estadoCarro" na instância de "Ligado", imprimindo "Vruuum!".

?     - Caso "ligado" seja "false":

    - "carroDesligado.estadoCarro();": Chama o método "estadoCarro" na instância de "Desligado", imprimindo "Ligar
  o carro para ele se mover!".

?    5 - Resumo e Conclusão:

?       Classe "Carro":

    - Método "estadoCarro": Imprime "Saindo com o carro!".

?       Classe "Ligado":

    - Sobrescreve "estadoCarro": Imprime "Vruuum!".

?       Classe "Desligado":

    - Sbrescreve "estadoCarro": Imprime "Ligar o carro para ele se mover".

?       Método "main":

    - Define uma variável "ligado" como "true".

    - Cria instância de "Carro", "Ligado" e "Desligado".

    - Utiliza uma estrutura condicional para chamar o método "estadoCarro" dependendo do valor do "ligado".

?       Funcionalidade Geral

    A classe "Carro" e suas subclasses "Ligado" e "Desligado" demonstram o conceito de polimorfismo em Java.
  Dependendo do estado do carro ("ligado" ou "desligado"), difirentes mensagens são impressas no console. O 
  método "main" cria instâncias dessas classes e usa uma estrutura condicional para decidir qual mensagem imprimir,
  mostrando como o polimorfismo permite que objetos de diferentes classes sejam tratados de maneira uniforme.

!       MÉTODOS SOBRECARGA (Overload)
*/

class Sobrecarga{
  public void mensagemSobrecarga(String message) {
    System.out.println(message);
  }

  public void mensagemSobrecarga(String message, int times) {
    for (int i = 0; i < times; i++) {
      System.out.println(message);
    }
  }

  public static void main(String[] args) {
    Sobrecarga sobrecarga = new Sobrecarga();
    sobrecarga.mensagemSobrecarga("Som do galope de um cavalo!");
    sobrecarga.mensagemSobrecarga("Pocoto", 3);
  }
}
/*
?     1 - Assinatura do Primeiro Método "mensagemSobrecarga":

    - "public void mensagemSobrecarga(String message)": O método é público, não retorna nenhum valor (void) e
  aceita um argumento do tipo "string".

?     2 - Corpo do Primeiro Método "mensagemSobrecarga":

    - "System.out.println(message);": Imprime o valor do argumento "message" no console.

?     3 - Descrição da Funcionalidade do Primeiro Método "mensagemSobrecarga":

    O primeiro método "mensagemSobrecarga" é projetado para imprimir uma única mensagem no  console. Ele recebe
  uma string como argumento e simplesmente a imprime.

?     4 - Assinatura do Segundo Método "mensagemSobrecarga":

    - "public void mensagemSobrecarga(String message, int times)": O método é público, não retorna nenhum valor
  (void) e aceita dois argumentos: uma String("message") e um inteiro ("times").

?     5 - Corpo do Segundo Método "mesagemSobrecarga":

    - "for (int i = 0; i < times; i++) { System.out.println(message); }": O método utiliza um laço "for" para 
  interar "times" vezes, imprimindo a mensagem fornecida em cada iteração.

?     6 - Descrição da Funcionalidade do Segundo Método "mensagemSobrecarga":

    O segundo método "mensagemSobrecarga" é projetado para imprimir uma mensagem múltiplas vezes no console.
  Ele recebe uma string e um número inteiro, e imprime a mensagem o número de vezes especificado pelo inteiro.

?     7 - Definição do Método "main":

?       Criação de Objetos:

    - "Sobrecarga sobrecarga = new Sobrecarga();": Cria uma nova instância da classe "sobrecarga".

?       Chamadas de Método:

    - "sobrecarga.mensagemSobrecarga("Som do galope de um cavalo!");": Chama o primeiro método "mensagemSobrecarga",
  imprimindo "Som do galope do cavalo!" no console.

    - "sobrecarga.mensagemSobrecarga("Pocoto", 3);": Chama o segundo método "mensagemSobrecarga", imprimindo "Pocoto"
  três vezes no console.

?     8 - Resumo e Conclusão:

?       Primeiro Método "mensagemSobrecarga":

    - Recebe uma string e a imprime no console.

?       Segundo Método "mensagemSobrecarga":

    - Recebe uma string e um número inteiro, e imprime a string o número de vezes especificado pelo inteiro.

?       Método "main":

    - Cria uma instância da classe "Sobrecarga".

    - Chama o primeiro método "mensagemSobrecarga" para imprimir uma mensagem única.

    - Chama o segundo método "mensagemSobrecarga" para imprimir uma mensagem múltipla vezes.

?       Funcionalidade Geral:

    A classe "Sobrecarga" demonstra o conceito de sobrecarga de métodos em Java, onde dois métodos com o mesmo
  nome, mas diferentes parâmetros, coexistem na mesma classe. O método "mensagemSobrecarga" é sobrecarregado para 
  permitir a impressão de uma mensagem única ou a impressão de uma mensagem múltiplas vezes. O método "main" 
  ilustra como criar uma instância da classe "Sobrecarga" e utilizar ambas as versões do método "mensagemSobrecarga"
  para imprimir mensagens no console.

!       MÉTODOS DE CLASSE ANÔNIMA
*/
class Anonima {
  interface HelloWorld {
    void greet();
    void greetSomeone(String someone);
  }
  public void sayHello() {
    HelloWorld englishGreeting = new HelloWorld() {
      public void greet(){
        greetSomeone("world");
      }
      public void greetSomeone(String someone) {
        System.out.println("Hello "+ someone);
      }
    };

    englishGreeting.greet();

  }
  public static void main(String[] args) {
    Anonima anonima = new Anonima();
    anonima.sayHello(); // Saída Hello world
  }
}
/*
?      1 - Definição da interface "HelloEorld":

    A interface "HelloWorld" define dois métodos:

      - "greet()": Método sem parâmetros, que deve ser implementado para executar uma saudação.

      - "greetSomeone(String someone)": Método que aceita um parâmetro "String" para saudar uma pessoa específica.
  
?     2 - Criação da Classe Anônima e do Método "sayHello":
    
    Dentro do método "sayHello", uma classe anônima é criada implementando a interface "HelloWorld". Isso é feito
  diretamente no ponto de instanciamento:

      - Método "greet": Implementa o método "greet" chamando "greetSomeone("world")".

      - Método "greetSomeone": Implementa o método "greetSomeone" para imprimir "Hello " seguido do nome passado
    como argumento.

?     3 - Chamada do Método "greet":

    Após criar a classe anônima, método "greet" é chamado na instância "englishGreeting", que, por sua vez, chama
  "greetSomeone("world")", resultando na saída "Hello world".

?     4 - Método "main":

    - Criação de Instância: Cria uma instância da classe "Anonima".

    - Chamada de Método: Chama o método "sayHello" na instância "anonima", que executa a lógica de saudação definida
  na classe anônima.

?     5 - Resumo e Conclusão:

    - Interface "HelloWorld": Define a estrutura de métodos que devem ser implementados para saudações.

    - Método "sayHello":

      - Cria uma classe anônima que implementa "HelloWorld".

      - Define os métodos "greet" e "greetSomeone" para saudar "world".

      - Chama o método "greet", resultando na saída "Hello world".
    
    - Método "main":

      - Cria uma instância da classe "Anonima".

      - Chama o método "sayHello", demonstrando a funcionalidade da classe anônima.

?     Funcionalidade Geral:

    A classe "Anonima" demonstra o uso de classes anônimas em Java. Classes anônimas permitem a criação de implementações
  de interfaces ou superclasses sem definir uma classe separada. No método "sayHello", uma classe anônima implementa
  a interface "HelloWorld", fornecendo uma implementação específica dos métoddos "greet" e "greetSomeone".Quando
  "sayHello" é chamado, ele utiliza essa implementação para imprimir "Hello world" no console. O método "main"
  mostra como instanciar a classe "Anonima" e chamar "sayHello", exemplificando o uso de classes anônimas na prática.
*/