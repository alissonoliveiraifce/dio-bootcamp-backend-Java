package apps.telefone;

public class Discador implements AparelhoTelefonico {
    public void fazerChamada() {
        System.out.println("Fazendo chamada");
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
