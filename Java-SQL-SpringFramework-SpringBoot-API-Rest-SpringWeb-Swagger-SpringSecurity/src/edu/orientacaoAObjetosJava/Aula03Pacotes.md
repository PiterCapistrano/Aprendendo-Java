# PACOTES

A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão a banco de dados, entre outras. Imagina todas estas classes existirem em um único nível de documentos? E as classes desenvolvidas por nós, meros desenvolvedores de aplicações de vários os gêneros? Imagina como ficaria este diretório em?

[[../../../img/Estrutura%20de%20pacotes.png](../../../img/Estrutura%20de%20pacotes.png)]

Para prevenir este acontecimento, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos como pacote(package). Os pacotes são subdiretórios a partir da pasta "src" do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado.

[[../../../img/Estrutura%20de%20pacotes%202.png](../../../img/Estrutura%20de%20pacotes%202.png)] [[(../../../img/Estrutura%20de%20pacotes%203.png](../../../img/Estrutura%20de%20pacotes%203.png)]

## Nomenclatura

Vamos imaginar que sua empresa se chama "Power Soft" e ela está desenvolvendo software comercial, governamentale um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

- Comercial: com.powersoft

- Governamental: gov.powersoft

- Código aberto: org.powersoft

Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência:

- model: Classes que representam a camada e modelo de aplicação:
  Client, Pedido, NotaFiscal, Usuario.

- repository: Classes o interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository.

- service: Classes que contém regras de negócio do sistema: ClienteService possui o método validar o CPF do cliente cadastrado.

- controller: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.

- view: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.

- util: Pacote que contém classes utilitárias do sistema:
  FormatadorNumeroUtil, ValidadorUtil.

## Identificação

Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar, porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (próprio nome) e agora o nome qualificado (endereçamento do pacote + nome), exemplo: Considere a classe Usuario que está endereçada no pacote.
"com.controle.acesso.model", o nome qualificado desta classe é "com.controle.acesso.model.Usuario".

## Package versus Import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização das mesmas, seguindo a recomendação abaixo:

      package

      import ...
      import ...

      public class MinhaClassea {

      }
