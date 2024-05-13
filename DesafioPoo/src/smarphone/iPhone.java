package smarphone;

import apps.player.IPod;
import apps.player.ReprodutorMusical;
import apps.telefone.Discador;
import sistemaoperacional.IOS;
import apps.navegador.Safari;

public  class iPhone  {

    public static void main(String[] args) {
        
        System.out.println("iPhone");
        System.out.println("");
        IOS iphone = new IOS();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.fazerChamada();
        iphone.receberChamada();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("");
        
        IPod ipod = new IPod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();
        System.out.println("");
        
        Discador discador = new Discador();
        discador.fazerChamada();
        discador.receberChamada();
        discador.iniciarCorreioDeVoz();
        System.out.println("");
        
        Safari safari = new Safari();
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        System.out.println("");

        ReprodutorMusical reprodutor = new IOS();
        reprodutor.tocar();

    }
    
}