package edu.piter.aula3java;

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
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 17 / 3;
        int restoDaDivisao = 17 % 3;
        double resultado = (10 * 7) + (20 / 4);
        System.out.println("Soma = "+soma+", subtração = "+subtracao+", multiplicação = "+multiplicacao+", divisão = "+divisao+", resto da divisão = "+restoDaDivisao+", resultado = "+resultado);
    }
}
