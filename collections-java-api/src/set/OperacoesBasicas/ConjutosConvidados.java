package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutosConvidados {
    private Set<Convidado> convidadoSet;

    public ConjutosConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codCovidado) {
        convidadoSet.add(new Convidado(nome, codCovidado));
    }

    public void removerConvidadoPorCodConvite (int codCoonvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodCovidado() == codCoonvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void imprimirConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjutosConvidados conjutosConvidados = new ConjutosConvidados();
        
        conjutosConvidados.imprimirConvidados();

        conjutosConvidados.adicionarConvidado("João", 1);
        conjutosConvidados.adicionarConvidado("Maria", 2);
        conjutosConvidados.adicionarConvidado("José", 3);
        conjutosConvidados.adicionarConvidado("Ana", 4);
        conjutosConvidados.adicionarConvidado("Pedro", 5);
        conjutosConvidados.adicionarConvidado("Paula", 6);
        conjutosConvidados.adicionarConvidado("Carlos", 7);
        conjutosConvidados.adicionarConvidado("Marta", 8);
        conjutosConvidados.adicionarConvidado("Lucas", 9);
        conjutosConvidados.adicionarConvidado("Lúcia", 10);
        conjutosConvidados.imprimirConvidados();
        
        System.out.println("Quantidade de convidados: " + conjutosConvidados.contarConvidados());
        
        conjutosConvidados.removerConvidadoPorCodConvite(5);
        conjutosConvidados.removerConvidadoPorCodConvite(7);
        conjutosConvidados.removerConvidadoPorCodConvite(10);
        conjutosConvidados.imprimirConvidados();
        
        System.out.println("Quantidade de convidados: " + conjutosConvidados.contarConvidados());
    }

}
