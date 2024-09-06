# CONSTRUTORES

Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

    Classe novoObjeto = new Classe();

Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas das vezes já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciais. Abaixo iremos ilustrar uma classe "Pessoa" onde a mesma terá os atributos: Nome, CPF, Endereço.

      package escola;

      public class Pessoa {
          private String nome;
          private String cpf;
          private String endereco;


          public String getNome() {
              return nome;
          }

          public String getCpf() {
              return cpf;
          }

          public String getEndereco() {
              return endereco;
          }

          public void setEndereco(String endereco) {
              this.endereco = endereco;
          }
          //...
          //setters de nome e cpf?
      }

Criaremos uma "Pessoa" mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores.

      package escola;

      public class SistemaCadastro {
          public static void main(String[] args) {
              //criamos uma pessoa no sistem
              Pessoa piter = new Pessoa();

              //definimos o endereço de Piter
              piter.setEndereco("Rua Qualquer");

              //e como definir o nome e cpf do marcos?

              //imprimindo o Piter sem o nome e cpf

              System.out.println(piter.getNome() + "-" + piter.getCpf());
          }
      }

Entrando em cena o construtor para criar nossos objetos já com valores requeridos no momento da criação\instanciação (new).

      public class Pessoa {
          private String nome;
          private String cpf;
          private String endereco;

          // método construtor - que é um método que não tem retorno e assim como os métodos eles recebem parâmetro.
          // o nome deverá ser igual ao nome da classe.

          public Pessoa (String cpf, String nome){
              this.cpf = cpf;
              this.nome = nome;
          }

          //...
          //getters
          //setters
      }
