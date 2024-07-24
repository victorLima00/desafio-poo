package equipamento;

import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class Equipamento implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    public void ligar(String numero){
        System.out.println("Ligando para o número: " + numero + ".");
    };
    public void atender(){
        System.out.println("Atendendo a ligação.");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    };
    public void exibirPagina(String url){
        System.out.println("Exibindo url: " + url + ".");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    };
    public void tocar(){
        System.out.println("Tocando a música.");
    };
    public void pausar(){
        System.out.println("Pausando a música.");
    };
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a música: " + musica + ".");
    };
}
