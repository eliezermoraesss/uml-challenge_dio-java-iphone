package navegadores;

import exceptions.ResourceNotFoundException;
import interfaces.NavegadorInternet;

import java.util.HashSet;
import java.util.Set;

public class Safari implements NavegadorInternet {

    private Set<Favorito> favoritos = new HashSet<>();

    @Override
    public String adicionarFavorito(String url) {
        favoritos.add(new Favorito(url));
        return url + " adicionada com sucesso no SAFARI!";
    }

    @Override
    public String removerFavorito(String url) {
        Favorito urlParaRemover = null;
        if (!favoritos.isEmpty()) {
            for (Favorito favorito : favoritos) {
                if(favorito.getUrl().equals(url)){
                    urlParaRemover = favorito;
                    break;
                }
            }
            favoritos.remove(urlParaRemover);
        } else {
            throw new ResourceNotFoundException("A lista de favoritos está vazia");
        }
        return url + " removida com sucesso pelo SAFARI!";
    }

    @Override
    public void exibirFavoritos() {
        if(!favoritos.isEmpty()) {
            System.out.println(favoritos);
        } else {
            throw new ResourceNotFoundException("A lista de Favoritos do SAFARI está vazia");
        }
    }

    @Override
    public void exibirQuantidadeFavoritos() {
        System.out.println("A lista de Favoritos do SAFARI contem " + favoritos.size() + " urls");
    }

    @Override
    public void exibirPágina(String url) {
        System.out.println("Exibindo página " + url + " pelo navegador SAFARI");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página pelo navegador SAFARI");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando página " + url + " pelo navegador SAFARI");
    }

    @Override
    public String toString() {
        return "Safari{" +
                "favoritos=" + favoritos +
                '}';
    }
}
