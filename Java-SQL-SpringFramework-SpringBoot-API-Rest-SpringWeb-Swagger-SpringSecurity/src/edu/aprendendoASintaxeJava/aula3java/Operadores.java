package edu.aprendendoASintaxeJava.aula3java;
public class Operadores {
    public static void main(String[] args) {
/*
!                   OPERADORES

            Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas
        operações.

            Geralmente as primeiras palavras que ouvimos em um curso de programação são: um programa é um conjunto
        de instruções lógicas que, quando executadas, produzem algum resultado. Com isso em mente, ao começar a
        criar as primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma
        lógica para processá-los e então apresentar o resultado desse processamento.

!                   CLASSIFICAÇÃO DOS OPERADORES

?               Atribuição:

            Representado pelo símbolo de igualdade " = ".

            O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma
        variável. Em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do 
        operador de atribuição. Devemos levar em consideração que cada tipo de dado tem uma forma de declarar o 
        respectivo valor a esta variável. Exemplos abaixo:
*/
        //classe Operadores.java

        String nome = "Piter"; /* String é uma composição de conjunto de caracteres, que representam uma expressão 
        ou um valor literal de texto, para declarar/atribuir o valor da variável de classe String, nós precisamos 
        colocar entre aspas( 'exp' ) ou aspas duplas( "exp" ).
*/
        int idade = 32; /* Para declarar/atribuir um valor a uma variável de um inteiro nós utilizamos o valor
        literal númerico(12). Ele aceita apenas valores numéricos inteiros, não é possível atribuir caracteres de 
        qualquer outro tipo, por exemplo: letras, sinais, pontuações, simbulos, espaços e etc...
*/
        double peso = 80.5; /* Para declarar/atribuir um valor a uma variável de um double nós utilizamos o valor
        literal númerico com ponto(00.00) para valores quebrados. Não é possível atribuir caracteres de qualquer 
        outro tipo, por exemplo: letras, sinais, simbulos, espaços e etc...
*/
        char sexo = 'M'; /* Para declarar/atribuir um valor a uma variável de um char nós utilizamos um caractere
        entre aspas simples( 'A' ) e ele só permite um único caractere.
*/
        boolean doadorOrgao = true; /* Para declarar/atribuir um valor a uma variável de um boolean, só é aceita 
        as palavras reservadas com valores literias de: true(verdadeiro) ou false(falso).
*/
        System.out.println("Nome: "+nome+", idade: "+idade+", peso: "+peso+", sexo: "+sexo+", é doador de orgão?: "+doadorOrgao);
/*      
?       Date dataNascimento = new Date(); 
        - Aqui temos uma classe que representarão tipos da nossa linguagem pode ser uma classe fornecedor, poderá 
        ser uma classe cliente, uma classe aluno e etc... Logo esse tipo de variáveis de classe que iremos 
        declarar, iram precisar anteceder com a palavra chave "new"(que cria um novo objeto na aplicação) e o 
        nome da classe correspondente, informando os parâmetros de inicialização.

?               Operadores Aritiméticos:

        O operador aritimético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se
    tornar ou não uma expressão mais complexa.

        Os operadores aritiméticos são: " + "  (adição), " - " (subtração), " * " (multiplicação) e " / " (divisão).
*/
        //classe Operadores.java

        double soma = 10.5 + 15.7; // Aqui temos um operador de adição(+), junto com um operador atribuição(=).

        int subtracao = 113 - 25; // Aqui temos um operador de subtração(-), junto com um operador atribuição(=).

        int multiplicacao = 20 * 7; // Aqui temos um operador de multiplicação(*), junto com um operador atribuição(=).

        int divisao = 17 / 3; // Aqui temos um operador de divisão(/), junto com um operador atribuição(=).

        int restoDaDivisao = 17 % 3; /* Aqui temos um operador de módulo(%), que é o resto de uma divisão, 
        junto com um operador atribuição(=).
*/
        double resultado = (10 * 7) + (20 / 4); /* Aqui temos um operador de multiplicação(*), multiplicando
        números entre parenteses(), depois temos um operador de adição(+), para somar os resultados dos parenteses e
        dentro do segundo parenteses temos o operador de divisão(/).
*/

        System.out.println("Soma = "+soma+", subtração = "+subtracao+", multiplicação = "+multiplicacao+", divisão = "+divisao+", resto da divisão = "+restoDaDivisao+", resultado = "+resultado);
/*
!                       OBS:
        O oprerador de adição(+), quando utilizado em uma variável de tipo texto, realizará a "concatenação do texto".
*/
        String nomeCompletoJunto = "LINGUAGEM" + "JAVA";

        String nomeCompleto = ", LINGUAGEM " + "JAVA, ";

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; /* Nesse caso os números foram somados até o número entre aspas("1"), depois o 
        operador de adição contatenou a variavél entre aspas("1"). Dando como retorno o resultado 31.
*/ 

        System.out.println(nomeCompletoJunto+nomeCompleto+concatenacao);

        concatenacao = 1+"1"+1+1;/* Nesse caso a soma não ocorreu, porque o segundo caractere está entre aspas("1")
        e isso interrompeu a soma dos números o que irá retornar o valor de 1111.
*/
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;/* Nesse caso a soma não ocorreu, porque o primeiro caractere está entre aspas("1")
        e isso interrompeu a soma dos números o que irá retornar o valor de 1111.
*/
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); /* Nesse caso os números entre parenteses foram somados, depois o 
        operador de adição contatenou a variavél entre aspas("1"). Dando como retorno o resultado 13.
*/ 

        System.out.println(concatenacao);
/*
!                       CONCLUSÃO
        A soma junto a itens com aspas só ocorrerá se os valores a serem somados estiverem antes dos valores 
    em aspas("1"), ou se os valores que seram somados estiverem entre parenteses().
*/
    }
}
class OperadorUnarios{
    public static void main(String[] args) {
/*
!                       OPERADOR UNÁRIOS

        Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos
     básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

        - (+) Operador unário de valor positivo - números são positivos sem esse operador explicitamente;
        
        - (-) Operador unário de valor negativo - nega um número ou expressão aritmética;

        - (++) Operador unário de incremento de valor - incrementa o valor em 1 unidade;

        - (+=) Operador unário de incremento de valor - incrementa o valor que você digitar após a igualdade(=).

        - (--) Operador unário de decremento de valor - decrementa o valor em 1 unidade;

        - (-=) Operador unário de decremento de valor - decrementa o valor que você digitar após a igualdade(=).

        - (!) Operador unário de lógico de negação - nega o valor de uma expressão booleana;

!                       EXEMPLOS PRÁTICOS:
*/            
        int numero = +5; /* Como padrão o valor é positivo, então não ha necessidade de utilizar o operador unário 
        positivo.
*/ 
        System.out.println(numero);

        numero = - numero; /* Ao adicionar o operador unário negativo(-), o número se torna negativo e caso o 
        número sejá negativo ele torna o número em positivo, assim como na matemática( + com + igual a + ),
        ( - com + igual a - ) e ( - com - igual a +).
*/
        System.out.println(numero);
        
        numero = - numero; // Ao adicionar o operador unário negativo(-), o número se torna positivo novamente.

        System.out.println(numero);

        numero++; /*  Ao adicionar o operador unário de incremento(++), junto ao nome da variável, ele irá 
        somar +1 ou acidionar uma unidade
*/
        System.out.println(numero);

        numero += 3; /*  Ao adicionar o operador unário de incremento(+=), junto ao nome da variável, ele irá 
        somar ou acidionar a quantidade descrita após a igualdade(=).
*/

        System.out.println(numero);

        numero--; /*  Ao adicionar o operador unário de decrementa(--), junto ao nome da variável, ele irá 
        subtrair -1 ou remover uma unidade
*/

        System.out.println(numero);

        numero -= 3; /*  Ao adicionar o operador unário de decrementa(-=), junto ao nome da variável, ele irá 
        subtrair ou remover a quantidade descrita após a igualdade(=).
*/

        System.out.println(numero);
/*
        Podemos também incrementar ou decrementar o valor de uma variável durante a operação de retorno ou impressão.
        Por exemplo:
*/
        System.out.println( -- numero); // Aqui será impresso o número - 1.
        
        System.out.println( ++ numero); // Aqui será impresso o número + 1
/*
!                       OBS:
        Se o operador for adicionado no retorno ou na impressão ele deve vir antes do nome da variável para ser 
     computado, caso contrário(numero ++ ou numero --) o programa irá imprimir a variável primeiro depois executar 
     a alteração do valor, fazendo com que o valor modificado só seja executado em um retorno ou impressão 
     posterior. Observe o exemplo abaixo:
 */

        System.err.println(numero ++); // Será impresso o valor 5

        System.out.println(numero); // Será impresso o valor 6. Pois a soma foi feita após a impressão acima.
        
        boolean verdadeiroFalso = !true; /* O operador de lógica de negação(!), converte o verdadeiro em falso e
        o falso em verdadeiro. Nesse caso o "true" se tornou "false".
 */
        System.out.println(verdadeiroFalso);

        verdadeiroFalso = !false; // E nesse caso o "false" se tornou "true".

        System.out.println(verdadeiroFalso);
/*
!                       OBS:
        Se o operador de lógica de negação(!) for adicionado durante o retorno ou a impressão ele não modifica
      o valor da variável como nos exemplos de incrementação e decrementação. Ou seja se o valor for "true" e
      na impressão nós utilizarmos o operador de lógica de negação(!), para imprimir "false", no próximo retorno
      ou impressão ele voltará a ser "true". Observe o exemplo abaixo: 
*/
        boolean verdadeiro = true;

        System.out.println(!verdadeiro); // Será impresso "false"

        System.out.println(verdadeiro); /* Será impresso "true". Porque ao contrario da incrementação e da 
        decrementação, o valor da variável não é alterado permanentemente na impressão anterior.
*/
    }
}
class Ternario{
    public static void main(String[] args) {
/*
!                       OPERADOR TERNÁRIO

        O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre
     dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma
     forma em que toda a sua estrutura estará escrita numa única linha.

        O operador ternário é representado pelos símbolos " ?: " utilizados na seguinte estrutura de sintaxe:

        <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

        Exemplos abaixo:
*/    
        int a, b;

        a = 5;

        b = 6;

        // Exemplo da condicional utilizando uma estrutura if/else
        if (a==b) {
                System.out.println("(a) é igual a (b)");
                
        } else {
                System.out.println("(a) é diferente de (b)");
        }

        // Mesma condicional, mas dessa vez, utilizando o operador de condição ternária
        String resultado = a == b ? "Verdadeiro" : "Falso"; // Em uma linha de código, efetuamos um if/else.

        System.out.println(resultado);
    }
}
class Relacionais {
    public static void main(String[] args) {
/*
!                       OPERADORES RELACIONAIS

        Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente,
      definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da
      direita, retornando um valor booleano como resultado.

        - ( == ) Quando desejamos verificar se uma variável é IGUAL A outra.

        - ( != ) Quando desejamos verificar se uma variável é DIFERENTE da outra.

        - ( > ) Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        - ( >= ) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        - ( < ) Quando desejamos verificar se uma variável é MENOR QUE a outra.

        - ( <= ) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
*/
        int numero1 = 2;
        int numero2 = 2;

        String resultado = numero1 == numero2 ? "Sim, os números são iguais" : "Não, os números não são iguais";
        System.out.println(resultado);

        resultado = numero1 != numero2 ? "Sim, os números são diferentes" : "Não, os números não são diferentes";
        System.out.println(resultado);

        resultado = numero1 > numero2 ? "Sim, o número 1 é maior que o número 2" : "Não, o número 1 não é maior que o número 2";
        System.out.println(resultado);

        resultado = numero1 >= numero2 ? "Sim, o número 1 é maior ou igual ao número 2" : "Não, o número 1 não é maior ou igual ao número 2";
        System.out.println(resultado);

        resultado = numero1 < numero2 ? "Sim, o número 1 é menor que o número 2" : "Não, o número 1 não é menor que o número 2";
        System.out.println(resultado);

        resultado = numero1 <= numero2 ? "Sim, o número 1 é menor ou igual ao número 2" : "Não, o número 1 não é menor ou igual ao número 2";
        System.out.println(resultado);

        // Podemos utilizar os operadores relacionais com outros tipos de Variáveis e Classes. Como no exemplo abaixo:

        String nome1 = "Piter";
        String nome2 = "Piter";

        String resultadoNomes = nome1 == nome2 ? "Sim, os nomes são iguais" : "Não, os nomes não são iguais";
        System.out.println(resultadoNomes);

        resultadoNomes = nome1 != nome2 ? "Sim, os nomes são diferentes" : "Não, os nomes não são diferentes";
        System.out.println(resultadoNomes);
        
/*      Porém, quando estivermos falando de objetos ou textos é comum utilizarmos o comando equals para 
     comparações. Como no exemplo abaixo: 
*/
        System.out.println(nome1.equals(nome2)); // Porém ele retornará um valor booleano("true" ou "false").
    }
}

class OpreadoresLogicos {
     public static void main(String[] args) {
/*
!                       OPERADORES LÓGICOS

        Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da
      junção de duas ou mais expressões.

        - ( && ) Operador Lógico " E ".

        - ( || ) Operador Lógico " OU "

?               Exemplos Práticos de Uso Abaixo:
*/
        boolean condicao1 = true;

        boolean condicao2 = false;

        String comparandoCondicoes = condicao1 && condicao2 ? "As duas condições, são true" : "Uma das duas ou as duas condições, não são true";
        System.out.println(comparandoCondicoes);

        comparandoCondicoes = condicao1 || condicao2 ? "Uma das duas ou as duas condições, são true" : "Nenhuma das duas condições, não são true";
        System.out.println(comparandoCondicoes);

        comparandoCondicoes = condicao1 && (7 > 2) ? "As duas condições, são true" : "Uma das duas ou as duas condições, não são true";
        System.out.println(comparandoCondicoes);

        comparandoCondicoes = condicao1 || (7 > 2) ? "Uma das duas ou as duas condições, são true" : "Nenhuma das duas condições, não são true";
        System.out.println(comparandoCondicoes);
     }
}