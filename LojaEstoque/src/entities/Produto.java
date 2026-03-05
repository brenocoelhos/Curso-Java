package entities;

public class Produto {
    private String id;
    private String nome;
    private Fornecedor fornecedor;
    private String quantidadeEstoque;
    private Double valorCompra;
    private Double valorVenda;

    public Produto(String id, String nome, String quantidadeEstoque, Fornecedor fornecedor, Double valorCompra) {
        this.id = id;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.fornecedor = fornecedor;
        this.valorCompra = valorCompra;
        this.valorVenda = valorCompra *2;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
        this.valorVenda = valorCompra * 2;
    }


}
