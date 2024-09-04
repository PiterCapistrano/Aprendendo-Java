# VISIBILIDADE DOS RECURSOS

## Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes no mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

## Modificador public

Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

### CLASSE COZINHEIRO:

    package lanchonete;

    public class Cozinheiro {
        //pode ser default
        public void adicionarLancheNoBalcao(){
            System.out.println("ADICIONAR LANCHE NATURAL NO BALCÃO");
        }
        //pode ser default
        public void adicionarSucoNoBalcao(){
            System.out.println("ADICIONANDO SUCO NO BALCÃO");
        }
        //pode ser default
        public void adicionarComboNoBalcao(){
            adicionarLancheNoBalcao();
            adicionarSucoNoBalcao();
        }
        public void prepararLanche(){
            System.out.println("PREPARANDO LANCHE");
        }
        public void prepararVitamina(){
            System.out.println("PREPARANDO SUCO");
        }
        public void prepararCombo(){
            prepararLanche();
            prepararVitamina();
        }
        public void selecionarIgredientesLanche(){
            System.out.println("SELECIONANDO O PÃO, SALADA, PROTEINAS E MOLHOS");
        }
        public void selecionarIngredientesVitamina(){
            System.out.println("SELECIONAR FRUTA, LEITE E AÇUCAR");
        }
        public void lavarIngredientes(){
            System.out.println("LAVANDO INGREDIENTES");
        }
        public void baterVitaminaLiquidificador(){
            System.out.println("BATENDO VITAMINA LIQUIDIFICANDO");
        }
        public void fritarIngredientesLanche(){
            System.out.println("FRITANDO A CARNE E OVO");
        }
        public void pedirParaTrocarGas(Atendente meuAmigo){
            meuAmigo.trocarGas();
        }
        public void pedirParaTrocarGas(Almoxarife meuAmigo){
            meuAmigo.trocarGas();
        }
        public void pedirIngredientes(Almoxarife almoxarife){
            almoxarife.entregarIngredientes();
        }
    }

### CLASSE ATENDENTE

    package lanchonete;

    public class Atendente {
        public void servindoMesa(){
            //...?
            System.out.println("SERVINDO MESA");
        }
        public void pegarLancheCozinha(){
            System.out.println("PEGANDO O LANCHE NA COZINHA");
        }
        public void receberPagamento(){
            System.out.println("RECEBENDO PAGAMENTO");
        }
        public void trocarGas(){
            System.out.println("ATENDENTE TROCANDO O GÁS");
        }
        public void pegarPedidoBalcao(){
            System.out.println("PEGANDO O PEDIDO NO BALCÃO");
        }
    }

### CLASSE ALMOXARIFE

    package lanchonete;

    public class Almoxarife {
        public void controlarEntrada(){
            System.out.println("CONTROLANDO A ENTRADA DOS INGREDIENTES");
        }
        public void controlarSaida(){
            System.out.println("CONTROLANDO A SAIDA DOS INGREDIENTES");
        }
        public void entregarIngredientes(){
            System.out.println("ENTREGANDO INGREDIENTES");
            //...?
        }
        public void trocarGas(){
            System.out.println("ALMOXARIFE TROCANDO O GÁS");
        }
    }

### CLASSE CLIENTE

    package lanchonete;

    public class Cliente {
        public void escolherLanche(){
            System.out.println("ESCOLHENDO O LANCHE");
        }
        public void fazerPedido(){
            System.out.println("FAZENDO O PEDIDO");
        }
        public void pagarConta(){
            System.out.println("PAGANDO A CONTA");
        }
        public void consultarSaldoAplicativo(){
            System.out.println("CONSULTANDO SALDO NO APLICATIVO");
        }
        public void pegarPedidoBalcao(){
            System.out.println("PEGANDO O PEDIDO NO BALCÃO");
        }
    }

### CLASSE ESTABELECIMENTO

    package lanchonete;

    public class Estabelecimento {
        public static void main(String[] args) {
            Cozinheiro cozinheiro = new Cozinheiro();
            //ações que não precisam estarem disponíveis para toda aplicação
            cozinheiro.selecionarIngredientesVitamina();
            cozinheiro.lavarIngredientes();
            cozinheiro.baterVitaminaLiquidificador();
            cozinheiro.selecionarIgredientesLanche();
            cozinheiro.lavarIngredientes();
            cozinheiro.prepararLanche();
            cozinheiro.prepararVitamina();

            //ações que estabelecimento precisa ter ciência
            cozinheiro.adicionarSucoNoBalcao();
            cozinheiro.adicionarLancheNoBalcao();
            cozinheiro.adicionarComboNoBalcao();

            Almoxarife almoxarife = new Almoxarife();
            //ações que não precisam estarem disponíveis para toda aplicação
            almoxarife.controlarEntrada();
            almoxarife.controlarSaida();
            //ações que somente o seu pacote cozinha precisa conhecer (defaut)
            almoxarife.entregarIngredientes();
            almoxarife.trocarGas();

            Atendente atendente = new Atendente();
            atendente.pegarLancheCozinha();
            atendente.receberPagamento();
            atendente.servindoMesa();
            //ações que somente o seu pacote cozinha precisa conhecer (defaut)
            atendente.trocarGas();

            Cliente cliente = new Cliente();
            cliente.escolherLanche();
            cliente.fazerPedido();
            cliente.pagarConta();

            //não deveria, mas o estabelecimento
            // ainda não definiu normas de atendimento
            cliente.pegarPedidoBalcao();

            //esta ação é muito sigilosa, que tal ser privada?
            cliente.consultarSaldoAplicativo();

            //já pensou os clientes ouvindo que o gás acabou?
            cozinheiro.pedirParaTrocarGas(atendente);
            cozinheiro.pedirParaTrocarGas(almoxarife);

        }
    }

### Acredite! Nem tudo precisa ser visto por todos!

## Modificador default

O modificador "default" está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

Dentro do pacote "lanchonete", iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

- "lanchonete.atendimento.cozinha": Pacote que contém classes da parte da cozinha da lanchonete e atendimento.

- "lanchonete.area.cliente": Pacote que contém classes relacionadas ao espaço do cliente.

![../../../img/Visibilidade%20de%20recursos.png](../../../img/Visibilidade%20de%20recursos.png)

## Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde, temos as divisões (pacotes) espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização da visibilidade por pacote, será se realmente estas classes precisam ser tão explicitas?

- Será se o Cozinheiro precisa saber que\como o Almoxarife controle as entradas e saídas?

- Que o Cliente precisa saber como o Atendente recebe o pedido para servir sua mesa?

- Que o Atendente precisa saber que antes de pagar o Cliente consulta o saldo no App?

Diante destes questionamentos é que nossas classes precisam continuar mantendo suas ações (métodos) mas nem todas precisam ser vistas por ninguém.

## Modificador protected

Em Java, o modificador de acesso "protected" defini o nível de visibilidade de um membro de classe (atributo, método ou construtor) dentro do contexto de pacotes e herança.

1.  Acesso dentro do mesmo pacote: Um membro de uma classe marcado como "protected" é acessível por todas as classes que estão no mesmo pacote. Isso significa que outras classes dentro do mesmo pacote podem acessar o membro "protected", mesmo que não estejam na mesma hierarquia de herança.

2.  Acesso em subclasse (mesmo fora do pacote): Um membro "protected" também é acessível em qualquer subclasse da classe onde o membro foi definido, mesmo que essa subclasse esteja em um pacote diferente. As subclasses podem acessar diretamente o membro "protected" sem precisar de métodos públicos para isso.

3.  Não acessível diretamente fora do pacote por classes não relacionadas: Membros "protected" não são acessíveis diretamente por classes que não estão no mesmo pacote e não são subclasses da classe que contém o membro.

O modificador "protected" é útil quando você quer permitir que subclasse e classes dentro do mesmo pacote tenham acesso a membros específicos de uma classe, mas ainda deseja limitar o acesso de classes completamente não relacionadas, especialmente as que estão em pacotes diferentes.

### Exemplo:

        ackage pacoteA;

        public class ClasseA {
            protected int valor;

            protected void metodoProtegido() {
                System.out.println("Método protegido");
            }
        }



        package pacoteB;

        import pacoteA.ClasseA;

        public class SubClasseA extends ClasseA {
            public void exibirValor() {
                System.out.println(valor);  // Acesso permitido porque SubClasseA é uma subclasse de ClasseA
            }

            public void chamarMetodo() {
                metodoProtegido();  // Acesso permitido
            }
        }

No exemplo acima, "SubClasseA" pode acessar o atributo "valor" e o método "metodoProtegido()" porque ela herda de "ClasseA". Se uma classe em "pacoteB" não fosse uma subclasse de "ClasseA", ele não teria acesso a esse membros "protected".

### A visibilidade de recursos da linguagem não está associada a "interface gráfica", mas sim, o que as classes conseguem "acessar" uma das outras!

## Classes Modificadas Com as Devidas Visibilidades de Resursos

### CLASSE COZINHEIRO

        package lanchonete.atendimento.cozinha;

        public class Cozinheiro {
            //pode ser default
            public void adicionarLancheNoBalcao(){
                System.out.println("ADICIONAR LANCHE NATURAL NO BALCÃO");
            }
            //pode ser default
            public void adicionarSucoNoBalcao(){
                System.out.println("ADICIONANDO SUCO NO BALCÃO");
            }
            //pode ser default
            public void adicionarComboNoBalcao(){
                adicionarLancheNoBalcao();
                adicionarSucoNoBalcao();
            }
            private void prepararLanche(){
                System.out.println("PREPARANDO LANCHE");
            }
            private void prepararVitamina(){
                System.out.println("PREPARANDO SUCO");
            }
            private void prepararCombo(){
                prepararLanche();
                prepararVitamina();
            }
            private void selecionarIgredientesLanche(){
                System.out.println("SELECIONANDO O PÃO, SALADA, PROTEINAS E MOLHOS");
            }
            private void selecionarIngredientesVitamina(){
                System.out.println("SELECIONAR FRUTA, LEITE E AÇUCAR");
            }
            private void lavarIngredientes(){
                System.out.println("LAVANDO INGREDIENTES");
            }
            private void baterVitaminaLiquidificador(){
                System.out.println("BATENDO VITAMINA LIQUIDIFICANDO");
            }
            public void fritarIngredientesLanche(){
                System.out.println("FRITANDO A CARNE E OVO");
            }
            private void pedirParaTrocarGas(Almoxarife meuAmigo){
                meuAmigo.trocarGas();
            }
            private void pedirIngredientes(Almoxarife almoxarife){
                almoxarife.entregarIngredientes();
            }
        }

### CLASSE ATENDENTE

        package lanchonete.atendimento;

        public class Atendente {
            public void servindoMesa(){
                pegarLancheCozinha();
                pegarPedidoBalcao();
                System.out.println("SERVINDO MESA");
            }
            private void pegarLancheCozinha(){
                System.out.println("PEGANDO O LANCHE NA COZINHA");
            }
            public void receberPagamento(){
                System.out.println("RECEBENDO PAGAMENTO");
            }
            void trocarGas(){
                System.out.println("ATENDENTE TROCANDO O GÁS");
            }
            private void pegarPedidoBalcao(){
                System.out.println("PEGANDO O PEDIDO NO BALCÃO");
            }
        }

### CLASSE ALMOXARIFE

        package lanchonete.atendimento.cozinha;

        public class Almoxarife {
            private void controlarEntrada(){
                System.out.println("CONTROLANDO A ENTRADA DOS INGREDIENTES");
            }
            private void controlarSaida(){
                System.out.println("CONTROLANDO A SAIDA DOS INGREDIENTES");
            }
            void entregarIngredientes(){
                System.out.println("ENTREGANDO INGREDIENTES");
                controlarSaida();
                //...?
            }
            void trocarGas(){
                System.out.println("ALMOXARIFE TROCANDO O GÁS");
            }
        }

### CLASSE CLIENTE

        package lanchonete.area.cliente;

        public class Cliente {
            public void escolherLanche(){
                System.out.println("ESCOLHENDO O LANCHE");
            }
            public void fazerPedido(){
                System.out.println("FAZENDO O PEDIDO");
            }
            public void pagarConta(){
                consultarSaldoAplicativo();
                System.out.println("PAGANDO A CONTA");
            }
            private void consultarSaldoAplicativo(){
                System.out.println("CONSULTANDO SALDO NO APLICATIVO");
            }

        }

### CLASSE ESTABELECIMENTO

        package lanchonete;

        import lanchonete.area.cliente.Cliente;
        import lanchonete.atendimento.Atendente;
        import lanchonete.atendimento.cozinha.Cozinheiro;

        public class Estabelecimento {
            public static void main(String[] args) {
                Cozinheiro cozinheiro = new Cozinheiro();

                //ações que estabelecimento precisa ter ciência
                cozinheiro.adicionarSucoNoBalcao();
                cozinheiro.adicionarLancheNoBalcao();
                cozinheiro.adicionarComboNoBalcao();

                Atendente atendente = new Atendente();
                atendente.servindoMesa();
                atendente.receberPagamento();

                Cliente cliente = new Cliente();
                cliente.escolherLanche();
                cliente.fazerPedido();
                cliente.pagarConta();

            }
        }
