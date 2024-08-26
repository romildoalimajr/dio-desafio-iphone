import aparelho.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        iPhone.exibirPagina("dio.me");
        iPhone.adicionarAba("dio.me/login");
        iPhone.atualizarPagina();

        System.out.println("\n");

        iPhone.ligar("81994701058");
        iPhone.atender("81994701058");
        iPhone.correioVoz("81994701058");

        System.out.println("\n");

        iPhone.escolherMusica();
        iPhone.tocar();
        iPhone.pausar();

        

    }
}
