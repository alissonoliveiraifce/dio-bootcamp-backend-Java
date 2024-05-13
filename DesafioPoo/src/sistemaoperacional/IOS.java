package sistemaoperacional;

import apps.navegador.NavegadorInternet;
import apps.player.ReprodutorMusical;
import apps.telefone.AparelhoTelefonico;

    public class IOS implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

        @Override
        public void adicionarNovaAba() {
            System.out.println("Safari IOS: Aba adicionada");
            
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Safari IOS: Página atualizada");
            
        }

        @Override
        public void exibirPagina() {
            System.out.println("Safari IOS: Página exibida");
            
        }

        @Override
        public void pausar() {
            System.out.println("Apple Music: Música pausada");
            
        }

        @Override
        public void selecionarMusica() {
            System.out.println("Apple Music: Música selecionada");
            
        }

        @Override
        public void tocar() {
            System.out.println("Apple Music: Música tocando");
            
        }

        @Override
        public void fazerChamada() {
            System.out.println("Ligação realizada via IOS");
            
        }

        @Override
        public void iniciarCorreioDeVoz() {
            System.out.println("Correio de voz iniciado via IOS");
            
        }

        @Override
        public void receberChamada() {
            System.out.println("Chamada recebida via IOS");
            
        }
        

        
    }