# ENUMS

Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modela de negócio contém objetos de mesmo contexto que já existem de pré-estabelecida com a certeza de não haver tanta alteração de valores.

## Exemplo:

- Grau de Escolaridade: Analfabeto, Fundamental, Médio, Superior;

- Estado Civil: Solteiro, Casado, Divorciado, Viúvo;

- Estados Brasileiros: São Paulo, Rio de Janeiro, Piauí, Maranhão.

### Não confunda uma lista de constantes com enum.

Enquanto que uma constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos já pre-definidos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum para disponibilizar os quatro estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome do de cada estado e já retorna para tudo maiúsculo.

      // Arquivo EstadoBrasileiro
      // Criando o enum EstadoBrasileiro para ser usado em toda a aplicação
      public enum EstadoBrasileiro {
          SAO_PAULO ("SP","São Paulo", 11),
          RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
          PIAUI ("PI","Piauí", 13),
          MARANHAO ("MA","Maranhão", 14),
          CEARA ("CE", "Ceará", 15)
          ;

          private String nome;
          private  String sigla;
          private int ibge;

          private EstadoBrasileiro(String sigla, String nome, int ibge){
              this.sigla = sigla;
              this.nome = nome;
              this.ibge = ibge;
          }

          public String getNome() {
              return nome;
          }

          public String getSigla() {
              return sigla;
          }
          public String getNomeMaiusculo(){
              return nome.toUpperCase();
          }

          public int getIbge() {
              return ibge;
          }
      }

      // Arquivo SistemaIbge
      public class SistemaIbge {
          public static void main(String[] args) {
              for (EstadoBrasileiro e: EstadoBrasileiro.values()){
                  System.out.println(e.getSigla() + " - " + e.getNome());
              }
              EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

              System.out.println(eb.getNome());
              System.out.println(eb.getSigla());
              System.out.println(eb.getNomeMaiusculo());
              System.out.println(eb.getIbge());
          }
      }
