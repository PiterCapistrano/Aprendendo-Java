# CONCEITO DE POO

    Você já ouviu falar a expressão linguagem de baixo e de alto nível?

    À medida que a tecnologia vem evoluindo, as linguagens de programação também, e é está transição natural que

determina quando estamos nos referindo a linguagem de baixo e alto nível.

## Baixo Nível:

    São linguagens que estão mais próxima da interpretação da máquina diante do algoritmo desenvolvido.

Exemplo: Linguagem Assembly e C.

## Alto Nível:

    São linguagens que disponibilizam uma proposta de sintaxe (forma de escrever processos para serem executados

pelo computador) mais próxima de interpretação humana. Exemplo: Java, JavaScript, Python e C++.

    Exemplo de um simples Hello World em Assembly versus Python:

## Assembly:

    section .text

        global _start

    _start:

        mov edx, len

        mov ecx, msg

        mov ebx, 1

        mov eax, 4

        int 0x80

        mov eax, 1

        int 0x80

    section .data

    msg     db      'Hello, World!',0xa

    len     equ     $ - msg

#

## Python:

print('Hello, World!')

#

    É bem notória a diferença entre as duas perspectivas de linguagem.

## Programação Estruturada:

    A programação estruturada é um paradigma de programação que visa melhorar a clareza, a qualidade e o tempo de

desenvolvimento de um programa de computador, fazendo uso extensivo das construções de fluxo de controle estruturado
de seleção (if / then / else) e repetição (while e for), estruturas de bloco e sub - rotinas.

    O que devemos ter em mente, é que na programação estruturada implementamos algoritimos com estruturas sequenciais

denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma
aplicação.

## Programação Orientada a Objetos:

    POO é um paradigma de programação baseada no conceito de "objetos", que podem conter dados na forma de campos,

também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

    O que precisamos entender, é que cada vez mais as linguagens se adequam ao  cenário real, proporcionando assim

que o programador desenvolva algoritimos mais próximo de fluxos comportamentais, logo tudo ao nosso redor é
representado como Objeto.

    Enquanto a programação estruturada é voltada a procedimentos e funções definidas pelo usuário, a progrmação

orientada a objetos é voltada a conceitos como o de classes e objetos.

}
