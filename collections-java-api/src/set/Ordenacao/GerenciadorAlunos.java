package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno (long matricula, String nome, double nota) {
        alunosSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno (long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunosSet) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
                break;
            }
        }

        alunosSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome () {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public Set<Aluno> exibiAlunosPorNota () {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosPorNota);
        return alunosPorNota;
    }

    public void exibirAlunos () {
        if (alunosSet.size() > 0) {
            System.out.println(alunosSet);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();
        
        alunos.exibirAlunos();
        System.out.println("");

        alunos.adicionarAluno(9087L, "João", 8.7);
        alunos.adicionarAluno(9086L, "Maria", 9.7);
        alunos.adicionarAluno(9085L, "Ana", 8.3);
        alunos.adicionarAluno(9084L, "José", 6.7);
        alunos.adicionarAluno(9083L, "Mariana", 10.0);

        alunos.exibirAlunos();
        System.out.println("");

        alunos.removerAluno(9083L);
        alunos.removerAluno(9087L);

        alunos.exibirAlunos();
        System.out.println("");

        alunos.exibiAlunosPorNota();
        System.out.println("");

        alunos.exibirAlunosPorNome();
        System.out.println("");
        


    }    

}
