package model;

public class RegistroPedido {
    private Cliente cliente;
    private Pedido pedido;

    public RegistroPedido(Cliente cliente) {
        this.cliente = cliente;
        this.pedido = new Pedido();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void adicionarItem(ItemPedido item) {
        pedido.adicionarItem(item);
    }
}