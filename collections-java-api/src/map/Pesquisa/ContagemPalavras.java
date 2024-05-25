package map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavras.isEmpty()) {
            this.contagemPalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        if(contagemPalavras.size() > 0) {
            System.out.println(contagemPalavras);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public Map<String, Integer> encontrarPalavraMaiFrequente () {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        int maiorFrequencia = Integer.MIN_VALUE;
        if (!contagemPalavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if (entry.getValue() > maiorFrequencia) {
                    palavraMaisFrequente.clear();
                    palavraMaisFrequente.put(entry.getKey(), entry.getValue());
                    maiorFrequencia = entry.getValue();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.exibirContagemPalavras();
        System.out.println("");

        contagem.adicionarPalavra("Java", 1);
        contagem.adicionarPalavra("Python", 5);
        contagem.adicionarPalavra("C#", 10);
        contagem.adicionarPalavra("C++", 2);
        contagem.adicionarPalavra("JavaScript", 3);

        contagem.exibirContagemPalavras();
        System.out.println("");

        contagem.removerPalavra("Java");
        contagem.removerPalavra("C++");

        contagem.exibirContagemPalavras();

        System.out.println(contagem.encontrarPalavraMaiFrequente());
    }


    

}
