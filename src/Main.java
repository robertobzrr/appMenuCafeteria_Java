import controller.PedidoController;
import model.Pedido;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PedidoController pc = new PedidoController();




        do {
            pc.menuInicial();
            switch (pc.menuPrincipal) {
                case 1:
                    do { pc.menuCardapio();
                    }while(pc.menuCardapio != 0);
                    break;

                case 2:
                    do { pc.menuRegistrarPedido();
                    }while(pc.menuRegistrarPedido != 0);
                    break;

                case 3:
                    do { pc.verPedido();
                    }while(pc.verPedido != 0);
                    break;

                case 0:
                    pc.finalizarMenu();
                    break;

                default:
                    pc.defaultCase();
                    break;
            }


        }while (pc.menuPrincipal != 0);
        System.out.println("Programa Finalizado, Volte Sempre!");
    }
}