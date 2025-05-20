import model.Pedido;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pedido p = new Pedido();



        int menuPrincipal;
        do {
            System.out.println("\n========= MENU PRINCIPAL =========\n");
            System.out.println("[1] - Acessar Cardápio");
            System.out.println("[2] - Registrar Pedido");
            System.out.println("[3] - Ver Pedido");
            System.out.println("\n[0] - Finalizar");
            System.out.println("\n====================================\n");
            menuPrincipal = sc.nextInt();
            sc.nextLine();

            switch (menuPrincipal) {

                case 1:
                    int menuCardapio;
                    do {
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
                        menuCardapio = sc.nextInt();
                        sc.nextLine();
                    }while(menuCardapio != 0);
                    break;

                case 2:
                    int menuRegistrarPedido;
                    do {
                        System.out.println("========== REGISTRAR PEDIDO ==========");
                        System.out.print("\nDigite seu nome: ");
                        p.setNomeCliente(sc.nextLine());

                        System.out.println("\nDigite seu pedido: (Ex: 1x Latte): ");
                        p.setPedidoCliente(sc.nextLine());

                        System.out.println("\n[0] - Finalizar pedido");
                        System.out.println("\n===================================\n");
                        menuRegistrarPedido = sc.nextInt();
                        sc.nextLine();
                    }while(menuRegistrarPedido != 0);
                    break;

                case 3:
                    int menuVerPedido;
                    do {
                        System.out.println("========= SEU PEDIDO =========");
                        System.out.println("\nCliente: "+p.getNomeCliente()+ "\nPedido: "+p.getPedidoCliente());

                        System.out.println("\n[0] - Voltar");
                        System.out.println("\n===================================\n");
                        menuVerPedido = sc.nextInt();
                        sc.nextLine();
                    }while(menuVerPedido != 0);
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }


        }while (menuPrincipal != 0);
        System.out.println("Programa Finalizado, Volte Sempre!");
    }
}