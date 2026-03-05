package entities;

public class Compra {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private Double totalItem;

    public Compra(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;

        this.totalItem = produto.getValorVenda() * quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getTotalItem() {
        return totalItem;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.totalItem = this.produto.getValorVenda() * quantidade;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void exibirResumo() {
        System.out.println("--- RESUMO DA COMPRA ---");
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Produto: " + this.produto.getNome());
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Total: R$ " + this.totalItem);
        System.out.println("------------------------");
    }
}