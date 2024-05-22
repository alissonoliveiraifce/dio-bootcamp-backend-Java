//exercicio proposto no curso de Java da Digital Innovation One
//correção

package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int i : listNumeros) {
            soma += i;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listNumeros.isEmpty()) { 
            for (int i : listNumeros) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listNumeros.isEmpty()) {
            for (int i : listNumeros) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (listNumeros.isEmpty()) {
            System.out.println("A lista de números está vazia.");
        } else {
            System.out.println(listNumeros);
        }
        
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(10);
        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(20);
        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(5);
        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
