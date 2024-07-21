package edu.piter.aula2java;

public class TiposVariaveis {
    /*
!           OBJETIVO DA AULA

        Explorar os tipos de dados numéricos inteiros, númericos decimais, lógicos, caracteres e suas 
    aplicabilidades. Explicar a diferença entre definição de variáveis e constantes.
     */

     /*
!           TIPOS E VARIÁVEIS

?           Tipos de Dados:

        No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam
    ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipo primitivos
    (Primitive Types).    


        Os oito tipos primitivos em Java são:
        int, byte, short, long, float, double, boolean e char - esses tipos não são considerados objetos,
    e portanto representam valores brutos.
        Eles são armazenados diretamente na pilha de memória. (Memory Stack).
      */
    
      /*
!          TABELA DE TIPOS PRIMITIVOS E SEUS VALORES:

?           Tipo            Memória         Valor Mínimo                    Valor Máximo
            byte            1 byte          -128                            127
            short           2 bytes         -32.768                         32.767
            int             4 bytes         -2.147.483.648                  2.147.483.647
            long            8 bytes         -9.223.372.036.854.775.808      9.223.372.036.854.775.807

    !       Obs:
        Mesmo tendo 4 tipos de númericos inteiros, é muito comum nos usarmos "int" nas nossas aplicações, 
    por uma questão de compatibilidade da JVN, ela sempre busca converter tipos literais, por exemplo "100",
    mesmo sendo um "byte" ele tenta converter para "int", e no caso de "30.000", mesmo sendo um "short" ele já
    tenta converter para "int", acima de "2.147.483.647" obviamente ele vai tentar converter para "long", mas
    na linguagem Java é muito comum nós encontrarmos opções numéricas do tipo "int". Então como padrão nós
    utilizamos na maioria dos casos de tipos numéricos a opção "int".

?       Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

?           Tipo            Memória         Valor Mínimo                    Valor Máximo
            float           4 bytes         -3,4028E + 38                   3,4028E + 38
            double          8 bytes         -1,7976E + 308                  1,7976E + 308

!           Obs:
        O tipo mais comum a ser utilizado em projetos, também por padrão, é o tipo "double", por uma questão de
    garantia das precisões através dos algorítimos realizados.
    
        Apesar do tipo "float" ocupar metade da memória consumida do que um tipo double, ele é menos utilizado.
    Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão
    decimal entre 6 e 7 digitos.

        Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos "short" e "byte",
    pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

        Da mesma forma, dificilmente utilizaremos o tipo "long", pois não é tão comum trabalharmos com valores
    tão grandes.

        Portanto, para representar números, na grande maioria das vezes utilizamos o tipo "int" para representar
    números inteiros ou "double" para representarmos números fracionados

        O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definção do tipo
    para uma variável. Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de
    um funcionário?
       */

       /*
!                   VARIÁVEIS E CONSTANTES

        Uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo.
    Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de 
    tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.
    
        No Java utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta
    referência pode ser redirecionada a outro valor,
    sendo portanto esta a causa do nome "variável", pois o valor pode variar.

!                   DECLARAÇÃO DE VARIÁVEIS

        Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Segundo as conveções
    em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

        A estrutura padrão para se declarar uma variável em Java sempre é:

        < Tipo > < nomeVariavel > < atribuicaoDeValorOpcional >

?        Exemplos abaixo:

            int idade; - Tipo "int", nome "idade", com nenhum valor atribuído. Como padrão o valor será "0".
            int anoFabricacao = 2021; - tipo "int", nome "anoFabricacao", com valor igual a "2021".
            double salarioMinimo = 2500.00; - tipo "double", nome "salarioMinimo", com valor igual a "2500.00".

!           Obs:  
        Em "float" e "double" o ponto( . ), assim como no padrão americano, tem como função fracionar os valores. 
    No Brasil nós utilizamos a vírgula( , ) para fracionar os valores. 
        Então nas linguagens de programação sempre utilizaremos o ponto( . ) para fracionar valores.

!       Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos.

?       Observe no exemplo abaixo:   
        */
    public static void main(String[] args) {
        byte idade = 123;

        short ano = 2021;

        int cep = 21070333; // Se começar com zero, talvez que ser outro tipo

        long cpf = 98765432109L; /* É obrigatório colocar o "L" pode ser em maiusculo ou minusculo ao final 
    dos números, para evitar erro de compilação, e o programa irá como padrão interpretar que a variável é 
    do tipo "int". E se começar com zero, talvez que ser outro tipo. */

        float pi = 3.14F; /* É obrigatório colocar o "F" pode ser em maiusculo ou minusculo ao final dos números
    para evitar erros de compilação, e o programa irá como padrão interpretar que a variável é do tipo "double".*/

        double salario = 1275.33;

        /*
        Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e 
    temos consciência de seu valor na aplicação. Mas cuidado!!
    
!              JAVA É FORTEMENTE "TIPADO"

?           Veja o cenário abaixo:

        TiposEVariaveis.java*/

        short numeroCurto = 1;

        int numeroNormal = numeroCurto; 
/*          Nesse caso o Java aceita essa lógica de variável, porque o "int" sempre
    comportará os valores de "short". */

//?     short numeroCurto2 = numeroNormal; 

/*          Já nesse caso o Java não irá aceitar essa lógica de variável e dará 
    erro, porque o "short" não comporta alguns valores de "int". Para corrigir esse erro podemos utilizar o recurso
    chamado de "cast", que irá converter (caso possível) o tipo mais abrangente, para o tipo mais específico.
    No caso ficaria como no exemplo abiaxo: */

        short numeroCurto2 = (short) numeroNormal; 
/*          Assim o erro de variável será corrigido. Essa é uma adaptação.
    Não é coerente fazermos isso com frequêcia, mas a linguagem irá nos dizer para converter o tipo para que 
    possamos ter uma precisão maior para uma precisão menor, nos temos que garantir ao programa que se acontecer
    algo inesperado, nós estamos cientes do porque. */  

        System.out.println(idade+", "+ano+", "+cep+", "+cpf+", "+pi+", "+salario+", "+numeroCurto2);

/*
!           ALTERANDO VALORES DE VARIÁVEIS

        Para alterarmos o valor de uma variável, nós não precisamos mais descrever o tipo da variável, apenas 
    chamamos a variável através de seu nome e após o sinal de " = " nós inserimos um novo valor.
    Por exemplo:
 */
        int anoFabricacao = 2019;
//!         Obs:
/*      Caso executarmos um retorno ou um println(), antes da linha de código que altera o valor da variável,
    o programa irá executar a variável com o valor inicial da variável. Por exemplo:
*/        
        System.out.println(anoFabricacao); // Nesse caso será impreso o valor de "2019".

        anoFabricacao = 2009; // Nesse exemplo nós alteramos o valor da variável de "2019" para "2009".

        System.out.println(anoFabricacao); // Nesse caso será impresso o valor de "2009".

/* 
!           CONSTANTES

        As Constantes são valores armazenados em memória que não podem ser modificados depois de declarados. Em
    Java, esses valores são representados pela palavra reservada "final", seguido do tipo.

        Por convenção, Constantes são sempre escritas em CAIXA ALTA.

?       Abaixo temos um exemplo explicativo sobre uso de variáveis e constantes:

*/
        int numero = 5; // Nesta linha é considerada como declaração de variável com o valor 5
        numero = 10; // Nesta linha alteramos o valor para 10

        System.out.println(numero);

//?       Agora para declararmos uma constante imutável devemos escrever da seguinte forma:

        final int NUMEROIMUTAVEL = 15; 
//      O "final" antes do tipo da variável, a transforma em uma constante, impossibilitando a alteração do valor.

//!        NUMEROIMUTAVEL = 20; 
//          Ao tentar alterar o valor da constante oo programa apresentará um erro. E não executará o programa.

        System.out.println(NUMEROIMUTAVEL);

/*
!           CONCLUSÃO

        Compreendemos que para declarar uma variável como uma constante, utilizamos a palavra "final", mas por
    convenção, esta variável deverá ser escrita em CAIXA ALTA.
 */

    }
}   
