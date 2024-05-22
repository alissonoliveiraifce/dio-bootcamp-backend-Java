package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listOrdenada = new ArrayList<>(listPessoas);
        Collections.sort(listOrdenada);
        return listOrdenada;
    }

    public List<Pessoa> ordenarPorAltura () {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Pedro", 30, 1.90);

        System.out.println("Ordenado por idade:");
        for (Pessoa pessoa : ordenacaoPessoas.ordenarPorIdade()) {
            System.out.println(pessoa);
        }

        System.out.println("\nOrdenado por altura:");
        for (Pessoa pessoa : ordenacaoPessoas.ordenarPorAltura()) {
            System.out.println(pessoa);
        }
    }

}
