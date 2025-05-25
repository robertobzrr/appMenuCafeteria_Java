package controller;
import model.Cliente;
import model.ItemPedido;
import model.RegistroPedido;
import service.PedidoService;
import java.util.Scanner;


public class PedidoController {
    private Scanner sc = new Scanner(System.in);
    private PedidoService pedidoService = new PedidoService();


    private int opcaoMenuPrincial;
    private int opcaoMenuCardapio;
    private int opcaoMenuRegistrarPedido;
    private int opcaoVerPedido;

    public int getOpcaoMenuPrincial() { return opcaoMenuPrincial; }
    public int getOpcaoMenuCardapio() { return opcaoMenuCardapio; }
    public int getOpcaoMenuRegistrarPedido() { return opcaoMenuRegistrarPedido; }
    public int getOpcaoVerPedido() { return opcaoVerPedido; }

    public void menuInicial() {
        System.out.println("\n========= MENU PRINCIPAL =========\n");
        System.out.println("[1] - Acessar Cardápio");
        System.out.println("[2] - Registrar Pedido");
        System.out.println("[3] - Ver Pedido");
        System.out.println("\n[0] - Finalizar");
        System.out.println("\n====================================\n");
        opcaoMenuPrincial = sc.nextInt();
        sc.nextLine();
    }
    public void menuCardapio() {
        System.out.println("\n========= CARDÁPIO DE CAFÉS =========\n");
        System.out.println("| Café Expresso.........R$ 5,00  |");
        System.out.println("| Cappuccino............R$ 8,50  |");
        System.out.println("| Latte ................R$ 9,00  |");
        System.out.println("| Mocha.................R$ 10,00 |");
        System.out.println("| Café com Leite........R$ 6,00  |");
        System.out.println("| Irish Coffee..........R$ 12,00 |");
        System.out.println("| Affogato..............R$ 11,50 |");
        System.out.println("| Café Gelado...........R$ 7,50  |");
        System.out.println("| Macchiato.............R$ 8,00  |");
        System.out.println("| Café Turco............R$ 6,50  |");
        System.out.println("\n[0] - Voltar");
        System.out.println("\n===================================\n");
        opcaoMenuCardapio = sc.nextInt();
        sc.nextLine();
    }
    public void menuRegistrarPedido() {
        System.out.println("========== REGISTRAR PEDIDO ==========");

        System.out.print("\nDigite o número da mesa: ");
        int mesa = sc.nextInt();
        sc.nextLine();

        Cliente cliente = new Cliente();
        cliente.setIdMesa(mesa);

        System.out.print("Digite seu nome: ");
        cliente.setNomeCliente(sc.nextLine());

        pedidoService.criarRegistro(cliente);
        RegistroPedido registro = pedidoService.buscarPorMesa(mesa);

        int opcao;
        do {
            System.out.print("Digite seu pedido (Ex: 2x Latte): ");
            String[] partes = sc.nextLine().split("x");
            int quantidade = Integer.parseInt(partes[0].trim());
            String nome = partes[1].trim();

            registro.adicionarItem(new ItemPedido(nome, quantidade));

            System.out.println("[1] - Adicionar mais itens\n[0] - Finalizar pedido");
            opcao = sc.nextInt();
            sc.nextLine();
        } while(opcao == 1);

        opcaoMenuRegistrarPedido = 0;
    }
    public void verPedido() {
        System.out.print("Digite o número da mesa: ");
        int mesa = sc.nextInt();
        sc.nextLine();

        RegistroPedido registro = pedidoService.buscarPorMesa(mesa);

        if(registro != null) {
            System.out.println("\n========= PEDIDO =========");
            System.out.println("Mesa: " + registro.getCliente().getIdMesa());
            System.out.println("Cliente: " + registro.getCliente().getNomeCliente());
            System.out.println("Itens:");

            for(ItemPedido item : registro.getPedido().getItens()) {
                System.out.println("• " + item.getQuantidade() + "x " + item.getNome());
            }
            System.out.println("========================");
        } else {
            System.out.println("Nenhum pedido encontrado para esta mesa!");
        }

        System.out.println("[0] - Voltar");
        opcaoVerPedido = sc.nextInt();
        sc.nextLine();
    }
    public void finalizarMenu() {
        System.out.println("Finalizando...");
    }
    public void defaultCase() {
        System.out.println("Escolha uma opção válida!");
    }
}