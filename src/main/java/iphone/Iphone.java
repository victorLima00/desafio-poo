package iphone;

import equipamento.Equipamento;
import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento();
        equipamento.ligar("970707070");
        equipamento.atender();
        equipamento.iniciarCorreioVoz();

        equipamento.exibirPagina("www.google.com.br");
        equipamento.adicionarNovaAba();
        equipamento.atualizarPagina();

        equipamento.tocar();
        equipamento.pausar();
        equipamento.selecionarMusica("Shark - Imagine Dragons");
    }
}
