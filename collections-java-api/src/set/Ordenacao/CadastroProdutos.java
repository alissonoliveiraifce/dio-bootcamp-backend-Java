package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto (long codigo, String nome, Double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirPorNome () {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco () {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

    cadastro.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastro.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastro.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastro.adicionarProduto(4L, "Teclado", 50d, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println("");
    System.out.println(cadastro.produtoSet);

    // Exibindo produtos ordenados por nome
    System.out.println("");
    System.out.println(cadastro.exibirPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println("");
    System.out.println(cadastro.exibirPorPreco());

    System.out.println("");
    }

}
