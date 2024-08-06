package edu.piter.aula6java;

public class PalavrasReservadas {
/*
!         PALAVRAS RESERVADAS

?       Objetivo da Aula:

    Apresentar as 52 palavras reservadas organizadas por classificação de usabilidade considerando as regras da
  linguagem.

?       Sobre Palavras reservadas:

    Palavras reservadas são identificadores de uma linguagem que já possuem uma finalidade específica, portanto
  não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

    A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas
  com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo temos a lista de
  palavras agrupadas por suas finalidades.

!         PALAVRAS RESERVADAS EM JAVA

?       Controle de Pacotes:

    - "import": importa pacotes ou classes para dentro do código.
    Exemplo: 
    import java.util.ArrayList;

    - "package": especifica a que pacote todas as classes de um arquivo pertencem.
    Exemplo: 
    package com.example;

?       Modificadores de Acesso:

    - "public": acesso de qualquer classe. Deixa a minha classe, o meu atributo e meu método público, sem restrições.
    Exemplo: 
    public String name;

    - "private": acesso apenas dentro da classe.
    Exemplo: 
    private String secret;

    - "protected": acesso por classes no mesmo pacote e subclasses. Tem como finalidade ser trabalhada com herança.
    Exemplo: 
    protected String familySecret;

?      Primitivos:

    - "boolean": um valor indicando verdadeiro(true) ou falso(false).
    Exemplo: 
    boolean isJavaFun = true;

    - "byte": um inteiro de 8 bits (signed).
    Exemplo: 
    byte b = 100;

    - "char": um character unicode (16-bit unsigned).
    Exemplo: 
    char letter = 'A';

    - "double": um número de ponto flutuante de 64 bits (signed).
    Exemplo: 
    double pi = 3.14159;

    - "float": um número de ponto flutuante de 32 bits (signed).
    Exemplo: 
    float pi = 3.14f;

    - "int": um inteiro de 32 bits (signed).
    Exemplo: 
    int number = 100;

    - "long": um inteiro de 64 bits (signed).
    Exemplo: 
    long largeNumber = 100000L;

    - "short": um inteiro de 32 bits (signed).
    Exemplo: 
    short s = 1000;

    - "void": indica que o método não tem retorno de valor
    Exemplo:
 
    public void printMessage() {
        System.out.println("Hello");
    }

?     Modificadores de Classes, Variáveis ou Métodos:

    - "abstract": classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não
  abstrata.
    Exemplo: 
    public abstract class Animal {
        public abstract void makeSound();
    }

    - "class": especifica um classe.
    Exemplo: 
    public class Example {
     *código da classe
    }

    - "extends": indica a superclasse que a subclasse está estendendo.
    Exemplo: 
    public class Dog extends Animal {
     *código da classe Dog
    }

    - "final": impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja
    reinicializada.
    Exemplo: 
    public final class Constants {
        public static final double PI = 3.14159;
    }

    - "implements": indica as interfaces que uma classe irá implementar.
    Exemplo:
    public class Dog implements Animal {
       *código da classe Dog
    }

    - "interface": especifica uma interface.
    Exemplo:
    public interface Animal {
        void makeSound();
    }

    - "native": indica que um método está escrito em uma linguagem dependente de plataforma, como o C.
    Exemplo:
    public class Example {
        public native void nativeMethod();
    }

    - "new": instancia um novo objeto, chamando seu construtor.
    Exemplo:
    Example example = new Example();

    - "static": faz um método ou variável pertencer à classe ao invés de às instâncias.
    Exemplo:
    public static void printHello() {
        System.out.println("Hello");
    }

    - "strictfp": usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão
    as regras de ponto flutuante, em todas as expressões.
    Exemplo:
    public strictfp class Example {
      * código da classe
    }

    - "synchronized": indica que um método só pode ser acessado por uma thread de cada vez.
    Exemplo:
    public synchronized void increment() {
        count++;
    }

    - "transient": impede a serialização de campos.
    Exemplo:
    public class Example implements Serializable {
        private transient int sensitiveData;
    }

    - "volatile": indica que uma variável pode ser alterada durante o uso de threads.
    Exemplo:
    public class Example {
        private volatile boolean flag;
    }

?     Controle de Fluxo Dentro de um Bloco de Código:

    - "break": sai do bloco de código("switch") em que ele está ou para sair de um laço ("for", "while", "do-while").
    Exemplo:
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            break;
        }
    }

    - "case": executa um bloco de código dependendo do teste do switch.
    Exemplo:
    int day = 2;
    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
    }

    - "continue": pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop.
    Exemplo:
    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            continue;
        }
        System.out.println(i);
    }

    - "default": executa um bloco de código caso nenhum dos teste de switch-case seja verdadeiro.
    Exemplo:
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        default:
            System.out.println("Weekday");
            break;
    }
  
    - "do": executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar
    se o bloco deverá ser executado novamente.
    Exemplo:
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);

    - "else": executa um bloco de código alternativo caso o teste "if" seja falso;
    Exemplo:
    int number = 10;
    if (number > 0) {
        System.out.println("Positive");
    } else {
        System.out.println("Negative");
    }

    - "for": usado para realizar um loop condicional de um bloco de código.
    Exemplo:
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    - "if": usado para realizar um teste lógico de verdadeiro ou falso.
    Exemplo:
    int number = 10;
    if (number > 0) {
        System.out.println("Positive");
    }

    - "instanceof": determina se um objeto é uma instância de determinada classe, superclasse ou interface.
    Exemplo:
    Animal dog = new Dog();
    if (dog instanceof Dog) {
        System.out.println("This is a Dog");
    }

    - "return": retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar
    uma variável).
    Exemplo:
    public int sum(int a, int b) {
        return a + b;
    }

    - "switch": indica a variável a ser comparada nas expressões case.
    Exemplo:
    int day = 2;
    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
    }

    - "while": executa um bloco de código repetidamente enquanto a condição for verdadeira.
    Exemplo:
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

?     Tratamento de Erros:

    - "assert": testa uma expressão condicional, para verificar uma suposição do programador.
    Exemplo:
    assert x > 0 : "x deve ser maior que 0";

    - "catch": declara o bloco de código usado para tratar uma exceção.
    Exemplo:
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }

    - "finally": bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido
  ao lidar com uma exceção.
    Exemplo:
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    } finally {
        System.out.println("This will always be executed");
    }

    - "throw": usado para passar uma exceção para o método que o chamou.
    Exemplo:
    public void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(a / b);
    }

    - "throws": indica que um método pode passar uma exceção para o método que o chamou.
    Exemplo:
    public void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(a / b);
    }

    - "try": bloco de código que tentará ser executado, mas que pode causar uma exceção.
    Exemplo:
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero");
    }

?     Variáveis de Referência:

    - "super": refere-se a superclasse imediata.
    Exemplo:
    public class Dog extends Animal {
        public void makeSound() {
            super.makeSound();
            System.out.println("Bark");
        }
    }

    - "this": refere-se a instância atual do objeto.
    Exemplo:
    public class Example {
        private String name;

        public Example(String name) {
            this.name = name;
        }

        public void printName() {
            System.out.println(this.name);
        }
    }

?     Palavras Reservadas não Utilizadas:

    - "const": Não utilize para declarar constantes; use public static final. Reservada para uso futuro. Não é 
  usada atualmente.

    - "goto": não implementada na linguagem Java, por ser considerada prejudicial.

?     Literais Reservados:

    De acordo com a Java Language Specification, null, true e false são tecnicamente chamadas de valores literais,
  e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.

?     Escopo de Uso:

?     Uso                         Palavras                            Observação

    Arquivo                 package, import, static.

    Classe                public ou protected ou private           private (em caso de classe interna),
                          + final ou abstract + extends ou         final ou abstract.
                          implements.
    
    Método                public ou protected ou private +         void em caso de não ter retorno ou 
                          static ou final ou abstract + void       return se houver.
                          e return.
        
    Atributo              public ou protected ou private + 
                          static ou final + tipo primitivo.

?     Palavras "Opostas":

    Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras que são completamente
  opostas (antônimas) na linguagem Java conforme tabela abaixo:

?     Palavra                     Palavra                             Explicação

                                                                 Enquanto "package" determina o diretório
      package                     import                        real da classe, o "import" informa de onde
                                                                será importada a classe. Isso porque, podemos
                                                                ter classes de mesmo nome.
                                                                
                                                                 Enquando "extends" determina que uma classe
      extends                   implements                      estende outra classe, "implements" determina
                                                                que uma classe implementa uma interface, 
                                                                porém nunca o contrário.
                        
                                                                 Enquanto "final" determina fim de alteração de
                                                                valor ou lógica comportamental, "abstract" em 
      final                      abstract                       métodos, exige que sub-classes precisarão definir
                                                                comportamento e um método abstrato.
                                                                NOTA: Se uma classe contém um único método abstrato,
                                                                toda classe precisa ser.

                                                                 Esta é uma das situações mais complicadas, de 
                                                                compreensão destas duas palavras. Enquanto a
      throws                      throw                         throws determina que um método pode lançar uma
                                                                exceção**. Vamos conhecer mais sobre este conceito
                                                                no assunto Exceções.**
*/
}
