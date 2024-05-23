package set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codCoonvite;

    public Convidado(String nome, int codCovidado) {
        this.nome = nome;
        this.codCoonvite = codCovidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodCovidado() {
        return codCoonvite;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codCoonvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codCoonvite != other.codCoonvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codCovidado=" + codCoonvite +
                '}';
    }
}
