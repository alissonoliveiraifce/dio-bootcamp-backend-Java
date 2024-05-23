package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosEncontados = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosEncontados.add(c);
            }
        }
        return contatosEncontados;
    }

    public Contato atualizContato(String nome, String telefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(telefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", "1234-5678");
        agenda.adicionarContato("João", "5678-1234");
        agenda.adicionarContato("José", "4321-8765");
        agenda.adicionarContato("Ana", "8765-4321");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisaPorNome("Jo"));
        System.out.println(agenda.atualizContato("João", "9999-9999"));
        agenda.exibirContatos();
    }

}
