package edu.debuggingJava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }

    /* O método pode ou não ter o "public" antes do "satic",
    caso não tenha por padrão o Java tratará como se fosse "public".*/
    public static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }
    static void b(){
        System.out.println("Entrou no método b.");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }
    static void c(){
        System.out.println("Entrou no método c.");
        // Comando abaixo exibe a pilha de execução.
        // Comando "Thread.dumpStack();" é recomendado quando queremos executar uma depuração de código.
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
