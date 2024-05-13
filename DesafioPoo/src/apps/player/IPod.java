package apps.player;

public class IPod implements ReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando música no iPod");
    }

    public void pausar() {
        System.out.println("Pausando música no iPod");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música no iPod");
    }
    
}
