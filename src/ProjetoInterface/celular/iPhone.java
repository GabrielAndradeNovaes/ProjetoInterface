package ProjetoInterface.celular;

import ProjetoInterface.internet.NavegadorInternet;
import ProjetoInterface.musica.ReprodutorMusical;
import ProjetoInterface.telefone.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
