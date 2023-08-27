package navegadores;

import interfaces.NavegadorInternet;

import java.util.HashSet;
import java.util.Set;

public class Safari implements NavegadorInternet {

    private Set<Favorito> favoritos = new HashSet<>();

    @Override
    public void exibirPágina() {

        System.out.println("Exibindo página pelo navegador Safari");
    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Adicionando nova página pelo navegador Safari");
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando página pelo navegador Safari");
    }
}
