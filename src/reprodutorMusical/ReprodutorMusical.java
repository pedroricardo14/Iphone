package reprodutorMusical;

import reprodutorMusical.acoes.Pausar;
import reprodutorMusical.acoes.Selecionar;
import reprodutorMusical.acoes.Tocar;

public class ReprodutorMusical implements Pausar, Selecionar, Tocar{
    public void pausar() {
        System.out.println("Pausando a música");
    }

    public void selecionar() {
        System.out.println("Selecionar a música");
    }

    public void tocar() {
        System.out.println("Tocar a música");
    }
}
