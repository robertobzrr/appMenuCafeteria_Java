import controller.PedidoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PedidoController pc = new PedidoController();



        do { pc.menuInicial();
            switch (pc.getOpcaoMenuPrincial()) {

                case 1:
                    do { pc.menuCardapio();
                    }while(pc.getOpcaoMenuCardapio() != 0);
                    break;

                case 2:
                    do { pc.menuRegistrarPedido();
                    }while(pc.getOpcaoMenuRegistrarPedido() != 0);
                    break;

                case 3:
                    do { pc.verPedido();
                    }while(pc.getOpcaoVerPedido() != 0);
                    break;

                case 0:
                    pc.finalizarMenu();
                    break;

                default:
                    pc.defaultCase();
                    break;
            }


        }while (pc.getOpcaoMenuPrincial() != 0);
        System.out.println("Programa Finalizado, Volte Sempre!");
    }
}