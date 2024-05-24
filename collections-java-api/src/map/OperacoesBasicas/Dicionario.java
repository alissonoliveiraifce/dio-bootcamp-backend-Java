package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> verbetesMap;
    
    public Dicionario() {
        this.verbetesMap = new HashMap<>();
    }

    public void adicionarPalavra (String nome, String descricao) {
        verbetesMap.put(nome, descricao);
    }

    public void removerPalavra (String nome) {
        if (!verbetesMap.isEmpty()) {            
            verbetesMap.remove(nome);
        }
    }

    public void exibirPalavra () {
        if (!verbetesMap.isEmpty()) {
            System.out.println(verbetesMap);

        } else {
            System.out.println("Dicionário vazio!");
        }

    }

    public String pesquisarPorPalavra (String nome) {
        String descricao = verbetesMap.get(nome);
        if (descricao != null) {
            return descricao;
        }
        return "Palavra não encontrada";
    }

    public static void main(String[] args) {
        Dicionario verbete = new Dicionario();

        verbete.exibirPalavra();
        System.out.println("");

        verbete.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        verbete.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        verbete.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        
        verbete.exibirPalavra();
        System.out.println("");

        verbete.removerPalavra("java");

        verbete.exibirPalavra();
        System.out.println("");

        System.out.println("Definição: " + verbete.pesquisarPorPalavra("java"));
        System.out.println("");
        System.out.println("Definição é: " + verbete.pesquisarPorPalavra("kotlin"));

    }
    
}
