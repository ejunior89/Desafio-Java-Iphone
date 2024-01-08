public class IPhone implements MusicPlayer, Phone, InternetBrowser {
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void ligar() {
        System.out.println("Realizando chamada telefônica...");
    }

    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página na internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        // Simulação do uso das funcionalidades
        iPhone.tocar();
        iPhone.ligar();
        iPhone.exibirPagina();
    }
}
