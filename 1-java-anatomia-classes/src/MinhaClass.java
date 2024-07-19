//!     ANATOMIA DAS CLASSES

   /* Uma classe bem estruturada não quer guerra com ninguém

    A escrita de códigos de um programa é feito através da composição de 
palavras pré-definidas pela linguagem com as expressões que utilizamos 
para determinar o nome dos nossos arquivos, classe, atributos e métodos.

    É muito comum mesclarmos expressões no idioma americano com o nosso
vocabulário, dependendo da cultura da empresa. Existem projetos que recomendam que toda a implementação
do seu programa seja escrita na língua inglesa.

    Sintaxe de delaração de uma nova classe:
*/

public class MinhaClass{
    
    //! SEU CÓDIGO AQUI

    /* public class =  para classe padrão

       MinhaClase = nome do arquivo, por convenção para todos os arquivos de códigos criados em Java
    as primeiras letras de cada palavra devem ser em maiuscula. 
    
        Se a classe for uma classe executável, caso ela tenha a capacidade de realizar uma
    inicialização do projeto ou de forma indempendente, ela precisa ter um método especial/principal 
    e esse método é denominda de "main", esse método "main" terá uma caracteristica única, na sua representação
    de inicialização. Com isso ele precisa seguir um padrãocomo o abaixo:
    */
    
    public static void main(String [] args) {

    // void = ele não retorna nada, ele só executa(um executável vazio, sem retorno)

    /* main () = é o nome do método e espera dentro de um parâmetro "()", um parâmetro especial do tipo "String"
    e determinamos esse parâmetro como um array "[]" e o parâmetro irá chamar o "args" que é uma abreviação de
    argumentos ou parâmetros
    */
    
    /* E dentro desse método ele também vai ter um corpo "{ }", o corpo é tudo que está entre as chaves "{ }" */

    System.out.println("Hello World!");

    /* System = é uma classe é uma classe do sistema que tem inúmeras operações de input(entrada) e output(saida)
     dentro da aplicação.

     out = saida de algo

     println() = é um método de impressão que pode ser uma String(texto), um int(número inteiro) e etc... 
    e irá imprimir essa saida no consoleLog. 
    E a impressão virá como parâmetro "()", assim como exigido nos métodos
    */

   

//!       PADRÃO DE NOMENCLATURA

  /*  Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. 
Esses padrões estão expressos nos itens abaixo:

- Arquivo.java: Todo aqruivo.java deve começar com letra MAIÚSCULA.
Se a palavra for composta a segunda palavra tambem deve ser MAIÚSCULA, exemplo:
Calculadora.java, ClculadoraCientifica.java

 - Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

  ? "arquivo: CalculadoraCientifica.java


? public class  CalculadoraCientifica {

    
? }"

- Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta,
a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoNascimento. O nome dessa
prática para nomear variáveis dessa forma se chama "camelCase".

Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração 
de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará 
seu valor, logo, determinamos como escrita o código abaixo:

? String BR = "Brasil"
? double PI = 3.14
? int ESTADOS_BRASILEIROS = 27
? int ANO_2000 = 2000

Na convenção de variáveis imutáveis, as letras deveram ser escritas todas em MAIÚSCULAS e as palavras separadas
por underline( _ ), como naS variáveIS acima "ESTADOS_BRASILEIROS" e "ANO_2000".
*/

    /* 
    ? int ano = 2021;

    ?  ano = 2022;

     Variável sem nenhuma expressão antes do tipo da variável, tem como padrão ser uma variável mutável(que 
    pode ser alterada a qualquer momento). E para ser alterada eu não preciso mais descrever o tipo da 
    variável, devo apenas chamar a variável e alterar a informação após a igualdade!
     

    ? final String BR = "Brasil";

    ? BR = "Brazil";

    final = palavra reservada com o nome da variável toda em MAIÚSCULA, é uma variável imutável(não pode ser 
     alterada)
     */
    
     /* Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir
     algumas regras da linguagem.

     - Deve conter apenas letras, _(underline), ou $, ou os números de 0 a 9;
     - Deve obrigatóriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
     - Deve iniciar com uma letra minúscula (boa prática);
     - Não pode conter espaços;
     - Não podemos usar palavras-chave da linguagem;
     - O nome deve ser único dentro de um escopo.
      */

      /*
      ! DECLARAÇÕES INVÁLIDAS DE VARIÁVEIS

      ? int numero&um = 1; Os únicos símbolos permitidos são _ e $;
      ? int 1numero = 1; Uma variável não pode começar com número;
      ? int numero um = 1; Não pode ter espaço no nome da variável
      ? int long = 1; long faz parte das palavras reservadas da linguagem.

      ! DECLARAÇÕES VÁLIDAS DE VARIÁVEIS

       int numero$um = 1;
       int numero1 = 1;
       int numeroum = 1;
       int longo = 1; 
       */

       
        
    }

//! CLASSE CRIADA E EXECUTÁVEL, IMPRIMINDO A MENSAGEM DO MÉTODO "println()"
}

/*
       ! DECLARANDO VARIÁVEIS E MÉTODOS/FUNÇÕES

      ? Diferença entre métodos e funções:

        - Funções são blocos de código independentes que realizam uma tarefa específica e não estão associadas
         a uma classe ou objeto.

        - Métodos são funções associadas a classes ou objetos e podem operar sobre os dados desses objetos, 
        tendo acesso ao estado interno e podendo modificar os atributos do objeto.

        Como identificar entre declaração de variáveis e métodos em nosso programa?
        Existe uma estrutura comum para ambas as finalidades, exemplo:

       ! - DECLARAR UMA VARIÁVEL EM Java SEGUE SEMPRE A SEGUINTE ESTRUTURA:

        Estrutura:

       ? Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

        ! OBS:
         Toda variável na linguagem Java, terá uma necessidade de dizermos o tipo, um nome bem definido e
        depois podemos atribuir um valor a esta variável (esta atribuição em alguns casos pode ser opcional)

         Exemplo:

       ? int idade = 23;
       ? double altura = 1.82;
       ? Dog spike; (observe que para a classe Dog informamos o nome da variável, porem não inserimos nenhum 
       ? valor)

        */

class InnerMinhaClass {
    public static void main (String [] args) {

        String meuNome = "Piter";

        int anoNascimento = 2022;

        boolean verdeira = true; 
        boolean falso = false;
        boolean semValor; //em caso de boolean o valor da variável é opcional
        semValor = true;

        anoNascimento = 1992; /*  podemos alterar o valor da variável sem especiificar o tipo, 
        pois ele já foi definido anteriormente, ao escrever a variável  */

        String primeiroNome = "Piter";
        String segundoNome = "Capistrano";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(meuNome+", "+anoNascimento+", "+verdeira+", "+falso+" e "+semValor);
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
        System.out.println(nomeCompleto);

        /*
         - No primeiro "System.out.println()" dentro do parâmetro do println(), nós podemos contatenar as "String"
         utilizando o sinal de "+", a String ", " para acrescentar virgula e espaço e a String " e " para 
         acrescentar um espaço, um "e" e outro espaço, para separar as variáveis.  

         - No segundo "System.out.println()" dentro do parâmetro do println(), nós chamamos o método/função
         nomeCompleto(), que utiliza como parâmetro os valores das variáveis primeiroNome e segundoNome, para
         que retorne o primeiro nome, contatenado com um espaço em branco e contatenado com o segundo nome.

         -Nós podemos também como no terceiro "System.out.println()" dentro do parâmetro do println(), 
         ao invés de chamar o método diretamente, nós podemos criar uma variável que chame o método/função
         nomeCompleto() e utilizar essa varável para retornar o método.
         */

         //! DE UM "RUN" NA CLASSE "InnerMinhaClass" PARA VER O RESULTADO DO CÓDIGO ACIMA

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

        /* 
         Para criar um método eu devo informar o tipo de retorno do método (que nesse caso foi do tipo "String") 
         e os parâmetros (caso tenha e for mais do que um) devem ser separados por virgulas (nesse caso 
         utilizamos os parâmetros de tipo "String" primeiroNome e segundoNome).  

         return = palavra reservada com o objetivo de retornar algo a um método

         concat = método concatenar (ou seja, juntar) duas strings. Ele é um método da classe String e 
         retorna uma nova string que é a junção da string original com a string fornecida como argumento. 
         Esse método é útil quando você precisa combinar duas ou mais strings em uma única string.

         str = Parâmetro de uma String
        */
    }
}

/*
   ! - DECLARANDO METODOS EM Java SEGUE UMA ESTRUTURA BEM SIMPLES:

    Estrutura:

   ? TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

   ! OBS: PARÂMETROS PODEM SER OPCIONAIS

    Exemplo:

   ? int somar (int numeroUm, int numero2) 
   ? Obs: para somar eu preciso de no mínimo 2 parâmetros

   ? String formatarCep(long cep)
   ? Obs: nesse caso eu recebo um parametro numérico "long" e retorno um tipo "String". Esse método pode ser
   ? utilizado para lançar informações complexas em banco de dados.

 */