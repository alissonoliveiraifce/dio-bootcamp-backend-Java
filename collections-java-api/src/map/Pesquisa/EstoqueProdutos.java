package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto (Long cod, String nome, int quantidade, double preco) {
        estoqueMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos () {
        if (!estoqueMap.isEmpty()) {
            System.out.println(estoqueMap);
        } else {
            System.out.println("Estoque vazio!");
        }
    }

    public double calcularValorEstoque () {
        double valorTotalEstoque = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro () {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();
        System.out.println("");

        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        
        estoque.exibirProdutos();
        System.out.println("");

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorEstoque());
    
        
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        
        // Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        // System.out.println("Produto mais barato: " + produtoMaisBarato);
    }

    

}
