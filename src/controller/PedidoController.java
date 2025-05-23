package controller;
import model.Cliente;
import model.Pedido;
import java.util.Scanner;


public class PedidoController {


    Scanner sc = new Scanner(System.in);
    Pedido pedido = new Pedido();
    Cliente cliente = new Cliente();


    private int opcaoMenuPrincial;
    private int opcaoMenuCardapio;
    private int opcaoMenuRegistrarPedido;
    private int opcaoVerPedido;


    public int getOpcaoMenuPrincial(){
        return opcaoMenuPrincial;

    }
    public int getOpcaoMenuCardapio(){
        return opcaoMenuCardapio;

    }
    public int getOpcaoMenuRegistrarPedido(){
        return opcaoMenuRegistrarPedido;

    }
    public int getOpcaoVerPedido(){
        return opcaoVerPedido;

    }


    public void menuInicial(){
        System.out.println("\n========= MENU PRINCIPAL =========\n");
        System.out.println("[1] - Acessar Cardápio");
        System.out.println("[2] - Registrar Pedido");
        System.out.println("[3] - Ver Pedido");
        System.out.println("\n[0] - Finalizar");
        System.out.println("\n====================================\n");

        opcaoMenuPrincial = sc.nextInt();
        sc.nextLine();

    }
    public void menuCardapio(){
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
    public void menuRegistrarPedido(){
        System.out.println("========== REGISTRAR PEDIDO ==========");

        System.out.print("\nDigite o número da mesa: ");
        cliente.setIdMesa(sc.nextInt());
        sc.nextLine();

        System.out.print("Digite seu nome: ");
        cliente.setNomeCliente(sc.nextLine());

        System.out.print("Digite seu pedido: (Ex: 1x Latte): ");
        pedido.setPedidoCliente(sc.nextLine());

        System.out.println("\n[0] - Finalizar pedido");
        System.out.println("\n===================================\n");
        opcaoMenuRegistrarPedido = sc.nextInt();
        sc.nextLine();
    }
    public void verPedido(){
        System.out.println("========= SEU PEDIDO =========");
        System.out.println("\nMesa: "+ cliente.getIdMesa()+"\nCliente: "+ cliente.getNomeCliente()+ "\nPedido: "+ pedido.getPedidoCliente());

        System.out.println("\n[0] - Voltar");
        System.out.println("\n==============================\n");
        opcaoVerPedido = sc.nextInt();
        sc.nextLine();
    }
    public void finalizarMenu(){
        System.out.println("Finalizando...");

    }
    public void defaultCase(){
        System.out.println("Escolha uma opção válida!");

    }



}
