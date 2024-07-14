package navegadorInternet;

import navegadorInternet.acoes.NovaAba;
import navegadorInternet.acoes.AtualizarPagina;
import navegadorInternet.acoes.ExibirPagina;

public class NavegadorInternet implements NovaAba, AtualizarPagina, ExibirPagina {
    public void adicionar() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizar() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void exibir(){
        System.out.println("EXIBINDO PÁGINA");
    }




}
