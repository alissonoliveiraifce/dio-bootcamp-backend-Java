package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
            }
        }
        tarefasSet.remove(tarefaParaRemover);

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (tarefasSet.size() > 0) {
            for (Tarefa t : tarefasSet) {
                System.out.println(t);
            } 
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public int contarTarefas() {
       return tarefasSet.size();
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    } 

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao));
                tarefaPendente = t;
                break;
        }
        if (tarefaPendente != null) {
            if (tarefaPendente.isConcluida()) {
                tarefaPendente.setConcluida(false);
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas () {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes () {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void limparListaTarefas() {
        tarefasSet.removeAll(tarefasSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();
        System.out.println("");
        
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar CSS");
        listaTarefas.adicionarTarefa("Estudar Linux");
        listaTarefas.adicionarTarefa("Estudar HTML");

        listaTarefas.exibirTarefas();
        System.out.println("Numero de tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("");
        
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Estudar CSS");
        listaTarefas.marcarTarefaConcluida("Estudar Linux");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("");

        listaTarefas.marcarTarefaPendente("Estudar Linux");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("");

        //listaTarefas.removerTarefa("Estudar Java");

        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();



    }

}
