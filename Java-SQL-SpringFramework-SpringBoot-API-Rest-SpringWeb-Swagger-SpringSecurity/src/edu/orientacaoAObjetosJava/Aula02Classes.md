# CLASSES

Toda a Estrutura de código na linguagem Java é distribuído em arquivos com extensão .java denominados de
classe.

As classes existentes em nosso projeto serão composta por:

## Identificador, Características e Comportamentos.

- Classe(class): A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.

- Identificador(identity): Propórsito existencial aos objetos que serão criados.

- Características(states): Também conhecido como atributos ou propriedades, é toda informação que representa
  o estado do objeto.

- Comportamentos(behavior): Também conhecido como ações ou métodos, é toda parte comportamental que um objeto
  dispõe.

- Instanciar(new): É o ato de criar um objeto a partir de estrutura definida em uma classe.

[![Estrutura de Classes](../../../img/Estrutura%20de%20classe.png)]

Para ilustrar as etapas de desenvolvimento orientada a objetos em Java, iremos reproduzir a imagem acima em forma de código para explicar que primeiro criamos a estrutura correspondente para assim podermos cria-los com as características e possibilidade de realização de ações (comportamentos) como se fosse no "mundo real".

      // Criando a classe Student

      // Com todas as características e comportamentos aplicados

      // CLASSE
      // Student = IDENTIFICADOR
      public class Student {

        // CARACTERÍSTICAS
        String name;
        int age;
        Color color;
        Sex sex;

        // COMPORTAMENTOS
        void eating(Food food){
          // NOSSO CÓDIGO AQUI
        }
        void drinking(Eat eat){
          // NOSSO CÓDIGO AQUI
        }
        void running(){
          // NOSSO CÓDIGO AQUI
        }
      }
      // APÓS CRIAR O MOLDE ACIMA PODEMOS CRIAR AS INSTANCIAS/OBJETOS QUE IRAM UTILIZAR O MOLDE COMO BASE

      // Criando objetos a partir da classe Student

      public class School {
        public static void main(String[] args) throws Exception {

          // CRIANDO UMA INSTÂNCIA/OBJETO
          Student student1 = new Student();

          //DESCREVENDO A CARACTERÍSTICA DESSA NOVA INSTÂNCIA/OBJETO
          student1.name= "John";
          student1.age= 12;
          student1.color= Color.FAIR;
          student1.sex= Sex.MALE;

          // CRIANDO UMA INSTÂNCIA/OBJETO
          Student student2 = new Student();

          //DESCREVENDO A CARACTERÍSTICA DESSA NOVA INSTÂNCIA/OBJETO
          student2.name= "Sophia";
          student2.age= 10;
          student2.color= Color.FAIR;
          student2.sex= Sex.FEMALE;

          // CRIANDO UMA INSTÂNCIA/OBJETO
          Student student3 = new Student();

          //DESCREVENDO A CARACTERÍSTICA DESSA NOVA INSTÂNCIA/OBJETO
          student3.name= "Lily";
          student3.age= 11;
          student3.color= Color.DARK;
          student3.sex= Sex.FEMALE;
        }
      }

No exemplo acima, NÃO estruturamos a classe Student com o padrão Java Beans getters e setters.

Seguindo algumas convenções, as nossas classes são classificadas como:

- Classe de modelo(model): classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

- Classe de serviço(service): classes que contém regras de negócios e validação de nosso sistema.
  Exemplo: checar se os dados do "cliente/pedidos/nota fiscal" foram informados corretamente antes de enviar para o banco de dados.

- Classe de repositório(repository): classe que contém uma integração com o banco de dados. São classes que enviam/atualizam os dados dos "cliente/pedidos/nota fiscal" para os bancos de dados.

- Classe de controle(controller): classe que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.
  Por exemplo: disponibilizar o cadastros dos "cliente/pedidos/nota fiscal" para uma API, para que outras pessoas possam consumir essas informações de maneira externa via http.

- Classe utilitária(util): classe que contém recursos comuns à toda nossa aplicação.
  Utilizada para executar funções uteis para nossas aplicações. Como por exemplo: Formatar uma data, calcular impostos e etc...

[![Estrutura de Classes](../../../img/Estrutura%20de%20classe%202.png)]

Exercite a distribuição de classes por papéis dentro da sua aplicação para que se possa determinar a estrutura mais conveniente em cada arquivo do seu projeto.
