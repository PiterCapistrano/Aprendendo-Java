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
    por uma questão de compatibilidade da JVM(Java Virtual Machine), ela sempre busca converter tipos literais, 
    por exemplo "100", mesmo sendo um "byte" ele tenta converter para "int", e no caso de "30.000", mesmo sendo 
    um "short" ele já tenta converter para "int", acima de "2.147.483.647" obviamente ele vai tentar converter 
    para "long", mas na linguagem Java é muito comum nós encontrarmos opções numéricas do tipo "int". Então como 
    padrão nós utilizamos na maioria dos casos de tipos numéricos a opção "int".

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
!           CONCLUSÃO SOBRE CONSTANTES

        Compreendemos que para declarar uma variável como uma constante, utilizamos a palavra "final", mas por
    convenção, esta variável deverá ser escrita em CAIXA ALTA.
*/

    }
}
/*
!           TIPOS BOOLEAN E CHAR
*/
class AboutBoolean {
    public static void main(String[] args) {
/*
!           TIPO BOOLEAN:

        O tipo "boolean" em Java é um tipo de dado primitivo que representa dois valores possíveis: "true" e "false".
    Ele é usado principalmente para controle de fluxos de execução e avaliar condições em estrutura de controle,
    como "if", "while", e "for".

?       Características do Tipo "boolean":

        Valores possíveis: "true" ou "false".

?        Tamanho:

        O tamanho exato de um "boolean" não é especificado pela linguagem Java, mas ele é geralmente representado
    por um único bit. Iternamente, no entanto, ele pode ser armazenado como um byte para facilitar a manipulação
    ela JVM(Java Virtual Machine).

?       Uso:

        - Controle de Fluxo: Usado em expressões condicionais para determinar o fluxo do programa.

        - Lógica: Usado em operações lógicas, como AND ("&"), OR ("||"), e NOT ("!").

!           EXEMPLO DE USO:
 */
//?     Estruturas de controle:

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        if (isJavaFun) {
            System.out.println("java é divertido!");
        } else {
            System.out.println("Java não é divertido!");
        }

        if (isFishTasty) {
            System.out.println("Peixe é saboroso!");
        } else {
            System.out.println("Peixo não é saboroso!");
        }

//?     Operações Lógicas:

        boolean a = true;

        boolean b = false;

        boolean c = a && b; /* "c" é false, porque as variáveis são diferentes uma é "true" e a outra "false". 
        Para "c" ser igual a "true" as duas variáveis teriam que ser "true", "a = true;" e "b = true;*/

        boolean d = a || b; // "d" é true, porque uma das variáveis é igual a "true"

        boolean e = !a; 
        // "e" é igual a false, porque o sinal de " ! " significa "oposto", e o oposto de "true" é "false".

        System.out.println(a+", "+b+", "+c+", "+d+", "+e);

//?     Em Laços de Repetição:

        boolean condition = true;

        while (condition) {
            System.out.println("Isso será impresso uma vez.");
            condition = false; // Isso evita o loop infinito!
        }        
    }
}
//!         EXEMPLOS PRÁTICOS

class ExemposPraticosBoolean {
public static void main(String[] args){

//?    Validação Simples:

        int age = 20;
        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

//?    Autenticação de usuário Simples:

        String userName = "admin";
        String password = "123";

        boolean isAuthenticated = userName.equals("admin") && password.equals("123");

        if (isAuthenticated) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
/*
?       Considerações sobre o tipo "boolean"

- Eficiência: O tipo "boolean" é altamente eficiente para apresentar estados binários.

- Valores Padrão: O valor padrão de um "boolean" não inicializado é "false".

- Uso em Collections: Em coleções Java, como "ArrayList", os valores booleanos devem ser armazenados
usando wrapped class "Boolean"

?       Wrapper Class "Boolean"

Para usar booleanos em coleções ou quando é necessária uma referência a um objeto, a classe wrapper "Boolean"
é usada:

Boolean isjavaFun = Boolean.TRUE;
Boolean isFishTasty = Boolean.FALSE;

ArrayList<Boolean> booleanList = new ArrayList<>();
booleanList.add(isjavaFun);
booleanList.add(isFishTasty);
System.out.println(booleanList);

A classe "Boolean" também fornece métodos utilitários, como "parseBoolean" e "valueOf":

boolean parsedBoolean = Boolean.parseBoolean("true"); - true
Boolean booleanObject = Boolean.valueOf("false"); - false

!           CONCLUSÃO SOBRE "BOOLEAN"

O tipo "boolean" é essencial em Java para controle de fluxo e lógica de programação, sendo usado em
expressões condicionai, laços de repetição e operações lógicas. Sua simplicidade e eficiência o tornam uma
ferramenta fundamental na linguagem.    
*/    

    }
}

class AboutChar {
    public static void main(String[] args) {
/*
!           TIPO CHAR

        O tipo "char" em Javaé um tipo de dado primitivo que representa um único caractere. Ele é usado para
    armazenar caracteres individuais como letras, dígitos, símbolos e caracteres de controle.

?       Características do Tipo "char"

        Tamanho: "char" é um tipo de 16 bits (2 bytes) que segue a codificação Unicode. Isso significa que ele
    pode representar 2^16 (ou 65.536) caracteres distintos.

        Valores: Pode armazenar qualquer caractere do conjunto Unicode, que inclui letras, dígitos, símbolos
    e caracteres de controle. Os valores vão de "\u0000" (ou 0) a "\uffff" (ou 65.535).

        Representação: Pode ser representando diretamente entre aspas simples ("'a'", "'1'", "'@'").
    Pode ser representado usando códigos Unicode ("'\u0041'" para "'A'").

!           EXEMPLOS DE USO

?       Declaração e Inicialização:
 */
        char letterA = 'A';
        char digit1 = '1';
        char symbolAt = '@';
        char unicodeChar = '\u0041'; // 'A'

        System.out.println(letterA+", "+digit1+", "+symbolAt+", "+unicodeChar);

/*
?       Operações com "char":
*/      
        char letterB = (char)(letterA + 1); // 'B'
        System.out.println(letterB);
/*
?       Usos Comuns:

 Em estruturas de controle:
*/
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("Excelente");
        } else if (grade == 'B') {
            System.out.println("Good!");
        } else {
            System.out.println("Keep trying!");
        }
/*
?       Trabalhando com Strings: 
*/
        String greeting = "Hello";
        char firstChar = greeting.charAt(0); // (0) = 'H', (1) = 'e', (2) = 'l', (3) = 'l', (4) = 'o'.
        System.out.println(greeting+", "+firstChar);
/*
!               CARACTERES ESPECIAIS E DE ESCAPE

 Caracteres de escape são usados para apresentar caracteres especiais que não podem ser
digitados diretamente. Alguns exemplos incluem:
 
 - '\n' (nova linha)

 - '\t' (tabulação)

 - '\'' (aspas simples)

 - '\"' (aspas duplas)

 - '\\' (barra invertida)

 - '\u263A' (caractere Unicode)
*/        
        char newLine = '\n';
        char tab = '\t';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';
        char unicodeExample = '\u263A'; // ( ? )

        System.out.println("Hello"+newLine+"World!"+tab+" aspas simples "+singleQuote+" aspas duplas "+doubleQuote+" barra invertida "+backslash+" Exemplo de unicode "+unicodeExample);
/*
!               CONVERSÃO ENTRE "CHAR" E INTEIROS

?           Conversão Implícita:

 - O "char" pode ser tratado como um número inteiro(seu valor Unicode)

 - Operações aritméticas podem ser realizadas diretamente.
*/        

        char c = 'A';
        int charCode = c; // 65
        System.out.println(charCode);
/*
!               EXEMPLOS PRÁTICOS:

?           Iterar Sobre Caracteres:
*/
        for (char d = 'A'; d <= 'Z'; d++){
            System.out.println(d + " "); // Imprime A B C D... Z
        }
/*
?           Verificar Tipo de Caractere:
*/        
        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " é um dígito.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " é uma letra.");
        } else {
            System.out.println(ch + " é um símbolo.");
        }
/*
!               CONCLUSÃO SOBRE "CHAR"

 O tipo "char" é fundamental para manipulação de caracteres em Java. Ele permite representar e operar
diretamente com caracteres individuais, suportando uma ampla gama de símbolos graças à codificação Unicode.
O "char" é utilizado frequentemente em manipulações de texto, validação de entrada e operações que envolvem
caracteres únicos.
*/
    }
}

/**
 * AboutStrings
 */
class AboutStrings {
    public static void main(String[] args) {
/*
!               CLASSE STRING

        O tipo "String" em Java é uma classe que representa uma sequência de caracteres. Ao contrário dos tipos
    primitivos como "int" e "char", "String" é uma classe e, portanto, possui métodos e propriedades que podem
    ser utilizados para manipular sequências de caracteres.

!               CARACTERÍSTICAS DO TIPO "STRING"

?           Imutabilidade:

        Uma "String" em Java é imutável. Uma vez que um objeto "String" é criado, seu valor não pode ser alterado.
    Qualquer operação que parece modificar uma "String" na verdade cria uma nova "String".

?           Criação de Strings:

        Strings podem ser criadas de várias maneiras:
*/
        String s1 = "Hello";
        String s2 = new String("World");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String s3 = new String(charArray);
        System.out.println(s1+", "+s2+", "+charArray+", "+s3);
/* 
?           Concatenação:

        Strings podem ser concatenadas usando o operador " + " ou o método " concat ":
*/
        String s4 = s1 + " " + s2; // " Hello World "
        String s5 = s1.concat(" ").concat(s2); // " Hello World "
        System.out.println(s4);
        System.out.println(s5);
/*
?           Comprimento:

        O comprimento de uma "String" pode ser obtido usando o método "length":
*/
        int len = s1.length(); // Quantidade de caracteres da variável, que nesse caso é = 5
        System.out.println(len);
/*
?           Comparação:

        Comparação de strings pode ser feita usando "equals", "equalsIgnoreCase", "compareTo" e 
    "compareToIgnoreCase":
*/
        boolean isEqual = s1.equals(s2); // resultado = false. Porque o valor de s1 é diferente do valor de s2.
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase("hello"); // resultado = true. Porque o valor de s1 é igual a "Hello".
        int comparison = s1.compareTo(s2); // possiveis resultados em valores numéricos = negativo, zero ou positivo.
        System.out.println(isEqual+", "+isEqualIgnoreCase+", "+comparison);
/*
!               MÉTODOS COMUNS DA CLASSE "STRING"

?           charAt(int index):

        Retorna o caractere na posição especificada.
*/
        char ch = s1.charAt(1); 
        // A impressão será " e " por que o número "1" representa o segundo caractere do valor da variável "s1".
        System.out.println(ch);
/*
?           substring(int beginIndex, int endIndex):

        Retorna uma nova string que é uma subsequência da string original.
*/        
        String sub = s1.substring(1, 4);
/*      A impressão será " ell " por que o número "1" representa o segundo caractere e inicia a leitura,
    e o número "4" representa o final da impressão, que para no quarto caractere que é "l" do valor da variável "s1".
*/
        System.out.println(sub);
/*
?           toUpperCase() e toLowerCase():

        Retorna uma nova string com todos os caracteres em maiúsculas ou minúsculas.
*/
        String upper = s1.toUpperCase(); // Será impresso "HELLO", tudo em maiúsculo.
        String lower = s1.toLowerCase(); // Será impresso "hello", tudo em minúsculo.
        System.out.println(upper+", "+lower);
/*
?           trim():

        Remove espaços em branco no início e no fim da string.
*/
        String trimmed = "        Hello         ".trim(); // Será impresso "Hello" sem os espaços em branco.
        String semTrim = "        Hello         ";
        System.out.println(trimmed+","+semTrim);
/*
?           replace(char oldChar, char newChar):

        Substitui todas as ocorrências de um caractere por outro.
*/
        String replaced = s1.replace('l', 's'); 
        // Substitui os caracteres "l" do valor da String por "s".
        System.out.println(replaced);
/*
?           split(String regex):

        Divide a string em um array de strings com base em um delimitador especificado.
*/
        String[] parts = "Java is fun".split(" "); 
// O método acima retorna uma lista onde o limitador é o espaço formando a seguinte lista ["Java", "is", "fun"].
        System.out.println(parts);
    }
}
/*
!               EXEMPLOS PRÁTICOS

?           Verificar Palíndromo:

        A função "isPalindrome" verifica se uma dada string é um palíndromo. Um palíndromo é uma palavra, frase, 
    número ou qualquer outra sequência de caracteres que lida da mesma forma de trás para frente (ignorando 
    espaços, pontuações e maiúsculas/minúsculas).
*/
class  PalindromeExample {
    public static void main(String[] args) {
        PalindromeExample example = new PalindromeExample();

        System.out.println(example.isPalindrome("radar")); // true
        System.out.println(example.isPalindrome("hello")); // false
        System.out.println(example.isPalindrome("Level")); // false
        System.out.println(example.isPalindrome("world")); // false
    }

    public boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
/*
?           Explicação do Resultado:

        - A função recebe uma string "s" como parâmetro.

        - Usa "StringBuilder" para criar uma nova instância com a string "s".

        - O método "reverse()" de "StringBuilder" inverte a sequência de caracteres.

        - "toString()" converte o "StringBuilder" invertido de volta para uma string normal.

        - Armazena essa string invertida na variável "reversed".

        - A função compara a string original "s" com a string invertida "reserved" usando o método "equals".

        - "s.equals(reversed)" retorna "true" se "s" e "reversed" forem iguais, ou seja, se "s" for uma políndromo,
        e "false" caso contrário.

?           Limitações:

        A função na forma apresentada considera a string como sensível a maiúsculas e não ignora espaços ou
    pontuações. Para considerar essas variações, a função pode ser modificada para normalizar a string antes de
    verificar o palíndromo, por exemplo:
*/
class  PalindromeExample2 {
    public static void main(String[] args) {
        PalindromeExample2 example = new PalindromeExample2();

        System.out.println(example.isPalindrome("radar")); // true
        System.out.println(example.isPalindrome("hello")); // false
        System.out.println(example.isPalindrome("Level")); // true
        System.out.println(example.isPalindrome("world")); // false
    }
    public boolean isPalindrome(String s) {
        String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
}
/*
?           Explicação da Versão Modiicada:

        - "replaceAll("[^a-zA-Z0-9]", "")" remove todos os caracteres não alfanuméricos.

        - "toLowerCase()" converte a string para minúsculas, tornando a comparação insensível a maiúsculas/minúsculas.

        Essa versão lidará com entradas como "A man, a plan, a canal, Panama!" corretamente.

! -------------------------------------------------------------------------------------------------------------------------

?           Contar Ocorrências de um Caractere:

        A função countOccurrences conta o número de vezes que um determinado caractere (ch) aparece em uma 
    string (s).
*/
class CountOccurrencesExample {
    public static void main(String[] args) {
        CountOccurrencesExample example = new CountOccurrencesExample();
        
        System.out.println(example.countOccurrences("hello", 'l')); // 2
        System.out.println(example.countOccurrences("hello", 'o')); // 1
        System.out.println(example.countOccurrences("hello", 'h')); // 1
        System.out.println(example.countOccurrences("hello", 'a')); // 0
    }

    public int countOccurrences(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
/*
?           Explicação do Resultado:

        - A função inicia um contador "count" com valor 0.

        - A função usa um loop "for" que vai desde o índice 0 até o último índice da string "s"("s.length() - 1").

        - Em cada interação, a função obtém o caractere na posição "i" usando "s.charAt(i)".

        - Se o caractere na posição "i" for igual ao caractere "ch", a função incrementa o contador "count" em 1.

        - Após iterar por todos os caracteres da string "s", a função retorna o valor do contador "count", que
        representa o número de ocorrências do caractere "ch" na string "s".

?           Pontos Importantes:

        - Complexidade de Tempo: A função tem complexidade de tempo O(n), onde n é o comprimento da string "s".
        Isso porque ela percorre todos os caracteres da string de uma vez.

        - Complexidade de Espaço: A função tem complexidade de espaço O(1), pois usa uma quantidade constante de
        espaço adicional ("count" e variáveis de loop).

        Essa função é útil para contagem de caracteres em strings, como verificar a frenquência de letras,
    Caracteres especiais ou qualquer outro símbolo em uma dada string.

?           Contar Ocorrências de um Caractere:

        A função countOccurrences conta o número de vezes que um determinado caractere (ch) aparece em uma 
    string (s).

! ----------------------------------------------------------------------------------------------------------------

?           Converter String para Array de Caracteres:

        A função demonstrada realiza a conversão de uma string (String s) em um array de caracteres (char[] 
    charArray) e, em seguida, itera sobre cada caractere desse array, imprimindo-os.
*/
class CharArrayExample {
    public static void main(String[] args) {
        String s = "Hello";
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.print(c); // H e l l o
        }
    }
}
/*
?           Explicação do Resultado:

    - O método toCharArray() converte a string "Hello" em um array de caracteres {'H', 'e', 'l', 'l', 'o'}.

    - O loop for-each itera sobre cada caractere do array e os imprime um por um.

    - Como System.out.print(c) é utilizado (ao invés de System.out.println(c)), os caracteres são impressos na 
    mesma linha, resultando na saída contínua de "Hello".Explicação do Resultado

?           Pontos Importantes:
    - toCharArray(): Este método é útil quando você precisa manipular ou iterar sobre os caracteres individuais 
    de uma string.

    - for-each Loop: O loop for-each simplifica a iteração sobre arrays e coleções, tornando o código mais 
    legível.

    - System.out.print() vs System.out.println(): System.out.print() imprime sem adicionar uma nova linha ao 
    final, enquanto System.out.println() imprime e adiciona uma nova linha.

    Essa técnica é frequentemente utilizada quando é necessário acessar ou processar cada caractere de uma 
    string de forma independente.

! ------------------------------------------------------------------------------------------------------------------
    
?           Formatar Strings:

        A função demonstrada formata uma string com placeholders ("%s" e "%d") preenchidos com valores específicos
    de variáveis ("name" e "age"), e em seguida, imprime a string formatada.
 */
class StringFormatExample {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted); // Name: John, Age: 30
    }
}
/*
?           Explicação do Resultado:

        - O método "String.format()" substitui os placeholders "%s" e "%d" pelos valores das variáveis "name" e 
    "age", respectivamente.

        - A string resultante "Name: John, Age: 30" é então impressa no console.

?           Pontos importantes:

        - String.format(): Este método é uma maneira eficiente e legível de construir strings complexas com
    variáveis. É especialmente útil quando você precisa construir strings com múltiplos valores dinâmicos.

?           Placeholders:

        - "%s" é utilizado para valores de String.

        - "%d" é utilizado para valores de inteiros.

        - "%f" é utilizado para valores de números de ponto flutuante.

        - "%c" é utilizado para valores de caractere.

        - "%b" é utilizado para valores de booleano.

        - "%x" é utilizado para valores de número hexadecimal.

        - "%o" é utilizado para valores de número octal.

        - "%e" é utilizado para valores de notação cientifica.

        - "%g" é utilizado para converter o valor para o "%f" ou "%e", o que for mais curto.

        - "%h" é utilizado para valores de hash do objeto(retornado pelo método "hashCode()")

        - "%t"  é utilizado para valores de tempo (data/hora). Alguns exemplos abaixo:
                
            - %tY: Ano completo

            - %tm: Mês (01 a 12)

            - %td: Dia do mês (01 a 31)

            - %tH: Hora (00 a 23)

            - %tM: Minuto (00 a 59)

            - %tS: Segundo (00 a 59)

            - %tL: Milissegundos (000 a 999)

            - %tB: Nome completo do mês

            - %ta: Abreviação do dia da semana

?           Legibilidade:

        Utilizar "String.format()" torna o código mais legível e fácil de entender, especialmente quando se trata
    de construir strings complexas.

        Esta técnica é amplamente utilizada para gerar mensagens, logs, e outros tipos de saídas de texto formatado
    de maneira clara e concisa.
    
!               CONCLUSÃO SOBRE A CLASSE STRING

        A classe "String" é uma das classes mais usadas em Java e oferece uma vasta gama de métodos para manipulação
    e processamento de sequências de caracteres. Sua imutabilidade garante a segurança e consistência dos dados,
    enquanto seus métodos facilitam operações comuns como busca, substituição, divisão e formatação de strings.
*/