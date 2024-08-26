package aparelho;
import fone.Telefone;
import internet.NavegadorInternet;
import musica.TocadorMusica;

public class IPhone implements Telefone, TocadorMusica, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo página " + url);     
    }

    @Override
    public void adicionarAba(String url) {
        // TODO Auto-generated method stub
        System.out.println("Abrindo nova aba " + url);
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atuaizando página");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando música.");
    }

    @Override
    public void escolherMusica() {
        // TODO Auto-generated method stub
        System.out.println("Escolhendo música");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Fazendo ligação " + numero);
    }

    @Override
    public void atender(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Atendendo ligação " + numero);
    }

    @Override
    public void correioVoz(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz " + numero);
    }
    
}
