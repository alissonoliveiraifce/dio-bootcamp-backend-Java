package map.Ordenacao;

import java.util.HashMap;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                livrosMap.remove(entry.getKey());
                break;
            }
        }
    }

    //public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        
}
