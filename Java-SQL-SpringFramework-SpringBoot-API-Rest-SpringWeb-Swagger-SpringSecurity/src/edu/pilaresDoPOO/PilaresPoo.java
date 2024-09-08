package edu.pilaresDoPOO;
 
public class PilaresPoo {
/*
!       PILARES DA POO

    Programação orientada a objetos (POO, ou OOP segundo as siglas em inglês) é um paradigma de programação baseada 
  no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e código,
  na forma de procedimentos, também conhecidos como métodos.

    Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária,
  Aluno, Veículo, Transferência etc.

    A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido
  a possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do
  mundo real.

    Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como "Os quatro 
  pilares da orientação a objetos":

    - Encapsulamento: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos
  com finalidades específicas que complementa uma ação em nossa aplicação.
    Exemplo: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a 
  partida e a "magia" acontece.

    - Herança: Características e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia
  de objetos.
    Exemplo: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como
  acelarar, frear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando 
  uma classe "Veiculo" para que seja herdada por Carro e Motocicleta.

    - Abstração: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
    Exemplo: Veículo determina duas ações como acelerar e frear, logo estes comportamentos deverão ser "abstratos"
  pois existem mais de uma maneira de se realizar a mesma operação. (ver Polimorfismo).

    - Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação.
    Exemplo: Veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos
  nos referindo a "Carro" ou "Motocicleta" para determinar a lógica de aceleração e frenagem dos respectivos veículos.

?     Exemplo Prático:
*/
}

class Carro extends Veiculo { 
  // Ao extender a classe Carro a classe Veiculo, eu consigo herdar as funções da classe Veículo e utilizar essas funções na Classe Carro
  // Esse é o conceito de "Herança"
  public void ligar (){ // Exemplo de Encapsulamento - Funções privadas adicionadas em uma função publica principal
    confereCambio();
    confereCombustivel();
    System.out.println("Carro ligado!");
  }
  private void confereCombustivel(){
    System.out.println("Conferindo combustivel");
  }
    private void confereCambio(){
    System.out.println("Conferindo se cambio está em P");
  }
}

class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("8454856");
    //jeep.ligar();

    Moto z400 = new Moto();
    z400.setChassi("4684656");
    //z400.ligar();

    Veiculo coringa = jeep; // Concepção de polimorfismo junto com abstração
    coringa.ligar();
  }
}

class Moto extends Veiculo {
  @Override
  public void ligar(){ 
  /* Função obrigatória, por que a classe "Moto" extende a classe "Veículo" e a classe Veículo obriga a criação 
  da função ligar()
  */
    System.out.println("Moto ligada!");
  }
}

abstract class Veiculo { 
  /* A classe Veículo deve ser abstrata porque não sabemos como as coisas acontecem, mas todas as classe que 
   se extendem a classe Veículo tem como função "ligar()."
  */
  private String chassi;

  public String getChassi(){
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }
  public abstract void ligar();
  /* Esse método também deve ser abstrato porque não sabemos o que o Veículo precisa para ligar, mas sabemos que 
  ele liga por ser um veículo
*/
}

/*
?     Em Prática

    Para ilustrar a proposta de POO no nosso quotidiano, vamos simular algumas funcionalidades dos aplicativos de
  mensagens instantâneas pela internet.

    "MSN Menssenger" foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu
  a 22 julho de 1999, anunciando-se como um serviço que permitia falar com uma pessoa através de conversas instantâneas
  pela internet. Ao longo dos anos surgiram novos serviços de  mensagens pela internet como Facebook Menssenger e
  o VKontakte Telegram.

    Vamos descrever em UML e depois em código algumas das principais funcionalidades de qualquer serviço de comunicação
  instantânea pela internet, inicialmente pelo MSN Messenger e depois inserindo os demais, considerado os princípios
  de POO.
*/

class MSNMenssenger {
  public void enviarMensagem(){
    System.out.println("Enviando mensagem");
  }
  public void receberMensagem(){
    System.out.println("Recebendo mensagem");
  }
  public void validarConectadoInternet(){
    System.out.println("Validando se está conectado a internet");
  }
  public void salvarHistoricoMensagem(){
    System.out.println("Salvando o histórico da mensagem");
  }
}
/*
?     Pontos de Atenção

    - Todos os métodos da classe são "public" (tudo realmente precisa estar visível?)

    - Só existe uma única forma de se comunicar via internet (como ter novas formas de se comunicar mantendo a
    proposta central?)
 */