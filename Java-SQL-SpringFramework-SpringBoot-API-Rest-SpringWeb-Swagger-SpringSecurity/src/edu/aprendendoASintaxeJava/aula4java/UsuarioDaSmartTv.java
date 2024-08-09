package edu.aprendendoASintaxeJava.aula1java;

public class UsuarioDaSmartTv {
  public static void main(String[] args) throws Exception {
    
    SmartTv smartTv = new SmartTv(); // Código cria uma instância da classe SmartTv

    if (smartTv.ligada == false) {  // Se a TV estiver desligada esse comando irá ligar ela.
      smartTv.ligar();
      System.out.println("A TV foi ligada " + smartTv.ligada);

    } else // Caso ela já esteja ligada ele irá executar esses comandos diretamente, sem precisar apertar o botão de ligar a TV.
    
    System.out.println("TV ligada " + smartTv.ligada);
    System.out.println("Canal atual = " + smartTv.canal);
    System.out.println("Volume atual = " + smartTv.volume);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume diminuido para = " + smartTv.volume);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume aumentado para = " + smartTv.volume);

    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    System.out.println("Canal atual = " + smartTv.canal);

    smartTv.diminuirCanal();
    System.out.println("Canal atual = " + smartTv.canal);

    smartTv.mudarDeCanal(125);
    System.out.println("Canal atual = " + smartTv.canal);

    smartTv.desligar();
    System.out.println(smartTv.ligada);
    System.out.println("A TV foi desligada!");
  }
}
