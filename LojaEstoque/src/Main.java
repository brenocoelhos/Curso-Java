import entities.Fornecedor;
import entities.Endereco;
import entities.Produto;
import entities.Cliente;
import entities.Compra;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua A", "100", "Sala 1", "Centro", "SP", "SP", "01100-000");
        Endereco end2 = new Endereco("Av. B", "500", "Galpão", "Industrial", "RJ", "RJ", "20000-000");

        Fornecedor forn1 = new Fornecedor("F01", "Tech Supply","cecilia@gmail.com", "32 084317275", end1);
        Fornecedor forn2 = new Fornecedor("F02", "Global Peças","vanessa@gmail.com", "32 084311215", end2);

        Produto p1 = new Produto("P001", "Mouse Sem Fio", "50", forn1, 45.0);
        Produto p2 = new Produto("P002", "Teclado Mecânico", "30", forn1, 120.0);
        Produto p3 = new Produto("P003", "Monitor 24pol", "15", forn2, 600.0);


        Endereco endCliente = new Endereco("Rua X", "99", "Apt 2", "Bairro", "BH", "MG", "30000-000");
        Cliente cliente1 = new Cliente("123.456.789-00", "João Silva", endCliente, "31 9999-9999", "joao@email.com", "M", "01/01/1990");

        Compra compra1 = new Compra(cliente1, p1, 2);

        compra1.exibirResumo();

        exibirProduto(p1);
        exibirProduto(p2);
        exibirProduto(p3);
    }
    public static void exibirProduto(Produto p) {
        System.out.println("Produto: " + p.getNome() + " | Qtd: " + p.getQuantidadeEstoque());
        System.out.println("Fornecedor: " + p.getFornecedor().getNome());
        System.out.println("Preço Compra: R$ " + p.getValorCompra());
        System.out.println("Preço Venda: R$ " + p.getValorVenda());
        System.out.println("Localização: " + p.getFornecedor().getEndereco().getCidade());
        System.out.println("--------------------------------------");
    }
}