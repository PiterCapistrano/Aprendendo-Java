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

    validarConectadoInternet(); // Encapsulamento da função

    System.out.println("Enviando mensagem");

    salvarHistoricoMensagem(); // Encapsulamento da função
  }
  public void receberMensagem(){
    System.out.println("Recebendo mensagem");
  }
  private void validarConectadoInternet(){
    System.out.println("Validando se está conectado a internet"); //Tornando metódo privado para Encapsular
  }
  private void salvarHistoricoMensagem(){
    System.out.println("Salvando o histórico da mensagem"); //Tornando metódo privado para Encapsular
  }
}
/*
?     Pontos de Atenção

    - Todos os métodos da classe são "public" (tudo realmente precisa estar visível?)

    - Só existe uma única forma de se comunicar via internet (como ter novas formas de se comunicar mantendo a
    proposta central?)

!       ENCAPSULAMENTO

?     Nem tudo precisa ser ou estar disponível para todos

    Já imaginou você instalar o MSN Messenger e ao querer enviar uma mensagem, te fosse solicitado verificar se o
  computador está conectado a internet e depois, pedir para você salvar a mensagem no histórico? Ou, se ao tentar
  enviar um SMS pelo celular, primeiro você precisasse consultar manualmente o seu saldo?

    Acredito que não seria uma experiência tão agradável de ser executada recorrentemente por nós usuários.

    Mesmo ainda sendo necessária algumas etapas nos processos citados, não é um requisito uma visibilidade pública,
  isso quer dizer que, além da própria classe que possui a responsabilidades de uma determinada ação.

    Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem,
  logo, as demais funcionalidades poderão ser consideradas privadas (private). E é ai que se caracteriza a necessidade
  do pilar de Encapsulamento, o que esconder?

    Vejamos a refatoração abaixo da nossa classe MSN Messenger
 */

//? Exemplo sem Encapsulamento:
class ComputadorPedrinho{
  public static void main(String[] args) {
    // Abrindo MSN Messenger
    MSNMenssenger msn = new MSNMenssenger();

    //msn.validarConectadoInternet();
    msn.enviarMensagem();
    //msn.salvarHistoricoMensagem();

    msn.receberMensagem();
  }
}

//? Exemplo com Encapsulamento:
class ComputadorPedrinhoEncapsulado{
  public static void main(String[] args) {
    // Abrindo MSN Messenger
    MSNMenssenger msn = new MSNMenssenger();

    msn.enviarMensagem();

    msn.receberMensagem();
  }
}
/*
!         HERANÇA

?     Nem tudo se copia, as vezes se herda

    Já imaginou você ter sido classificado para a vaga de emprego de seus sonhos e como desafio, justamente você
  criar um diagrama de classes e em seguida os repectivos arquivos .java que apresentasse os fundamentos de POO 
  com base no contexto de vários aplicativos de mensagens instantâneas?

    Com base MSNMessenger, você já poderia dar os primeiros passo para se dar bem no processo seletivo, simplesmente,
  copiar e colar a estrutura para as novas classes "FacebookMessenger", "Telegram" e "BINGO" !!!

  ? Lamentamos dizer, mas esta não seria a melhor alternativa para a proposta citada acima.

    Além de uma compreensão do desafio, é necessário, que tenhamos domínio dos pilares de POO e aplicá-los em
  situações iguais a esta.

  NOTE: Todas as três classes possuem a mesma estrutura comportamental, e diante deste contexto se encaixa
perfeitamente o segundo pilar da POO, a Herança.

?     Exemplo abaixo:
 */

class ComputadorZezinho{
  
  public static void main(String[] args) {
    // Abrindo MSN Messenger
    System.out.println("MSN");
    Msn msn = new Msn();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("Facebook");
    FacebookMessenger fcb = new FacebookMessenger();
    fcb.enviarMensagem();
    fcb.receberMensagem();

    System.out.println("Telegram");
    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();
  }
}

class ServicoMensagemInstantanea {
  public void enviarMensagem() {
      // primeiro confirmar se esta conectado a internet
      validarConectadoInternet();
      System.out.println("Enviando mensagem");
      // depois de enviada, salva o histórico da mensagem
      salvarHistoricoMensagem();
  }
  public void receberMensagem(){
    System.out.println("Recebendo mensagem");
  }
  // Métodos privadas, visíveis somente na classe
  private void validarConectadoInternet(){
    System.out.println("Validando se está conectado a internet");
  }
  private void salvarHistoricoMensagem(){
    System.out.println("Salvando o histórico da mensagem");
  }
}

class Msn extends ServicoMensagemInstantanea{

}

class FacebookMessenger extends ServicoMensagemInstantanea{

}

class Telegram extends ServicoMensagemInstantanea{

}
/*
    Podemos avaliar a importância de compreeder os pilares de POO para ter uma melhor implementação, reaproveitamento
  e reutilização de código em qualquer contexto das nossas aplicações, mas não para por ai.

    Será que todos os sistemas de mensagens realizam as suas operações de uma mesma maneira? E agora? Este é um
  trabalho para os pilares "Abstração" e "Polimorfismo".

!         ABSTRAÇÃO

?       Para você ser é preciso você fazer.

    Sabemos que qualquer sistema de mensagens instatâneas se realiza as mesmas operações de Enviar e Receber Mensagem,
  dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

    Mas será se as ações realizadas contém o mesmo comportamento?
    Acreditamos que não.

?      Já imaginou a Microsoft falar para o Facebook: "Ei, toma meu código do MSN".

    O que vale destacar para compreender aqui é que todo e qualquer sistema de mensagem precisa sem no mínimo
  Enviar e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar
  assim para o mercado.

    Observem a nova estruturação dos códigos abaixo com base na implementação apresentada no pilar "Herança".
 */

 
class ComputadorMariazinha{
  
  public static void main(String[] args) {
    // Abrindo MSN Messenger
    System.out.println("MSN");
    Msn2 msn = new Msn2();
    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("Facebook");
    FacebookMessenger2 fcb = new FacebookMessenger2();
    fcb.enviarMensagem();
    fcb.receberMensagem();

    System.out.println("Telegram");
    Telegram2 tlg = new Telegram2();
    tlg.enviarMensagem();
    tlg.receberMensagem();
  }
}

abstract class ServicoMensagemInstantanea2 {
// Métodos abstratos NÃO possuem corpo na classe abstrata (pai).
  public abstract void enviarMensagem(); 
  public abstract void receberMensagem();
}

class Msn2 extends ServicoMensagemInstantanea2{
  @Override
  public void enviarMensagem(){
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }
  @Override
  public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
}

class FacebookMessenger2 extends ServicoMensagemInstantanea2{
  @Override
  public void enviarMensagem(){
    System.out.println("Enviando mensagem pelo Facebook Messenger");
  }
  @Override
  public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo Facebook Messenger");
  }
}

class Telegram2 extends ServicoMensagemInstantanea2{
  @Override
  public void enviarMensagem(){
    System.out.println("Enviando mensagem pelo Telegram");
  }
  @Override
  public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo Telegram");
  }
}
/*
?       Em java o conceito de abstração é representado pela palavra reservada "abstract" e métodos que NÃO possuem
?     corpo na classe abstrata (pai).

!         POLIMORFISMO

?       Um mesmo comportamento de várias maneiras

    Podemos observar no contexto de "Abstração" e "Herança" que conseguimos criar uma singularidade estrutural de nossos
  elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta estender a classe
  "ServicoMensagemInstantanea" e implementar os respectivos métodos "abstratos". O que vale reforçar aqui é, cada classe
  terá a mesma ação executando procedimentos de maneira especializada.

?       POLIMORFISMO - O QUE É?

    Este o resultado do que denominados como Polimorfismo. Veja o exemplo abaixo:
 */
class ComputadorJoaozinho{
  public static void main(String[] args) {
    ServicoMensagemInstantanea3 smi = null;

    /*
      não se sabe qual app
      mas qualquer um deverá enviar e receber mensagens
     */
    String appEscolhido = "tlg";

    if (appEscolhido.equals("msn")) 
      smi = new MSNMenssenger3();
    else if (appEscolhido.equals("fbm")) 
      smi = new FacebookMessenger3();
    else if (appEscolhido.equals("tlg")) 
      smi = new Telegram3();
    else
      System.out.println("Escolha um app de mensagem instantânea");

      smi.enviarMensagem();
      smi.receberMensagem();
  }
}
abstract class ServicoMensagemInstantanea3 {
  // Métodos abstratos NÃO possuem corpo na classe abstrata (pai).
    public abstract void enviarMensagem(); 
    public abstract void receberMensagem();
  }
  
  class MSNMenssenger3 extends ServicoMensagemInstantanea3{
    @Override
    public void enviarMensagem(){
      System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
  }
  
  class FacebookMessenger3 extends ServicoMensagemInstantanea3{
    @Override
    public void enviarMensagem(){
      System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
  }
  
  class Telegram3 extends ServicoMensagemInstantanea3{
    @Override
    public void enviarMensagem(){
      System.out.println("Enviando mensagem pelo Telegram");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo Telegram");
    }
  }
/*
    Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas determinem ações uniformes para
  que as classes mais abstratas determinem ações uniformes para que cada classe filha concreta implementem os comportamentos
  de forma específica.

?     Modificador Protected

    Vamos para uma retrospectiva quanto ao requisito do nosso sistema de mensagens instantâneas desde a etapa de encapsulamento.

    O nosso requisito solicita que além de Enviar e Receber Mensagens precisamos validar se o aplicativo está conectado a
  internet (validarConectadoInternet) e salvar o histórico de cada mensagem (salvarHistoricoMensagem).

    Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto a validar
  se está conectado a internet? Não poderia ser um mecanismo comum à todos? Logo qualquer classe filha de "ServicoMensagemInstantanea"
  poderia desfrutrar através de herança desta funcionalidade.

    Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador "private" somente a classe
  conhece a implementação quanto que o modificador "public" todos passarão a conhecer. Mas gostaríamos que somente as 
  classes filha soubessem. Bem, é ai que entra o modificador "protected".
 */
class ComputadorJorginho{
  public static void main(String[] args) {
    ServicoMensagemInstantanea4 smi = null;

    /*
      não se sabe qual app
      mas qualquer um deverá enviar e receber mensagens
     */
    String appEscolhido = "tlg";

    if (appEscolhido.equals("msn")) 
      smi = new MSNMenssenger4();
    else if (appEscolhido.equals("fbm")) 
      smi = new FacebookMessenger4();
    else if (appEscolhido.equals("tlg")) 
      smi = new Telegram4();
    else
      System.out.println("Escolha um app de mensagem instantânea");

      smi.enviarMensagem();
      smi.receberMensagem();
      smi.salvarHistoricoMensagem();
  }
}
abstract class ServicoMensagemInstantanea4 {
  // Métodos abstratos NÃO possuem corpo na classe abstrata (pai).
    public abstract void enviarMensagem(); 
    public abstract void receberMensagem();

    // mais um método que todos os filhos deverão implementar
    public abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem este método
    protected void validarConectadoInternet(){
      System.out.println("Validando se está conectado");
    }
  }
  
  class MSNMenssenger4 extends ServicoMensagemInstantanea4{
    @Override
    public void enviarMensagem(){
      // Método Polimorfo para validação de internet
      validarConectadoInternet();
      System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    @Override
    public void salvarHistoricoMensagem(){
      System.out.println("Salvando o histórico da mensagem do MSN Messenger");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
  }
  
  class FacebookMessenger4 extends ServicoMensagemInstantanea4{
    @Override
    public void enviarMensagem(){
      // Método Polimorfo para validação de internet
      validarConectadoInternet();
      System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    @Override
    public void salvarHistoricoMensagem(){
      System.out.println("Salvando o histórico da mensagem do Facebook Messenger");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
  }
  
  class Telegram4 extends ServicoMensagemInstantanea4{
    @Override
    public void enviarMensagem(){
      // Método Polimorfo para validação de internet
      validarConectadoInternet();
      System.out.println("Enviando mensagem pelo Telegram");
    }
    @Override
    public void salvarHistoricoMensagem(){
      System.out.println("Salvando o histórico da mensagem do Telegram");
    }
    @Override
    public void receberMensagem(){
      System.out.println("Recebendo mensagem pelo Telegram");
    }
  }
/*
!           INTERFACE

?       Antes de tudo, "NÃO" estamos nos referindo a interface gráfica.

    Como vimos anteriormente "Herança" é um dos pilares de POO mas uma curiosidade que se deve ser esclarecida na linguagem
  Java é que a mesma não permite o que conhecemos como "Herança Múltipla".

    Á medida que vão surgindo novas necessidades, novos equipamentos (objetos) nascem para atender as expectativas de
  oferecer ferramentas com finalidades bem específicas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

    Observem que não há uma especificação de marca, modelo e ou capacidades de execução das classes citadas acima, isto
  é o que consideramos o nível mais abstrato da orientação a objetos que denominamos como "interfaces".

?     Então o que você está dizendo é que "interfaces" é o mesmo que "classes"?
?     Um molde para representação dos objetos reais?

    Este é um dos maiores questionamentos dos desenvolvedores no que se refere a modelo de classes da aplicação.

    Como citado acima Java não permite herança múltipla, logo, vamos imaginar que recebemos o desafio de projetar uma
  nova classe para criar objetos que representem as três características citadas acima e que iremos denominar de 
  "EquipamentoMultifuncional".

!       TESTE ABAIXO:

class Impressora{
  public void imprimir(){
    System.out.println("IMPRIMINDO");
  }
}
class Copiadora{
  public void copiar(){
    System.out.println("COPIANDO");
  }
}
class Digitalizadora{
  public void digitalizar(){
    System.out.println("DIGITALIZANDO");
  }
}
  Não é possível herdar mais de uma classe. como na classe abaixo: 
class EquipamentoMultifuncional extends Impressora extends Copiadora extends Digitalizadora {

}

    Para uma melhor compreensão, vamos analisar os diagramas de classes abaixo, comparando o conceito de herança entre
  classes e interfaces.

?     Cenário 1

    <<abstract>>                               <<abstract>>                              <<abstract>>
     Impressora                                 Copiadora                               Digitalizadora
+ imprimir() : void                         + copiar() : void                      + digitalizar() : void

Laserjet      Deskjet                             Xerox                                     Scanner

?     Cenário 2

   <<interface>>                              <<interface>>                             <<interface>>
     Impressora                                 Copiadora                               Digitalizadora
+ imprimir() : void                         + copiar() : void                      + digitalizar() : void

Laserjet      Deskjet                             Xerox                                     Scanner


                                        EquipamentoMultifuncional
     Impressora                                 Copiadora                               Digitalizadora
+ imprimir() : void                         + copiar() : void                      + digitalizar() : void


    Antes de iniciarmos a representação via código, devemos compreender que, assim como em classes e métodos abstratos,
  quando herdamos de uma interface, precisamos implementar todos os seus métodos, pois os mesmos são implicitamente
  "public abstract".

    E para encerar, uma das mais importantes ilustrções quanto ao uso de interfaces para desenvolvimento de componentes
  revolucinários é apresentado em 2007 por nada mais nada menos que Steve Jobs ao lançar o primeiro "iPhone" da história.

?   Um único equipamento que pode ser considerado tanto como um: Reprodutor Musical, Aparelho Telefônico e Navegador na 
?  Internet.

! EXEMPLO PRÁTICO USO DE INTERFACE:
*/

interface Impressora{
  public void imprimir(); // Funções da interface não possuem corpo, assim como as funções abstratas
}
interface Copiadora{
  public void copiar();
}
interface Digitalizadora{
  public void digitalizar();
}
class Laserjet implements Impressora{ // Para herdar interfaces ao invés de usarmos "extends" usamos "implements"
  public void imprimir(){
    System.out.println("IMPRIMINDO com Laserjet");
  }
}
class Deskjet implements Impressora{
  public void imprimir(){
    System.out.println("IMPRIMINDO com Deskjet");
  }
}
class Xerox implements Copiadora{
  public void copiar(){
    System.out.println("COPIANDO com Xerox");
  }
}
class Scanner implements Digitalizadora{
  public void digitalizar(){
    System.out.println("DIGITALIZANDO com Scanner");
  }
}
 // Agora podemos implementar várias interfaces ao contrario das classes que só deixa herdar uma classe.
class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{
  public void imprimir(){
    System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCINAL");
  }
  public void copiar(){
    System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCINAL");
  }
  public void digitalizar(){
    System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCINAL");
  }
}
class Fabrica{
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    impressora.imprimir();
    digitalizadora.digitalizar(); 
    copiadora.copiar();
  }
}
