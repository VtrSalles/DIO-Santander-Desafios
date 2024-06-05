import apps.interfaces.AparelhoTelefonico;
import apps.interfaces.NavegadorInternet;
import apps.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        String appEmUso = "telefone";
        if(appEmUso.equals("telefone")) {
            iphone.atender();
            iphone.ligar("(99) 99999-9999");
            iphone.iniciarCorreioDeVoz();
        } else if (appEmUso.equals("navegador")) {
            iphone.exibirPagina("https://web.dio.me");
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
        } else if (appEmUso.equals("ipod")) {
            iphone.selecionarMusica("Alguma Musica");
            iphone.tocar();
            iphone.pausar();
        }
    }



    public void ligar(String number) {
        System.out.println("Realizando chamada para ".concat(number));
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica ".concat(musica).concat("para tocar"));
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina ".concat(url));
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar Página");
    }
}