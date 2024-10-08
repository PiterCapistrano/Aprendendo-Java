package edu.aprendendoASintaxeJava.aula7java;

public class JavaDoc {
/*
!         JAVA DOCUMENTATION

?     Objetivo da Aula:

    Apresentar a ferramenta de documentaçao da linguagem e explorar como adicionar comentários em nossos arquivos.

?     Documentação:

    Uma das características da linguagem Java é que, desde suas primeiras versões, tinhamos em nossas mãos, uma
  documentação rica e detalhada dos recursos da linguagem.

    Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes
  bem específicas, sem nem mesmo escrever uma linha de código.

    Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível
  adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados
  nos projetos atuais.

?       Tags:

    Mas e quais as informações, que obtemos através de classes documentadas, na linguagem? Java Documentation é
  composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos
  de seus métodos e atributos conforme tabela abaixo:

?      Tag                              Descrição
     @autor                          Autor / Criador

     @version                        Versão do recurso disponibilizado

     @since                          Versão / Data de início da disponibilização do recurso

     @param                          Descrição dos parâmetros dos métodos criados

     @return                         Definição do tipo de retorno de um método

     @throws                         Se o método lança alduma exceção


    Abaixo, iremos ilustrar a classe Calculadora com um exemplo de documentação, destacando as tags mais utilizadas:
*/
}
/**
 * <h1>Calculadora</h1>
 * 
 * A calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Piter Capistrano
 * @version 1.0
 * @since 06/08/2024
 */

 class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar (int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(23, 27)); // Saída: 50
    }
 }
 /*
?       Tipos de Comentários:
*/
// Olá, eu sou um comentário em uma única linha.

/* Olá,
 * Eu sou um comentário
 * que posso ser mais detalhado
 * quando necessário
 */

/**
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */

 /*
  *   Um comentário, não possui a finalidade de amenizar um algoritmo não estruturado, conforme as convenções da
  * linguagem
  */

/*
 * Este método foi elaborado as pressas
 * por isso eu abreviei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou multiplicar
 * dois números
 */
class SomaMultiplica {
    public int somaMultiplica(int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }
    public static void main(String[] args) {
        SomaMultiplica somaMultiplica = new SomaMultiplica();
        System.out.println(somaMultiplica.somaMultiplica(20, 10, null)); // Saída = 30
        System.out.println(somaMultiplica.somaMultiplica(20, 10, "M")); // Saída = 200
    }
}
/*
!               JAVADOC

        Javadoc é um gerador de documentação criado pela Sun Microsystems, para documentar a API dos programas em
    Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações
    muitos simples, inseridas nos comentários do programa.

        Este sistema, é o padrão de documentação de classe em Java, onde muitas das IDEs desta linguagem irão
    automaticamente gerar um Javadoc em HTML.

?          Criando nossa Documentação no Formato HTML, para Disponibilizar via Web:
 */

 // No terminal execute o comando abaixo:

// javadoc -encoding UTF-8 -docecoding ISO-8859-1 -d ../docs src/*.java