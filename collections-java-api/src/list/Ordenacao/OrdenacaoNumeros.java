//exercicio proposto no curso de Java da Digital Innovation One

package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscedente () {
        List<Integer> ordenadosAscedente = new ArrayList<>(this.numeros);
        
        if (!numeros.isEmpty()) {
            Collections.sort(ordenadosAscedente);
            return ordenadosAscedente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescedente () {
        List<Integer> ordenadosDescedente = new ArrayList<>(this.numeros);
        
        if (!numeros.isEmpty()) {
            ordenadosDescedente.sort(Collections.reverseOrder());
            return ordenadosDescedente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros() {
       if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
       } else {
            System.out.println("Lista vazia");
       }
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(1);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscedente());

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarDescedente());

        
    }

}
