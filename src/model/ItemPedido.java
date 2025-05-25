package model;

public class ItemPedido {
    private String nome;
    private int quantidade;

    public ItemPedido(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}