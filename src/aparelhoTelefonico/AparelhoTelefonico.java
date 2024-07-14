package aparelhoTelefonico;

import aparelhoTelefonico.acoes.Atender;
import aparelhoTelefonico.acoes.IniciarCorreioVoz;
import aparelhoTelefonico.acoes.Ligar;

public class AparelhoTelefonico implements Atender, IniciarCorreioVoz, Ligar {
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void ligar() {
        System.out.println("LIGANDO");
    }
}
