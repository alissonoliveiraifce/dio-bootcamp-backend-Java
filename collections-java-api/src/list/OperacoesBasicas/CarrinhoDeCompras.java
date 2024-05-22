package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinhoList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : carrinhoList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Camiseta", 50.0, 2);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Calça", 100.0, 1);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Camiseta");
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Boné", 30.0, 3);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
    }
}
