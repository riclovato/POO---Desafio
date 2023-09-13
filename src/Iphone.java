import interfaces.Navegador;
import interfaces.Phone;
import interfaces.ReprodutorMusica;

public class Iphone implements Phone, ReprodutorMusica, Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página pelo Navegador no Iphone.");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Aba adicionada no navegador do Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página do navegador no Iphone.");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação pelo Iphone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação no Iphone.");
    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio de voz no Iphone.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música pelo Iphone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música pelo Iphone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música pelo Iphone.");
    }
}