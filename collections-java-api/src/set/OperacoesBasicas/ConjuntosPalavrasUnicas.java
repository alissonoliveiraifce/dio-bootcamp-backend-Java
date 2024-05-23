//exercicio proposto na aula

package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntosPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        System.out.println(palavrasUnicas.contains(palavra) ? "A palavra " + palavra + " está no conjunto." : "A palavra " + palavra + " não está no conjunto.");
    }

    public void imprimirPalavra() {
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntosPalavrasUnicas palavrasUnicas = new ConjuntosPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("João");
        palavrasUnicas.adicionarPalavra("Maria");
        palavrasUnicas.adicionarPalavra("José");
        palavrasUnicas.adicionarPalavra("Ana");
        palavrasUnicas.adicionarPalavra("Pedro");
        palavrasUnicas.adicionarPalavra("Paula");
        palavrasUnicas.adicionarPalavra("Paula");
        
        System.out.println("");
        palavrasUnicas.imprimirPalavra();
        System.out.println("");

        palavrasUnicas.removerPalavra("Paula");
        palavrasUnicas.removerPalavra("Ana");
        palavrasUnicas.removerPalavra("José");

        System.out.println("");
        palavrasUnicas.imprimirPalavra();
        System.out.println("");

        palavrasUnicas.verificarPalavra("Maria");
        palavrasUnicas.verificarPalavra("Paula");
        palavrasUnicas.verificarPalavra("Ana");
        palavrasUnicas.verificarPalavra("João");
    }

    

}
