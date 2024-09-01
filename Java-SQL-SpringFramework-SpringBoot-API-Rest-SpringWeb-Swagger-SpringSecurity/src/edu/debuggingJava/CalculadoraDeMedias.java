package edu.debuggingJava;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] alunos = {"Piter", "Camila", "Lucas", "Bruna"};

        // Local do break point
        //int media = calculaMediaDaTurma(alunos, scanner);
        double media = calculaMediaDaTurma(alunos, scanner);

        //System.out.printf("Média da turma %d", media);
        System.out.printf("Média da turma %.1f", media);
    }
    // Para corrigir o bug todas as variáveis devem ser "double"
    //public static int calculaMediaDaTurma(String [] alunos, Scanner scanner) {
    public static double calculaMediaDaTurma(String [] alunos, Scanner scanner) {
        //int soma = 0;
        double soma = 0;
        for (String aluno: alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            //int nota = scanner.nextInt();
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
/*
Resultado = 7
Resultado real = 7.5

Para fazer uma depuração e analizar onde está ocorrendo o erro
nós devemos utilizar o "break point" onde a gente acredita que o
erro, essa exception ou inconcistência está ocorrendo.

Para rodar nosso programa no modo Debug, utilizamos a opção Debug
ao clicar no play para rodar o programa.
 */
