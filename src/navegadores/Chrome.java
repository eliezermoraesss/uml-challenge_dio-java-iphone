package navegadores;

import exceptions.ResourceNotFoundException;
import interfaces.NavegadorInternet;

import java.util.HashSet;
import java.util.Set;

public class Chrome implements NavegadorInternet {

    private Set<Favorito> favoritos = new HashSet<>();

    @Override
    public String adicionarFavorito(String url) {
        favoritos.add(new Favorito(url));
        return url + " adicionada com sucesso no CHROME!";
    }

    @Override
    public String removerFavorito(String url) {
        Favorito urlParaRemover = null;
        if (!favoritos.isEmpty()) {
            for (Favorito favorito : favoritos) {
                if(favorito.getUrl().equals(url)){
                    urlParaRemover = favorito;
                    favoritos.remove(urlParaRemover);
                    return url + " removida com sucesso pelo CHROME!";
                }
            }
        } else {
            throw new ResourceNotFoundException("A lista de favoritos está vazia");
        }
        return url + " não encontrada pelo CHROME!";
    }

    @Override
    public void exibirFavoritos() {
        if(!favoritos.isEmpty()) {
            System.out.println(favoritos);
        } else {
            throw new ResourceNotFoundException("A lista de Favoritos do CHROME está vazia");
        }
    }

    @Override
    public void exibirQuantidadeFavoritos() {
        System.out.println("A lista de Favoritos do CHROME contem " + favoritos.size() + " urls");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " pelo navegador CHROME");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página pelo navegador CHROME");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando página " + url + " pelo navegador CHROME");
    }

    @Override
    public String toString() {
        return "Chrome{" +
                "favoritos=" + favoritos +
                '}';
    }
}
