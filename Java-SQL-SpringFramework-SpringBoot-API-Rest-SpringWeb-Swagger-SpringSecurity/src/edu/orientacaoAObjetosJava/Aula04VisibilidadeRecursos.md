# VISIBILIDADE DOS RECURSOS

## Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes no mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

### Modificador public

Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

## CLASSE COZINHEIRO:

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

## CLASSE ATENDENTE

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

## CLASSE ALMOXARIFE

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

## CLASSE CLIENTE

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

## CLASSE ESTABELECIMENTO

    package lanchonete;

    public class Estabelecimento {
        public static void main(String[] args) {
            Cozinheiro cozinheiro = new Cozinheiro();
            //ações que não precisam estarem disponíveis
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
            //ações que não precisam estarem disponíveis
            almoxarife.controlarEntrada();
            almoxarife.controlarSaida();
            //ações que somente o seu pacote cozinha precisa
            almoxarife.entregarIngredientes();
            almoxarife.trocarGas();

            Atendente atendente = new Atendente();
            atendente.pegarLancheCozinha();
            atendente.receberPagamento();
            atendente.servindoMesa();
            //ações que somente o seu pacote cozinha precisa
            atendente.trocarGas();

            Cliente cliente = new Cliente();
            cliente.escolherLanche();
            cliente.fazerPedido();
            cliente.pagarConta();

            //não deveria, mas o estabelecimento
            // ainda não definiu normas de atendimento
            cliente.pegarPedidoBalcao();

            //esta ação é muito sigilosa, que tal ser privada
            cliente.consultarSaldoAplicativo();

            //já pensou os clientes ouvindo que o gás acabou?
            cozinheiro.pedirParaTrocarGas(atendente);
            cozinheiro.pedirParaTrocarGas(almoxarife);

        }
    }

### Acredite! Nem tudo precisa ser visto por todos!
