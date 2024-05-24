package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato (String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos () {
        if (agendaContatoMap.size() > 0) {    
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public Integer pesquisarPorNome (String nome) {
        Integer telefonePorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            telefonePorNome = agendaContatoMap.get(nome);
        }
        return telefonePorNome;
    }

    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.exibirContatos();
        System.out.println("");

        contato.adicionarContato("Ana", 988884930);
        contato.adicionarContato("João", 908884930);
        contato.adicionarContato("José", 988884330);
        contato.adicionarContato("Marcos", 988824930);
        contato.adicionarContato("Dedé", 981884930);

        contato.exibirContatos();
        System.out.println("");

        contato.removerContato("Ana");
        contato.removerContato("Dedé");

        contato.exibirContatos();

        System.out.println(contato.pesquisarPorNome("João"));


    }

    
}
