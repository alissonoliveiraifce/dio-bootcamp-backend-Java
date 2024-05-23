package set.Pesquisa;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Telefone: " + this.telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contato) {
            Contato contato = (Contato) obj;
            return this.nome.equals(contato.getNome()) && this.telefone.equals(contato.getTelefone());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode() + this.telefone.hashCode();
    }

    
}
